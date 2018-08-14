package cn.happymall;

import javax.jms.Destination;

import cn.happymall.jms.JMSProducer;
import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.script.DefaultRedisScript;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;

/**
 * Created by chenlili on 18/4/12.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootJmsApplicationTests {
    @Autowired
    private JMSProducer jmsProducer;

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    //@Test
    public void contextLoads() throws InterruptedException {
        Destination destination = new ActiveMQQueue("queue.run");
        for (int i = 0; i < 100; i++) {
            jmsProducer.sendMessage(destination, "springboot mq !!");
        }
    }

    @Test
    public void redisAscyLock() throws InterruptedException {
        DefaultRedisScript<String> redisScript =new DefaultRedisScript<>();
        String script = "if redis.call('get', KEYS[1]) == ARGV[1] then return redis.call('del', KEYS[1]) else return '0' end";
        redisScript.setScriptText(script);
//        redisScript.setLocation(new ClassPathResource("lua/genID.lua"));
        redisScript.setResultType(String.class);
        for (int i = 0; i < 100; i++) {
            Object result = redisTemplate.execute(redisScript, Collections.singletonList("lockKey"), "test");
            System.out.println(result);
        }

    }
}

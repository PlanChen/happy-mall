package cn.happymall.redis.lock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * Created by chenlili on 18/4/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRedisLockTest {

    private static Logger logger = LoggerFactory.getLogger(RedisLock.class);

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Test
    public void redisLock() {
        RedisLock redisLock = new RedisLock(redisTemplate, "redisLock:" + 1 % 10, 5 * 60, 500);
        try {
            long now = System.currentTimeMillis();
            if (redisLock.tryLock()) {
                logger.info("=" + (System.currentTimeMillis() - now));
                // TODO 获取到锁要执行的代码块
            } else {
                // TODO 获取到锁要执行的代码块
            }
        } catch (Exception e) {
            logger.info(e.getMessage(), e);
        } finally {
            redisLock.unlock();
        }
    }
}

package cn.happymall.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * Created by chenlili on 18/4/15.
 */
@Component
public class JMSConsumer {
    private final static Logger logger = LoggerFactory.getLogger(JMSConsumer.class);

    @JmsListener(destination = "queue.run")
    public void receiveQueue(String msg) {
        logger.info("接收到消息：{}",msg);
    }
}

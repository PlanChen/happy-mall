package cn.happymall.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Destination;

/**
 * Created by chenlili on 18/4/15.
 */
@Component
public class JMSProducer {
    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendMessage(Destination destination, String message) {
        this.jmsTemplate.convertAndSend(destination,message);
    }

}

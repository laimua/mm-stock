/**
 * Copyright: Copyright (c) 2020 
 * Company:Siemens Power Automation Ltd. 
 * 
 * @author Meng1
 * @date 2020年4月28日 下午7:57:19
 * @version V1.0.0
 */
package com.mm.stock.module.activemq.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.mm.stock.common.constants.ActiveMQConstants;

/**
  * @ClassName: ConsumerListener
  * @Description: TODO
  * @author Meng1
  * @date 2020年4月28日 下午7:57:19
  *
  */
@Component
public class ConsumerListener {
    
    @JmsListener(destination = ActiveMQConstants.QUEUE_1, containerFactory = ActiveMQConstants.QUEUE_LISTENER)
    public void receivingQueue1Msg(String message) {
        this.printMsg("Consumer queue-1 receives message: " + message);
    }
    
    @JmsListener(destination = ActiveMQConstants.QUEUE_2, containerFactory = ActiveMQConstants.QUEUE_LISTENER)
    public void receivingQueue2Msg(String message) {
        this.printMsg("Consumer queue-2 receives message: " + message);
    }
    
    @JmsListener(destination = ActiveMQConstants.QUEUE_3, containerFactory = ActiveMQConstants.QUEUE_LISTENER)
    public void receivingQueue3Msg(String message) {
        this.printMsg("Consumer queue-3 receives message: " + message);
    }
    
    @JmsListener(destination = ActiveMQConstants.TOPIC_1, containerFactory = ActiveMQConstants.TOPIC_LISTENER)
    public void receivingTopic1Msg(String message) {
        this.printMsg("Consumer topic-1 receives message: " + message);
    }
    
    @JmsListener(destination = ActiveMQConstants.TOPIC_2, containerFactory = ActiveMQConstants.TOPIC_LISTENER)
    public void receivingTopic2Msg(String message) {
        this.printMsg("Consumer topic-2 receives message: " + message);
    }
    
    @JmsListener(destination = ActiveMQConstants.TOPIC_3, containerFactory = ActiveMQConstants.TOPIC_LISTENER)
    public void receivingTopic3Msg(String message) {
        this.printMsg("Consumer topic-3 receives message: " + message);
    }
    
    private void printMsg(String msg) {
        System.out.println(msg);
    }

}

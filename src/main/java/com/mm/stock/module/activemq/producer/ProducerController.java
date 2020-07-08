/**
 * Copyright: Copyright (c) 2020 
 * Company:Siemens Power Automation Ltd. 
 * 
 * @author Meng1
 * @date 2020年4月28日 下午5:33:45
 * @version V1.0.0
 */
package com.mm.stock.module.activemq.producer;

import java.util.UUID;

import javax.jms.Destination;
import javax.jms.Queue;
import javax.jms.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mm.stock.common.base.BaseController;
import com.mm.stock.common.base.SysResult;

/**
  * @ClassName: ProducerController
  * @Description: TODO
  * @author Meng1
  * @date 2020年4月28日 下午5:33:45
  *
  */
@RestController
@RequestMapping("/producer")
public class ProducerController extends BaseController{
    
    @Autowired
    private Queue queue_1;
    @Autowired
    private Queue queue_2;
    @Autowired
    private Queue queue_3;
    
    @Autowired
    private Topic topic_1;
    @Autowired
    private Topic topic_2;
    @Autowired
    private Topic topic_3;
    
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
    
    @PostMapping("/queue-1")
    public SysResult sendQueue1() {
        for (int i = 0; i < 5; i++) {
            this.sendMsg(queue_1, "Producer queue-1 message: NO." + i + UUID.randomUUID());
        }
        return getResult();
    }
    
    @PostMapping("/queue-2")
    public SysResult sendQueue2() {
        for (int i = 0; i < 5; i++) {
            this.sendMsg(queue_2, "Producer queue-2 message: NO." + i + UUID.randomUUID());
        }
        return getResult();
    }
    
    @PostMapping("/queue-3")
    public SysResult sendQueue3() {
        for (int i = 0; i < 5; i++) {
            this.sendMsg(queue_3, "Producer queue-3 message: NO." + i + UUID.randomUUID());
        }
        return getResult();
    }
    
    @PostMapping("/topic-1")
    public SysResult sendTopic1() {
        for (int i = 0; i < 5; i++) {
            this.sendMsg(topic_1, "Producer topic-1 message: NO." + i + UUID.randomUUID());
        }
        return getResult();
    }
    
    @PostMapping("/topic-2")
    public SysResult sendTopic2() {
        for (int i = 0; i < 5; i++) {
            this.sendMsg(topic_2, "Producer topic-2 message: NO." + i + UUID.randomUUID());
        }
        return getResult();
    }
    
    @PostMapping("/topic-3")
    public SysResult sendTopic3() {
        for (int i = 0; i < 5; i++) {
            this.sendMsg(topic_3, "Producer topic-3 message: NO." + i + UUID.randomUUID());
        }
        return getResult();
    }
    
    private void sendMsg(Destination destination, String message) {
        System.out.println(message);
        jmsMessagingTemplate.convertAndSend(destination, message);
    }

}

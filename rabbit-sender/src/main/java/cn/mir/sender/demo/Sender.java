package cn.mir.sender.demo;

import cn.mir.rabbitmq.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 消息发送类
 * <p>Create time: 1/16/2019 2:55 PM</p>
 *
 * @author 周光兵
 **/
@Component
public class Sender {
    /**
     * 日志
     */
    private final Logger logger = LoggerFactory.getLogger(Sender.class);

    /**
     * Rabbit模板
     */
    private final AmqpTemplate amqpTemplate;

    @Autowired
    public Sender(AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }

    public void send() {
        this.logger.info("发送消息");

        this.amqpTemplate.convertAndSend("queue", "Hello World!!! This is a rabbitMQ.");
    }

    public void sendUserInformation() {
        this.logger.info("发送用户信息");

        User user = new User();
        user.setName("周先生");
        user.setRemark("这是个高手");

        this.amqpTemplate.convertAndSend("user", user);
    }
}
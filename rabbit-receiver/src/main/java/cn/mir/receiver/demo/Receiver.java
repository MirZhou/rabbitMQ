package cn.mir.receiver.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消息接收类
 * <p>Create time: 1/16/2019 3:51 PM</p>
 *
 * @author 周光兵
 **/
@Component
public class Receiver {
    /**
     * 日志
     */
    private final Logger logger = LoggerFactory.getLogger(Receiver.class);

    @RabbitListener(queues = {"queue", "mir"})
    public void receiver(String message) {
        this.logger.debug("Receive: {}", message);
    }
}
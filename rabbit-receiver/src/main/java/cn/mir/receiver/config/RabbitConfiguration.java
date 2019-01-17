package cn.mir.receiver.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * RabbitMQ消息队列配置
 * <p>Create time: 1/16/2019 2:51 PM</p>
 *
 * @author 周光兵
 **/
@Configuration
public class RabbitConfiguration {
    @Bean
    public Queue queue() {
        return new Queue("queue");
    }
}
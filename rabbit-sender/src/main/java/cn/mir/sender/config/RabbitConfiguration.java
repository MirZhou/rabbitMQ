package cn.mir.sender.config;

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
        // 是否持久化
        boolean durable = true;
        // 仅创建者可以使用的私有队列，断开后自动删除
        boolean exclusive = false;
        // 当所有消费客户端连接断开后，是否自动删除队列
        boolean autoDelete = false;

        return new Queue("queue", durable, exclusive, autoDelete);
    }

    @Bean
    public Queue queueUser() {
        return new Queue("user");
    }
}
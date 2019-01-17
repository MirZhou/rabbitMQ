package cn.mir.sender;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 应用启动入口
 * <p>Create time: 1/16/2019 10:39 AM</p>
 *
 * @author 周光兵
 **/
@SpringBootApplication
@EnableRabbit
public class RabbitSenderApplication {
    public static void main(String[] args) {
        SpringApplication.run(RabbitSenderApplication.class, args);
    }
}
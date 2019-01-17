package cn.mir.receiver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 应用启动入口
 * <p>Create time: 1/15/2019 4:14 PM</p>
 *
 * @author 周光兵
 **/
@SpringBootApplication
public class RabbitReceiverApplication {
    public static void main(String[] args) {
        SpringApplication.run(RabbitReceiverApplication.class, args);
    }
}
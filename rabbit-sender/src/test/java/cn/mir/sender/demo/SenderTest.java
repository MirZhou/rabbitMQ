package cn.mir.sender.demo;

import cn.mir.sender.RabbitSenderApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = RabbitSenderApplication.class)
@RunWith(SpringRunner.class)
public class SenderTest {
    @Autowired
    private Sender sender;

    @Test
    public void testSend() {
        this.sender.send();
    }

    @Test
    public void testSendUserInformation() {
        this.sender.sendUserInformation();
    }
}
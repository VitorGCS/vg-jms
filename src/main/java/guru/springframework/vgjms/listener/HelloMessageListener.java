package guru.springframework.vgjms.listener;

import guru.springframework.vgjms.config.JmsConfig;
import guru.springframework.vgjms.model.HelloWorldMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import javax.jms.Message;

@Component
public class HelloMessageListener {

    @JmsListener(destination = JmsConfig.MY_QUEUE)
    public void listener(@Payload HelloWorldMessage helloWorldMessage,
                         @Headers MessageHeaders headers,
                         Message message){
        System.out.println("I Got a Message !!!!!!");

        System.out.println(helloWorldMessage);
    }
}

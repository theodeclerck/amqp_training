package fr.lernejo.chat;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class Launcher {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Launcher.class);
        RabbitTemplate rabbitTemplate = context.getBean(RabbitTemplate.class);
        Scanner entry = new Scanner(System.in);
        String send;

        do{
            send = entry.nextLine();        
            rabbitTemplate.convertAndSend("chat_messages", send);
            System.out.println("Message sent");
        }while (!send.equals("q"));
        context.close();
    }
}

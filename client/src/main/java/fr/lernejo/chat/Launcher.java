package fr.lernejo.chat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Launcher {
    public static void main(String[] args) {
        SpringApplication.run(Launcher.class, args);
        Scanner entry = new Scanner(System.in);
        String s;
        do{
            s = entry.next();
            System.out.println("Valentin le nulos");
        }while (!s.equals("q"));
    }
}

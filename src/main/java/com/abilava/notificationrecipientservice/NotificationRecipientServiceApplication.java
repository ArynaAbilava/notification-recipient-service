package com.abilava.notificationrecipientservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class NotificationRecipientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotificationRecipientServiceApplication.class, args);
    }

}

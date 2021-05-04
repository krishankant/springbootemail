package com.springlearning;

import com.springlearning.services.MailSenderSpring;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.springlearning.model.EMail;

@SpringBootApplication
public class EmailApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext =  SpringApplication.run(EmailApplication.class, args);
    }
}

package com.example.LibraryManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import java.net.UnknownHostException;

@SpringBootApplication(scanBasePackages="com.example")
@Configuration
public class WebApplication {

   public static void main(String[] args) throws UnknownHostException{
       SpringApplication.run(WebApplication.class,args);
   }
}

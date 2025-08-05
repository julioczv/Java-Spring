package com.julio.demo.configuration;

import com.julio.demo.service.HelloWorldService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Configuration define Beans, Beans são instancias de classes que nao está no spring
@Configuration
public class HelloConfiguration {
    @Bean
    public String helloWorld() {
        return "Hello World!";
    }
}

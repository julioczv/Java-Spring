package com.julio.demo.service;

import org.springframework.stereotype.Service;

@Service // Indica para o spring que a class é uma classe de service que está sendo usado para o spring
public class HelloWorldService {

    public String helloWorld(String name) {
        return "Hello Teste" + name;
    }
}

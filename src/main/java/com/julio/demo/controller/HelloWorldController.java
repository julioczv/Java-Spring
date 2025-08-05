package com.julio.demo.controller;

import com.julio.demo.domain.User;
import com.julio.demo.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController //Essa anotação indica que isso é um controller
// rest ele combina o Controller com o ResponseBody = retorna para o cliente HTTP

//Statefull -> o estado de cada cliente é mantido no servidor

//Stateless -> a cada nova requisição eu recebo todas as informações que eu preciso para
// fazer aquela funcionalidade que o cliente está pedindo
@RequestMapping("/hello-world")
public class HelloWorldController {
    // post, get, delete, put, patch, options, head

    @Autowired // Isso "instancia" a classe criada e retorna sem precisar fazer um construtor
    private HelloWorldService helloWorldService;


    // Esse endpoint criado vai ser chamado com o valor // GET/hello-world
    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld("Julio");
    }

    @PostMapping("/{id}")
    public String helloWordPost(@PathVariable("id") String id, @RequestParam(value = "filter", defaultValue = "nenhum") String filter, @RequestBody User body) {
        return "Produto adicionado com sucesso!" + id;
    }


}

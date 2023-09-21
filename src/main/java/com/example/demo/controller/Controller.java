package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping("/teste-cd")
    public String testeCd(){
        return "Teste bem sucedido!";
    }
}

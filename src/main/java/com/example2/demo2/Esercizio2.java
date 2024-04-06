package com.example2.demo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/es2")
public class Esercizio2 {
    @GetMapping(path = "/saluto")
    public ClasseSaluto saluto(
            @RequestParam String nome,
            @RequestParam String provincia,
            @RequestParam String saluto) {
        return new ClasseSaluto(nome, provincia, saluto);
    }
}

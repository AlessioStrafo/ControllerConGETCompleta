package com.example2.demo2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/es2")
public class Esercizio2Controller {
    @GetMapping(path = "/saluto/{regione}")
    public Saluto saluto(
            @RequestParam String nome,
            @PathVariable String regione) {
        return new Saluto(nome, regione);
    }
}

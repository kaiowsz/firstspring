package app.vercel.kaiowsz.frstspring.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// anotations.

@RestController
@RequestMapping("/primeiroController")

public class PrimeiroController {
    @GetMapping("/first")
    public String queryParams(@RequestParam String id) {
        return "método query params retornando: " + id;
    }


    @GetMapping("/second/{id}")
    public String second(@PathVariable(name = "id") String userId) {
        return "Welcome to the second route. Your id: " + userId;
    }

    @GetMapping("/third")
    public String third(@RequestParam Map<String, String> keys) {
        return "Third param with all keys: " + keys.values();
    }

    @PostMapping("/fourth")
    public String fourth(@RequestBody Usuario usuario) {
        return "Your username: " + usuario.username + ". Your age: " + usuario.idade;
    }

    record Usuario(String username, int idade) {}
}   

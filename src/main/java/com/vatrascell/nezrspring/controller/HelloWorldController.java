package com.vatrascell.nezrspring.controller;

import com.vatrascell.nezrspring.model.CreateHelloDto;
import com.vatrascell.nezrspring.service.HelloService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
@AllArgsConstructor
public class HelloWorldController {

    private HelloService helloService;

    @GetMapping
    public String firstPage() {
        return "Hello World";
    }

    @PostMapping
    public ResponseEntity<?> addItem(@RequestBody CreateHelloDto dto) {
        return ResponseEntity.ok(helloService.addHello(dto.getNumber()));
    }

    @GetMapping("/list")
    public ResponseEntity<?> getItems() {
        return ResponseEntity.ok(helloService.getHellos());
    }

}
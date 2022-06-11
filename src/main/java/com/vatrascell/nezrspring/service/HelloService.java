package com.vatrascell.nezrspring.service;

import com.vatrascell.nezrspring.model.Hello;
import com.vatrascell.nezrspring.repository.HelloRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class HelloService {

    private HelloRepository helloRepository;

    public Hello addHello(int number) {
        Hello hello = new Hello();
        hello.setNumber(number);

        return helloRepository.save(hello);
    }

    public List<Hello> getHellos() {
        List<Hello> result = new ArrayList<>();
        helloRepository.findAll().forEach(result::add);
        return result;
    }
}

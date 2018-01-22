package com.example.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    PersonRepo personRepo;

    @RequestMapping("/")
    public List<Person>findall() {
        return personRepo.findAll();
    }
}

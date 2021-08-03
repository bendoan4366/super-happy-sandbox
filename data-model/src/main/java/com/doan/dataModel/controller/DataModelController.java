package com.doan.dataModel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataModelController {

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello there! This is a place holder to return data entity schemas";
    }

    @GetMapping("/hello-world/{name}")
    public String helloWorld(@PathVariable String name) {
        return "Hello there " + name + "! This is a place holder to return data entity schemas";
    }
}

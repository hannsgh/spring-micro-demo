package ru.hannsgh.eurekaclient.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/new")
public class TestController {

    @GetMapping("/hello")
    public String test() {
        return "Hello";
    }
}

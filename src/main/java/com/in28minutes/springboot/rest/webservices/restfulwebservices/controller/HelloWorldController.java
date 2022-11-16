package com.in28minutes.springboot.rest.webservices.restfulwebservices.controller;

import com.in28minutes.springboot.rest.webservices.restfulwebservices.bean.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping( path = "/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping( path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }

    @GetMapping( path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }
}

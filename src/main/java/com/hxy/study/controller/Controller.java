package com.hxy.study.controller;

import com.hxy.study.controller.dto.Demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {

    @GetMapping("main")
    public String main() {
        return "Hello world!";
    }

    @GetMapping("demo")
    public Demo demo() {
        return new Demo("huangxiangyu", 18);
    }

}

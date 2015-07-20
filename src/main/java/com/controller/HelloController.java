package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String test() {
        return "Rest test";
    }
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test2() {
        return "Rest test2";
    }
}

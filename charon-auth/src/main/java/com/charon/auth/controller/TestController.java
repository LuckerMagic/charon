package com.charon.auth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by sl
 * @date 2020/11/16 16:03
 */
@RestController
public class TestController {

    @RequestMapping("/")
    public String home() {
        return "Hello World";
    }
}

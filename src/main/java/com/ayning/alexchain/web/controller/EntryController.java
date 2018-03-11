package com.ayning.alexchain.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by 10127 on 2018/3/11
 */
@RestController
public class EntryController {

    @RequestMapping("/")
    public String hello() {
        return "Welcome to Alex Chain";
    }

}

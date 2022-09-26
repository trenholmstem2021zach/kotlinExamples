package com.example.kotlintest.controller;

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController //
public class HelloController {
    @GetMapping("/")
    fun getHomePage(@RequestParam name: String? = "you"): String {
         return "hello World ${name} "
    }
}

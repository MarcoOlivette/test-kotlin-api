package com.example.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class hello{
    
    @GetMapping("/oie")
    fun hello():String{
        return "oiem mundinho"
    }
}
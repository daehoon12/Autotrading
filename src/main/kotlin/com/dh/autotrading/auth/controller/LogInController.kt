package com.dh.autotrading.auth.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class LogInController {

    @GetMapping("/hello")
    fun testSwagger(): String
    ="Hello"
}

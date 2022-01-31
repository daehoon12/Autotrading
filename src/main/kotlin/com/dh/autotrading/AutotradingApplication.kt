package com.dh.autotrading

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.slf4j.Logger
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@SpringBootApplication
@EnableWebMvc
// test commit
class AutotradingApplication

fun main(args: Array<String>) {
    runApplication<AutotradingApplication>(*args)
}

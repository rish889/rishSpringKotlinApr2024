package com.rish889.rishSpringKotlinApr2024

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class RishSpringKotlinApr2024Application

fun main(args: Array<String>) {
    runApplication<RishSpringKotlinApr2024Application>(*args)
}

@RestController
class MessageController {
    @GetMapping("/") //http://localhost:8080?name=John
    fun index(@RequestParam("name") name: String) = "Hello, $name!"
}

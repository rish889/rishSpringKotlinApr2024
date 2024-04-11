package com.rish889.rishSpringKotlinApr2024

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class RishSpringKotlinApr2024Application

fun main(args: Array<String>) {
    runApplication<RishSpringKotlinApr2024Application>(*args)
}

@RestController
class MessageController {
    @GetMapping("/") //http://localhost:8080
    fun index() = listOf(
        Message("1", "Hello!"),
        Message("2", "Bonjour!"),
        Message("3", "Privet!"),
    )
}

data class Message(val id: String?, val text: String)

package com.peya.example.rest


import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {

    @GetMapping("/greeting")
    fun greeting() =
            "Hello you have started the Peya example with Gradle+Kotlin+Spring"

}

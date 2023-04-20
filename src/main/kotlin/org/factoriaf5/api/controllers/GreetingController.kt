package org.factoriaf5.api.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {

    @GetMapping("/greeting")
    fun listGreeting ():String {
        return "Hola Minerva"
    }
}


annotation class GetController

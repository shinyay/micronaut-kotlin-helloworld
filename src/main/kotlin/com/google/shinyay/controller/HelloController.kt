package com.google.shinyay.controller

import io.micronaut.http.annotation.Controller
import io.reactivex.Single
import javax.validation.constraints.NotBlank

@Controller("/")
class HelloController {
    fun hello(@NotBlank name: String) = Single.just("Hello $name !")
}
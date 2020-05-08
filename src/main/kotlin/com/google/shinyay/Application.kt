package com.google.shinyay

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("com.google.shinyay")
                .mainClass(Application.javaClass)
                .start()
    }
}
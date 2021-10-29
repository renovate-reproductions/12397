package com.huisam.renovate

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RenovateApiApplication

fun main(args: Array<String>) {
    runApplication<RenovateApiApplication>(*args)
}
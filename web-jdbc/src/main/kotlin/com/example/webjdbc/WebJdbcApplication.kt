package com.example.webjdbc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebJdbcApplication

fun main(args: Array<String>) {
	runApplication<WebJdbcApplication>(*args)
}

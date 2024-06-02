package com.example.webfluxr2dbc.controller

import org.springframework.data.r2dbc.core.R2dbcEntityTemplate
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(private val r2dbcEntityTemplate: R2dbcEntityTemplate) {

    @GetMapping("/api/ping")
    fun ping() = "PONG"

    @GetMapping("/api/db")
    fun db() = r2dbcEntityTemplate.databaseClient.sql("SELECT 1").then()
}

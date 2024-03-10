package me.aftermoon.kubernetes_test.domains.test

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/test")
class TestController {
    @GetMapping("")
    fun test(): ResponseEntity<String> {
        return ResponseEntity.ok("Hello")
    }
}
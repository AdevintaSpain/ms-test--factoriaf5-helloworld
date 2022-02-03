package com.adevinta.mstestfactoriaf5helloworld.infrastructure.controller

import com.adevinta.mstestfactoriaf5helloworld.application.HelloWorldService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class HelloWorldController(
  private val helloWorldService: HelloWorldService
) {

  @GetMapping
  fun sayHello(): String {
    return helloWorldService.hello()
  }
}

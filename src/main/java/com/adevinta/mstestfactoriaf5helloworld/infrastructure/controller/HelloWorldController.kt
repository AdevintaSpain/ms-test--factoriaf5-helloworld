package com.adevinta.mstestfactoriaf5helloworld.infrastructure.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class HelloWorldController {
  @GetMapping
  @Suppress("FunctionOnlyReturningConstant")
  fun sayHello(): String = "Hello Coders!!!"
}

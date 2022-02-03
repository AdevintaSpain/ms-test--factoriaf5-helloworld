package com.adevinta.mstestfactoriaf5helloworld.infrastructure

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(
  scanBasePackages = [
    "com.adevinta.mstestfactoriaf5helloworld.infrastructure.controller",
    "com.adevinta.mstestfactoriaf5helloworld.infrastructure.configuration"
  ]
)
class Application

@Suppress("SpreadOperator")
fun main(args: Array<String>) {
  runApplication<Application>(*args)
}

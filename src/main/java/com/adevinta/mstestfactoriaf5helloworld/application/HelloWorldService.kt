package com.adevinta.mstestfactoriaf5helloworld.application

import com.adevinta.mstestfactoriaf5helloworld.domain.HelloWorldRepository

class HelloWorldService(private val helloWorldRepository: HelloWorldRepository) {

  fun hello() = "${helloWorldRepository.greeting()} Coders!!!"
}

package com.adevinta.mstestfactoriaf5helloworld.infrastructure.configuration

import com.adevinta.mstestfactoriaf5helloworld.application.HelloWorldService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ApplicationConfiguration {

  @Bean
  fun helloWorldService() = HelloWorldService()
}

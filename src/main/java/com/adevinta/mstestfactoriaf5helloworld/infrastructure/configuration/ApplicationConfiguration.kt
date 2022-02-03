package com.adevinta.mstestfactoriaf5helloworld.infrastructure.configuration

import com.adevinta.mstestfactoriaf5helloworld.application.HelloWorldService
import com.adevinta.mstestfactoriaf5helloworld.domain.HelloWorldRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ApplicationConfiguration {

  @Bean
  fun helloWorldService(helloWorldRepository: HelloWorldRepository) = HelloWorldService(helloWorldRepository)

  @Bean
  fun helloWorldRepository() = object : HelloWorldRepository {
    override fun greeting(): String {
      return "Hello"
    }
  }
}

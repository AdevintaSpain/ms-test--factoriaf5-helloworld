package com.adevinta.mstestfactoriaf5helloworld.infrastructure.configuration

import com.adevinta.mstestfactoriaf5helloworld.application.HelloWorldService
import com.adevinta.mstestfactoriaf5helloworld.domain.HelloWorldRepository
import com.adevinta.mstestfactoriaf5helloworld.infrastructure.repository.HelloWorldJdbcRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.sql.DataSource

@Configuration
class ApplicationConfiguration {

  @Bean
  fun helloWorldService(helloWorldRepository: HelloWorldRepository) = HelloWorldService(helloWorldRepository)

  @Bean
  fun helloWorldRepository(dataSource: DataSource) = HelloWorldJdbcRepository(dataSource)
}

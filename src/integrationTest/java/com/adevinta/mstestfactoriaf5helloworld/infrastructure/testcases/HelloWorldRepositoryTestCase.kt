package com.adevinta.mstestfactoriaf5helloworld.infrastructure.testcases

import com.adevinta.mstestfactoriaf5helloworld.domain.HelloWorldRepository
import com.adevinta.mstestfactoriaf5helloworld.infrastructure.Application
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(
  classes = [Application::class],
  properties = ["spring.profiles.active=integration-test"]
)
abstract class HelloWorldRepositoryTestCase {

  @Autowired
  private lateinit var helloWorldRepository: HelloWorldRepository

  @Test
  fun `should get random greeting from table`() {
    assertThat(helloWorldRepository.greeting())
      .isIn(
        "Hello",
        "Hola",
        "Hi",
        "Holi",
        "Bonjour",
        "Ni hao",
        "Bon dia"
      )
  }
}

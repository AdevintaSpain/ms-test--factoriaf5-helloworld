package com.adevinta.mstestfactoriaf5helloworld.application

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HelloWorldServiceTest {

  @Test
  fun `should say hello`() {
    assertThat(HelloWorldService().hello())
      .isEqualTo("Hello Coders!!!")
  }
}

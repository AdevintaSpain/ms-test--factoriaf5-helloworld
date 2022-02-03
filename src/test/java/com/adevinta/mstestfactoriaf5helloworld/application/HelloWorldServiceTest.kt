package com.adevinta.mstestfactoriaf5helloworld.application

import com.adevinta.mstestfactoriaf5helloworld.domain.HelloWorldRepository
import com.nhaarman.mockito_kotlin.doReturn
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.whenever
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HelloWorldServiceTest {

  @Test
  fun `should say greeting`() {
    // given
    val helloWorldRepository = mock<HelloWorldRepository>()
    doReturn("Hola").whenever(helloWorldRepository).greeting()
    val helloWorldService = HelloWorldService(helloWorldRepository)

    // when
    val helloWorldMessage = helloWorldService.hello()

    // then
    assertThat(helloWorldMessage)
      .isEqualTo("Hola Coders!!!")
  }
}

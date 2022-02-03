package com.adevinta.mstestfactoriaf5helloworld.infrastructure.controller

import com.adevinta.mstestfactoriaf5helloworld.application.HelloWorldService
import com.adevinta.mstestfactoriaf5helloworld.infrastructure.Application
import com.nhaarman.mockito_kotlin.doReturn
import com.nhaarman.mockito_kotlin.whenever
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content

@WebMvcTest(HelloWorldController::class)
@ContextConfiguration(classes = [Application::class])
class HelloWorldControllerTest {

  @MockBean
  private lateinit var helloWorldService: HelloWorldService

  @Autowired
  private lateinit var mvc: MockMvc

  @Test
  fun shouldSayHello() {
    val helloWorldMessage = "Hello Coders from Mock HelloWorldService!!!"
    doReturn(helloWorldMessage).whenever(helloWorldService).hello()

    mvc.perform(get("/hello"))
      .andExpect(status().isOk)
      .andExpect(content().string(equalTo(helloWorldMessage)))
  }
}

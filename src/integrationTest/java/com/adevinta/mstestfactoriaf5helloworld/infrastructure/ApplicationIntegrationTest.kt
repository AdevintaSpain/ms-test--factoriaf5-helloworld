package com.adevinta.mstestfactoriaf5helloworld.infrastructure

import com.adevinta.mstestfactoriaf5helloworld.infrastructure.helper.DockerComposeHelper
import com.adevinta.mstestfactoriaf5helloworld.infrastructure.testcases.ApplicationTestCase
import com.adevinta.mstestfactoriaf5helloworld.infrastructure.testcases.HelloWorldRepositoryTestCase
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Nested

class ApplicationIntegrationTest {
  companion object {

    private val dockerCompose = DockerComposeHelper()

    @BeforeAll
    @JvmStatic
    fun dockerComposeUp() {
      dockerCompose.start()
    }

    @AfterAll
    @JvmStatic
    fun dockerComposeDown() {
      dockerCompose.stop()
    }
  }

  @Nested
  inner class Application : ApplicationTestCase()

  @Nested
  inner class HelloWorldRepository : HelloWorldRepositoryTestCase()
}

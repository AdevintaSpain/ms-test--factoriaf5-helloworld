package com.adevinta.mstestfactoriaf5helloworld.infrastructure.helper

import org.testcontainers.containers.DockerComposeContainer
import org.testcontainers.containers.wait.strategy.Wait.forListeningPort
import org.testcontainers.containers.wait.strategy.Wait.forLogMessage
import org.testcontainers.containers.wait.strategy.WaitAllStrategy
import org.testcontainers.containers.wait.strategy.WaitAllStrategy.Mode.WITH_INDIVIDUAL_TIMEOUTS_ONLY
import java.io.File
import java.lang.System.setProperty

private const val POSTGRES = "postgres"
private const val POSTGRES_PORT = 5432

class DockerComposeHelper {

  private val container: DockerComposeContainer<*>

  init {
    container = DockerComposeContainer<Nothing>(File("docker-compose.yml"))
      .apply { withLocalCompose(false) }
      .apply {
        withExposedService(
          POSTGRES,
          POSTGRES_PORT,
          WaitAllStrategy(WITH_INDIVIDUAL_TIMEOUTS_ONLY)
            .apply { withStrategy(forListeningPort()) }
            .apply { withStrategy(forLogMessage(".*database system is ready to accept connections.*", 1)) }
        )
      }
  }

  fun start() {
    container.start()
    setProperty("database.host", container.getServiceHost(POSTGRES, POSTGRES_PORT))
    setProperty("database.port", container.getServicePort(POSTGRES, POSTGRES_PORT).toString())
  }

  fun stop() {
    container.stop()
  }
}

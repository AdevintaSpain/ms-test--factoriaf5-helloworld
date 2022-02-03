package com.adevinta.mstestfactoriaf5helloworld.infrastructure.repository

import com.adevinta.mstestfactoriaf5helloworld.domain.HelloWorldRepository
import org.springframework.jdbc.core.JdbcTemplate
import javax.sql.DataSource

class HelloWorldJdbcRepository(private val dataSource: DataSource) : HelloWorldRepository {

  override fun greeting(): String {
    val jdbcTemplate = JdbcTemplate(dataSource)
    return jdbcTemplate.queryForList(
      "SELECT greeting FROM greetings ORDER BY random() limit 1",
      String::class.java
    ).singleOrNull()!!
  }
}

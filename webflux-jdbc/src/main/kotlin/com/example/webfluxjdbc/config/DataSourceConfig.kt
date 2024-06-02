package com.example.webfluxjdbc.config

import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.sql.DataSource

@Configuration
class DataSourceConfig {
    @Bean
    fun dataSource(): DataSource {
        val config = HikariConfig().apply {
            driverClassName = "com.mysql.cj.jdbc.Driver"
            jdbcUrl = "jdbc:mysql://db:3306/sample"
            username = "root"
            password = "root"

            // 커넥션 풀 크기 설정
            minimumIdle = 25
            maximumPoolSize = 25
        }

        return HikariDataSource(config)
    }
}
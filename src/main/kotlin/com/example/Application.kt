package com.example

import com.example.database.DatabaseFactory
import com.example.plugins.RequestIDPlugin
import com.example.routes.setupRoutes
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import org.flywaydb.core.Flyway
import org.jetbrains.exposed.sql.Database

fun main() {
    val dataSource = DatabaseFactory.createDataSource()

    Database.connect(datasource = dataSource)

    val flyway = Flyway.configure().dataSource(dataSource).load()
    flyway.migrate()

    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    install(RequestIDPlugin)
    setupRoutes()
}

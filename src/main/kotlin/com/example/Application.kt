package com.example

import DatabaseFactory
import com.example.plugins.RequestIDPlugin
import com.example.routes.setupRoutes
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import org.jetbrains.exposed.sql.Database

fun main() {
    val dataSource = DatabaseFactory.createDataSource()
    val database = Database.connect(datasource = dataSource)
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    install(RequestIDPlugin)
    setupRoutes()
}

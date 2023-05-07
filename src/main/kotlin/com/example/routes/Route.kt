package com.example.routes

import com.example.routes.product.createProductRoute
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.setupRoutes() {
    routing {
        createProductRoute()
    }
}

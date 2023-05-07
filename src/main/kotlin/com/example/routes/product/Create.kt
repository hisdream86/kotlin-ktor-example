package com.example.routes.product

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


fun Route.createProductRoute() {
    post("/v1/products") {
        call.respondText("Hello World!")
    }
}
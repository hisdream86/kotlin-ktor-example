package com.example.routes.product

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.util.*


fun Route.createProductRoute() {
    post("/v1/products") {
        call.respondText("Hello World!" + call.attributes[AttributeKey("request-id")])
    }
}
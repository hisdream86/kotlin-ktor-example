package com.example.plugins

import io.ktor.server.application.*
import io.ktor.util.*
import java.util.*


val RequestIDPlugin = createApplicationPlugin(name = "RequestIDPlugin") {
    onCall { call ->
        call.attributes.put(AttributeKey("request-id"), UUID.randomUUID())
    }
}
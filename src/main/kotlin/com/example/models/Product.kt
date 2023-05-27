package com.example.models

import org.jetbrains.exposed.dao.UUIDEntity
import org.jetbrains.exposed.dao.UUIDEntityClass
import org.jetbrains.exposed.dao.id.EntityID
import org.jetbrains.exposed.dao.id.UUIDTable
import org.jetbrains.exposed.sql.Column
import java.util.*

object Products : UUIDTable(name = "products") {
    val productID: Column<UUID> = uuid(name = "product_id").autoGenerate()
    val name: Column<String> = varchar(name = "name", length = 128)
    val description: Column<String?> = text(name = "description").nullable()
    val price: Column<Int?> = integer(name = "price").nullable()
}

class Product(productID: EntityID<UUID>) : UUIDEntity(productID) {
    companion object : UUIDEntityClass<Product>(Products)

    var productID by Products.productID
    var name by Products.name
    var description by Products.description
    var price by Products.price
}
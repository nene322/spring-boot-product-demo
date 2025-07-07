package com.example.demo.infrastructure.entity

import com.example.demo.domain.model.Product

object FakeProductEntity {
    val products = listOf(
        Product(
            id = 0,
            name = "ムーンライトクッキー",
            price = 1000,
            discount = 200,
            imagePath = "/image/sample_a.png"
        ),
        Product(
            id = 1,
            name = "ムーンライトチョコクッキー",
            price = 2000,
            discount = 200,
            imagePath = "/image/sample_b.png"
        )
    )
}
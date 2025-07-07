package com.example.demo.repository

import com.example.demo.infrastructure.repository.ProductRepositoryImpl
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ProductRepositoryImplTest {
    private val repository = ProductRepositoryImpl()

    @Test
    fun 存在するIDで商品が取得できる() {
        val product = repository.findById(1)
        assertNotNull(product)
        assertEquals(1, product?.id)
    }

    @Test
    fun 存在しないIDではnullが返る() {
        val product = repository.findById(20)
        assertNull(product)
    }
}


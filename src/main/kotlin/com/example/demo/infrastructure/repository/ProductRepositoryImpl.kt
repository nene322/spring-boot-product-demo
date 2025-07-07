package com.example.demo.infrastructure.repository

import com.example.demo.domain.model.Product
import com.example.demo.domain.repository.ProductRepository
import com.example.demo.infrastructure.entity.FakeProductEntity
import org.springframework.stereotype.Repository

@Repository
class ProductRepositoryImpl : ProductRepository {
    override fun findById(id: Int): Product? = FakeProductEntity.products.find { it.id == id }
}

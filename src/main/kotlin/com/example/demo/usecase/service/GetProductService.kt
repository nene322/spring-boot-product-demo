package com.example.demo.usecase.service

import com.example.demo.domain.model.Product
import com.example.demo.domain.repository.ProductRepository
import org.springframework.stereotype.Service

@Service
class GetProductService(
    val productRepository: ProductRepository
) {
    fun findById(id: Int): Product? = productRepository.findById(id) // 商品IDで商品を取得する処理
}

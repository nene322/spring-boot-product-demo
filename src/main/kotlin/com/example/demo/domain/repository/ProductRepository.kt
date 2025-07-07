package com.example.demo.domain.repository

import com.example.demo.domain.model.Product

interface ProductRepository {
    fun findById(id: Int): Product? // 商品IDで商品を取得する処理
}

package com.example.demo.domain.model

data class Product ( // 商品情報を表すデータクラス
    val id: Int,
    val name: String,
    val price: Int,
    val discount: Int,
    val imagePath: String,
)
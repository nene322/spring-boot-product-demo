package com.example.demo.presentation

import com.example.demo.domain.model.Product
import com.example.demo.usecase.service.GetProductService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/products")
class ProductController(
    val getProductService: GetProductService
) {
    @GetMapping("/{id}")
    fun getProduct(@PathVariable id: Int): Product =
        getProductService.findById(id)
            ?: throw ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found")
}
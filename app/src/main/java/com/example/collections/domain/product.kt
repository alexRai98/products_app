package com.example.collections.domain

import java.math.BigDecimal

data class Product(val id: String, val name: String, val price: BigDecimal, val price_sale: BigDecimal, val unit : String)

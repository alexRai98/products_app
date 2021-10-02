package com.example.collections.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.collections.domain.Product
import java.math.BigDecimal

class MainViewModel: ViewModel() {

    private var _productList = MutableLiveData<MutableList<Product>>()
    val productList : LiveData<MutableList<Product>> = _productList

    init {
        fetchProducts()
    }

    private fun fetchProducts() {
        val productList : MutableList<Product> = mutableListOf<Product>()
        productList.add(Product("1","Pañal XG", BigDecimal(45.6), BigDecimal(1.2), "paquete"))
        productList.add(Product("2","Pañal XG", BigDecimal(45.6), BigDecimal(1.2), "paquete"))
        productList.add(Product("3","Pañal XG", BigDecimal(45.6), BigDecimal(1.2), "paquete"))
        productList.add(Product("4","Pañal XG", BigDecimal(45.6), BigDecimal(1.2), "paquete"))
        productList.add(Product("5","Pañal XG", BigDecimal(45.6), BigDecimal(1.2), "paquete"))
        productList.add(Product("1","Pañal XG", BigDecimal(45.6), BigDecimal(1.2), "paquete"))
        productList.add(Product("2","Pañal XG", BigDecimal(45.6), BigDecimal(1.2), "paquete"))
        productList.add(Product("3","Pañal XG", BigDecimal(45.6), BigDecimal(1.2), "paquete"))
        productList.add(Product("4","Pañal XG", BigDecimal(45.6), BigDecimal(1.2), "paquete"))
        productList.add(Product("5","Pañal XG", BigDecimal(45.6), BigDecimal(1.2), "paquete"))
        productList.add(Product("1","Pañal XG", BigDecimal(45.6), BigDecimal(1.2), "paquete"))
        productList.add(Product("2","Pañal XG", BigDecimal(45.6), BigDecimal(1.2), "paquete"))
        productList.add(Product("3","Pañal XG", BigDecimal(45.6), BigDecimal(1.2), "paquete"))
        productList.add(Product("4","Pañal XG", BigDecimal(45.6), BigDecimal(1.2), "paquete"))
        productList.add(Product("5","Pañal XG", BigDecimal(45.6), BigDecimal(1.2), "paquete"))
        productList.add(Product("1","Pañal XG", BigDecimal(45.6), BigDecimal(1.2), "paquete"))
        productList.add(Product("2","Pañal XG", BigDecimal(45.6), BigDecimal(1.2), "paquete"))
        productList.add(Product("3","Pañal XG", BigDecimal(45.6), BigDecimal(1.2), "paquete"))
        productList.add(Product("4","Pañal XG", BigDecimal(45.6), BigDecimal(1.2), "paquete"))
        productList.add(Product("5","Pañal XG", BigDecimal(45.6), BigDecimal(1.2), "paquete"))

        _productList.value = productList
    }
}
package com.example.collections


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.collections.adapters.ProductAdapter
import com.example.collections.databinding.ActivityMainBinding
import com.example.collections.domain.Product
import java.math.BigDecimal

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.productsRecycler.layoutManager = LinearLayoutManager(this)

        val productList : MutableList<Product> = mutableListOf<Product>()
        productList.add(Product("1","Pañal XG", BigDecimal(45.6), BigDecimal(1.2), "paquete"))
        productList.add(Product("2","Pañal XG", BigDecimal(45.6),BigDecimal(1.2), "paquete"))
        productList.add(Product("3","Pañal XG", BigDecimal(45.6),BigDecimal(1.2), "paquete"))
        productList.add(Product("4","Pañal XG", BigDecimal(45.6),BigDecimal(1.2), "paquete"))
        productList.add(Product("5","Pañal XG", BigDecimal(45.6),BigDecimal(1.2), "paquete"))
        productList.add(Product("1","Pañal XG", BigDecimal(45.6), BigDecimal(1.2), "paquete"))
        productList.add(Product("2","Pañal XG", BigDecimal(45.6),BigDecimal(1.2), "paquete"))
        productList.add(Product("3","Pañal XG", BigDecimal(45.6),BigDecimal(1.2), "paquete"))
        productList.add(Product("4","Pañal XG", BigDecimal(45.6),BigDecimal(1.2), "paquete"))
        productList.add(Product("5","Pañal XG", BigDecimal(45.6),BigDecimal(1.2), "paquete"))
        productList.add(Product("1","Pañal XG", BigDecimal(45.6), BigDecimal(1.2), "paquete"))
        productList.add(Product("2","Pañal XG", BigDecimal(45.6),BigDecimal(1.2), "paquete"))
        productList.add(Product("3","Pañal XG", BigDecimal(45.6),BigDecimal(1.2), "paquete"))
        productList.add(Product("4","Pañal XG", BigDecimal(45.6),BigDecimal(1.2), "paquete"))
        productList.add(Product("5","Pañal XG", BigDecimal(45.6),BigDecimal(1.2), "paquete"))
        productList.add(Product("1","Pañal XG", BigDecimal(45.6), BigDecimal(1.2), "paquete"))
        productList.add(Product("2","Pañal XG", BigDecimal(45.6),BigDecimal(1.2), "paquete"))
        productList.add(Product("3","Pañal XG", BigDecimal(45.6),BigDecimal(1.2), "paquete"))
        productList.add(Product("4","Pañal XG", BigDecimal(45.6),BigDecimal(1.2), "paquete"))
        productList.add(Product("5","Pañal XG", BigDecimal(45.6),BigDecimal(1.2), "paquete"))

        val adapter = ProductAdapter()
        binding.productsRecycler.adapter = adapter
        adapter.submitList(productList)

        adapter.onItemClickListener = {
            Log.d("PRODUCT-DATA", it.name)
        }
        if(productList.isEmpty()){
            binding.labelNoItems.visibility = View.VISIBLE
        }else{
            binding.labelNoItems.visibility = View.GONE
        }
    }
}
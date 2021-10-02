package com.example.collections


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.collections.adapters.ProductAdapter
import com.example.collections.databinding.ActivityMainBinding
import com.example.collections.domain.Product
import com.example.collections.network.service
import com.example.collections.viewModels.MainViewModel
import java.math.BigDecimal

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.productsRecycler.layoutManager = LinearLayoutManager(this)
        val viewModel : MainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        val adapter = ProductAdapter()
        binding.productsRecycler.adapter = adapter
        viewModel.productList.observe(this, Observer {
            adapter.submitList(it)

            handleEmptyView(it, binding)
        })

        service.getAllProducts()
    }

    private fun handleEmptyView(
        it: MutableList<Product>,
        binding: ActivityMainBinding
    ) {
        if (it.isEmpty()) {
            binding.labelNoItems.visibility = View.VISIBLE
        } else {
            binding.labelNoItems.visibility = View.GONE
        }
    }
}
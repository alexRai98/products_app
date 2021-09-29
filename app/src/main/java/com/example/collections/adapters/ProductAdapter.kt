package com.example.collections.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.collections.databinding.ProductItemBinding
import com.example.collections.domain.Product
import java.math.RoundingMode


private val TAG = ProductAdapter::class.java.simpleName

class ProductAdapter : ListAdapter<Product, ProductAdapter.ProductHolder>(DiffCallback){

    companion object DiffCallback : DiffUtil.ItemCallback<Product>(){
        override fun areItemsTheSame(oldItem: Product, newItem: Product): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Product, newItem : Product) : Boolean{
            return oldItem == newItem
        }
    }

    lateinit var onItemClickListener: (Product) -> Unit

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductAdapter.ProductHolder {
        val binding = ProductItemBinding.inflate(LayoutInflater.from(parent.context))
        return ProductHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductAdapter.ProductHolder, position: Int) {
        val product : Product = getItem(position)
        holder.bind(product)
    }
    inner class ProductHolder(private val binding: ProductItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(product: Product){
            binding.txtProductName.text = product.name
            binding.txtProductPriceSale.text = product.price_sale.setScale(2, RoundingMode.HALF_UP).toString()

            binding.root.setOnClickListener(){
                if(::onItemClickListener.isInitialized) {
                    onItemClickListener(product)
                }else{
                    Log.e(TAG,"onItemClickListener not initialized")
                }
            }
            binding.executePendingBindings()
        }

    }
}
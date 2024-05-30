package com.oma.beyondpayment.autoscrollinginkotlin

import android.annotation.SuppressLint
import android.graphics.Paint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.oma.beyondpayment.autoscrollinginkotlin.databinding.NameLayoutBinding

class UsersListAdapter (
    var data: MutableList<String>?) : RecyclerView.Adapter<CartItemsListViewHolder>() {

    private lateinit var binding: NameLayoutBinding
    override fun getItemCount(): Int {
        return data!!.size
    }

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): CartItemsListViewHolder {
        binding = NameLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )

        return CartItemsListViewHolder(
            binding
        )
    }

    override fun onBindViewHolder(holder: CartItemsListViewHolder, position: Int) {
        holder.initialize(data!![position])


    }



}

class CartItemsListViewHolder(itemView: NameLayoutBinding) :
    RecyclerView.ViewHolder(itemView.root) {

    val binding = itemView

    @SuppressLint("SetTextI18n")
    fun initialize(data: String) {

        binding.title.text = data


    }

}
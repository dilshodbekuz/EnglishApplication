package com.example.englishapplication.fragment.saveWords

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.englishapplication.R
import com.example.englishapplication.databinding.SaveWordsRowBinding
import com.example.room.data.User
class ListAdapter : RecyclerView.Adapter<ListAdapter.MyViewHolder>() {
    private var userList = emptyList<User>()
    class MyViewHolder(val binding: SaveWordsRowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = SaveWordsRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = userList[position]
        holder.binding.idtxt.text = currentItem.id.toString()
        holder.binding.saveWords.text = currentItem.words
      
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    fun setData(user: List<User>) {
        @SuppressLint("NotifyDataSetChanged")
        this.userList = user
        notifyDataSetChanged()
    }
}

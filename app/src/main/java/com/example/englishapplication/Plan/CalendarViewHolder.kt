package com.example.englishapplication.Plan


import android.content.Context
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.englishapplication.Plan.CalendarAdapter.OnItemListener
import com.example.englishapplication.R


class CalendarViewHolder internal constructor(itemView: View, onItemListener: Context) :
    RecyclerView.ViewHolder(itemView), View.OnClickListener {
    val dayOfMonth: TextView
    private val onItemListener: OnItemListener
        get() {
            TODO()
        }

    override fun onClick(view: View) {
        onItemListener.onItemClick(adapterPosition, dayOfMonth.text as String)
    }

    init {
        dayOfMonth = itemView.findViewById(R.id.cellDayText)

        itemView.setOnClickListener(this)
    }
}
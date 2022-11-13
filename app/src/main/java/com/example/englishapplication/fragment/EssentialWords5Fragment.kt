package com.example.englishapplication.fragment

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.englishapplication.R
import com.example.englishapplication.databinding.FragmentEssentialWords1Binding
import com.example.englishapplication.databinding.FragmentEssentialWords5Binding
import com.example.room.data.UserViewModel
import java.util.*

class EssentialWords5Fragment : Fragment() {
    lateinit var binding:FragmentEssentialWords5Binding
    lateinit var mUserViewModel: UserViewModel

    val wrongWords = arrayListOf<String>()
    val wordsList1 = arrayListOf("")
    val wordsList2 = arrayListOf("")
    val wordsList3 = arrayListOf("")
    val wordsList4 = arrayListOf("")
    val wordsList5 = arrayListOf("")
    val wordsList6 = arrayListOf("")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentEssentialWords5Binding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val a = "ESSENTIAL WORDS 1-5"
        val b = "ESSENTIAL WORDS 6-10"
        val c = "ESSENTIAL WORDS 6-10"

        binding.btn1.setOnClickListener {
            val random = Random()
            val randomList = random.nextInt(wordsList1.count())
            val colorSet:Int = Color.LTGRAY
            binding.rv.setBackgroundColor(colorSet)
            binding.listText.text = wordsList1[randomList]
            binding.essentialTv.text = a
        }

        binding.btn610.setOnClickListener {
            val random = Random()
            val randomList = random.nextInt(wordsList2.count())
            val colorSet:Int = Color.GRAY
            binding.rv.setBackgroundColor(colorSet)
            binding.listText.text = wordsList2[randomList]
            binding.essentialTv.text = b
        }

        binding.btn1115.setOnClickListener {
            val random = Random()
            val randomList = random.nextInt(wordsList2.count())
            val colorSet:Int = Color.WHITE
            binding.rv.setBackgroundColor(colorSet)
            binding.listText.text = wordsList2[randomList]
            binding.essentialTv.text = c
        }


    }
}
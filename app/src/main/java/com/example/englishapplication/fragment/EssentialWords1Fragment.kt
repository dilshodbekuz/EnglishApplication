package com.example.englishapplication.fragment

import android.animation.ValueAnimator
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.englishapplication.R
import com.example.englishapplication.databinding.FragmentEssentialWords1Binding
import com.example.englishapplication.fragment.saveWords.SaveWordsFragment
import com.example.room.data.User
import com.example.room.data.UserViewModel
import java.util.*

class EssentialWords1Fragment : Fragment() {

    lateinit var mUserViewModel: UserViewModel
    lateinit var binding: FragmentEssentialWords1Binding
    val wrongWords = arrayListOf<String>()

    lateinit var wordsList1: MutableList<String>
    lateinit var wordsList2: MutableList<String>
    lateinit var wordsList3: MutableList<String>
    lateinit var wordsList4:MutableList<String>
    lateinit var wordsList5 :MutableList<String>
    lateinit var wordsList6 :MutableList<String>
    var currentWordIndex = 0
    val changeColor = arrayListOf("#549cf1", "#708cb2", "#fFb800", "#22ddca")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentEssentialWords1Binding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Click()
        wordsList1 = resources.getStringArray(R.array.word_list_1).toMutableList()
        wordsList2 = resources.getStringArray(R.array.words_list_2).toMutableList()
        wordsList3 = resources.getStringArray(R.array.words_list_3).toMutableList()
        wordsList4 = resources.getStringArray(R.array.words_list_4).toMutableList()
        wordsList5 = resources.getStringArray(R.array.words_list_5).toMutableList()
        wordsList6 = resources.getStringArray(R.array.words_list_6).toMutableList()

        binding.showWords.setOnClickListener {
            val transaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainerView, SaveWordsFragment())
            transaction.addToBackStack(null)
            transaction.commit()
        }
        var time = 0
        binding.wrongCount.text = time.toString()

        binding.wrong.setOnClickListener {
            insertDataToDatabase()
            wrongWords.add(binding.listText.text.toString())
            time += 1
            binding.wrongCount.text = wrongWords.size.toString()

        }
        mUserViewModel = ViewModelProvider(this).get(UserViewModel::class.java)
    }

    private fun insertDataToDatabase() {
        val words = binding.listText.text.toString()
        if (words.isNotEmpty()) {
            val user = User(0, words)
            mUserViewModel.addUser(user)
            Toast.makeText(requireContext(), "Wrong words Safe", Toast.LENGTH_SHORT).show()
        } else {

            Toast.makeText(requireContext(), "Something wrong", Toast.LENGTH_SHORT).show()
        }
    }

    private fun Click() {
        binding.btn1.setOnClickListener {
            val word = getNextWord(wordsList1)
            showNextWord(word)
        }
        binding.btn610.setOnClickListener {
            val word = getNextWord(wordsList2)
            showNextWord(word)
        }
        binding.btn1115.setOnClickListener {
            val word = getNextWord(wordsList3)
            showNextWord(word)
        }
        binding.btn1620.setOnClickListener {
            val word = getNextWord(wordsList4)
            showNextWord(word)
        }
        binding.btn2125.setOnClickListener {
            val word = getNextWord(wordsList5)
            showNextWord(word)
        }
        binding.btn2630.setOnClickListener {
            val word = getNextWord(wordsList6)
            showNextWord(word)
        }
    }

    private fun showNextWord(word: String) {
        val random = Random()
        val randomColor = random.nextInt(changeColor.count())
        val color: String = changeColor[randomColor]
        val colorSet: Int = Color.parseColor(color)
        binding.rv.setBackgroundColor(colorSet)
        binding.listText.text = word
    }

    private fun getNextWord(wordsList: MutableList<String>): String {
        if (currentWordIndex == wordsList.size - 1) {
            wordsList.shuffle()
            currentWordIndex = 0
        }
        val result = wordsList[currentWordIndex]
        currentWordIndex++
        return result
    }


    fun move(view: ImageView) {
        val va = ValueAnimator.ofFloat(0f, 3f)
        va.duration = 3000 //in millis
        va.addUpdateListener { animation -> view.rotationX = animation.animatedValue as Float }
        va.repeatCount = 5
        va.start()
    }
}
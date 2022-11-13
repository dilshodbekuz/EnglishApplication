package com.example.englishapplication.fragment

import android.animation.ValueAnimator
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.englishapplication.R
import com.example.englishapplication.databinding.FragmentEssentialWords1Binding
import com.example.englishapplication.databinding.FragmentEssentialWords4Binding
import com.example.englishapplication.fragment.saveWords.SaveWordsFragment
import com.example.room.data.User
import com.example.room.data.UserViewModel
import java.util.*

class EssentialWords4Fragment : Fragment() {
    lateinit var binding:FragmentEssentialWords4Binding
    lateinit var mUserViewModel: UserViewModel

    val wrongWords = arrayListOf<String>()

    val wordsList1 = arrayListOf(
               "aroma",
               " beverage",
               " cluster",
               " combine",
               " condensed",
               " contemporary",
               " cultivate",
               " divine",
               " humid",
               " odor",
               " palate",
               " paradise",
               " plantation",
               " rapid",
               " rate",
               " soothing",
               " subtle",
               " texture",
               " toxic",
               " vary",
               " accident",
               " admiral",
               " arc",
               " character",
               " conscience",
               " fiery",
               " flesh",
               " grapefruit",
               " hay",
               " horrified",
               " kerosene",
               " loop",
               " paddle",
               " raft",
               " sour",
               " stake",
               " steward",
               " string",
               " thorn",
               " wreck",
               " admonish",
               " audible",
               " awesome",
               " beware",
               " brag",
               " conscious",
               " disagree",
               " echo",
               " eventual",
               " hint",
               " idiot",
               " immense",
               " indirect",
               " option",
               " pastime",
               " perfect",
               " pinpoint",
               " switch",
               " thorough",
               " torment",
               " beak",
               " damp",
               " disapprove",
               " except",
               " flight",
               " fond",
               " immoral",
               " ivy",
               " moan",
               " oblivious",
               " perish",
               " pit",
               " rim",
               " roost",
               " slippery",
               " soar",
               " trivial",
               " typical",
               " utterly",
               " weep",
               " awhile",
               " cyberspace",
               " edit",
               " essay",
               " evaluate",
               " faint",
               " global",
               " gymnasium",
               " highlight",
               " ignorant",
               " index",
               " lecture",
               " moral",
               " operate",
               " private",
               " recent",
               " resolution",
               " semester",
               " typewritten",
               " weird",
    )
    val wordsList2 = arrayListOf(
                "absolute",
                "alas",
                "attentive",
                "cape",
                "envision",
                "evenly",
                "folk",
                "melt",
                "patch",
                "pleasure",
                "pop",
                "pudding",
                "rail",
                "recipe",
                "role",
                "shrink",
                "soak",
                "spark",
                "spirit",
                "suit",
                "account",
                "architect",
                "conceal",
                "crime",
                "deed",
                "gratitude",
                "habitat",
                "intervene",
                "landmark",
                "legal",
                "memorable",
                "oblige",
                "offence",
                "proclaim",
                "rally",
                "resolve",
                "resource",
                "sentence",
                "volunteer",
                "witness",
                "access",
                "conduct",
                "constant",
                "crack",
                "device",
                "enclose",
                "grip",
                "halt",
                "impending",
                "influence",
                "law",
                "mode",
                "perspire",
                "replace",
                "snap",
                "sly",
                "tend",
                "valid",
                "version",
                "whatsoever",
                "alongside",
                "appetite",
                "assist",
                "breeze",
                "defy",
                "display",
                "efficient",
                "feeble",
                "forgive",
                "lively",
                "majestic",
                "nor",
                "outraged",
                "pessimistic",
                "rumor",
                "slap",
                "smash",
                "subject",
                "wage",
                "whereas",
                "animate",
                "classify",
                "concede",
                "concept",
                "construct",
                "decade",
                "diagram",
                "ferry",
                "handy",
                "isolate",
                "longing",
                "numerous",
                "particle",
                "plea",
                "refrain",
                "review",
                "sophisticated",
                "surrender",
                "upright",
                "worthwhile",
    )
    val wordsList3 = arrayListOf("")
    val wordsList4 = arrayListOf("")
    val wordsList5 = arrayListOf("")
    val wordsList6 = arrayListOf("")

    val changeColor = arrayListOf("#549cf1", "#708cb2", "#fFb800", "#22ddca")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentEssentialWords4Binding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Click()



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
    private fun Click(){

        val a1 = "ESSENTIAL WORDS 1-5"
        val a2 = "ESSENTIAL WORDS 6-10"
        val a3 = "ESSENTIAL WORDS 11-15"
        val a4 = "ESSENTIAL WORDS 16-20"
        val a5 = "ESSENTIAL WORDS 21-25"
        val a6 = "ESSENTIAL WORDS 26-30"



        binding.btn1.setOnClickListener {

            val random = Random()
            val randomList = random.nextInt(wordsList1.count())
            val randomColor = random.nextInt(changeColor.count())
            val color: String = changeColor[randomColor]
            val colorSet: Int = Color.parseColor(color)
            binding.rv.setBackgroundColor(colorSet)
            binding.listText.text = wordsList1[randomList]
            binding.essentialTv.text = a1
        }
        binding.btn610.setOnClickListener {
            val random = Random()
            val randomList = random.nextInt(wordsList2.count())
            val randomColor = random.nextInt(changeColor.count())
            val color: String = changeColor[randomColor]
            val colorSet: Int = Color.parseColor(color)
            binding.rv.setBackgroundColor(colorSet)
            binding.listText.text = wordsList2[randomList]
            binding.essentialTv.text = a2
        }
        binding.btn1115.setOnClickListener {
            val random = Random()
            val randomList = random.nextInt(wordsList3.count())
            val randomColor = random.nextInt(changeColor.count())
            val color: String = changeColor[randomColor]
            val colorSet: Int = Color.parseColor(color)
            binding.rv.setBackgroundColor(colorSet)
            binding.listText.text = wordsList3[randomList]
            binding.essentialTv.text = a3
        }
        binding.btn1620.setOnClickListener {
            val random = Random()
            val randomList = random.nextInt(wordsList4.count())
            val randomColor = random.nextInt(changeColor.count())
            val color: String = changeColor[randomColor]
            val colorSet: Int = Color.parseColor(color)
            binding.rv.setBackgroundColor(colorSet)
            binding.listText.text = wordsList4[randomList]
            binding.essentialTv.text = a4
        }
        binding.btn2125.setOnClickListener {
            val random = Random()
            val randomList = random.nextInt(wordsList5.count())
            val randomColor = random.nextInt(changeColor.count())
            val color: String = changeColor[randomColor]
            val colorSet: Int = Color.parseColor(color)
            binding.rv.setBackgroundColor(colorSet)
            binding.listText.text = wordsList5[randomList]
            binding.essentialTv.text = a5
        }
        binding.btn2630.setOnClickListener {
            val random = Random()
            val randomList = random.nextInt(wordsList6.count())
            val randomColor = random.nextInt(changeColor.count())
            val color: String = changeColor[randomColor]
            val colorSet: Int = Color.parseColor(color)
            binding.rv.setBackgroundColor(colorSet)
            binding.listText.text = wordsList6[randomList]
            binding.essentialTv.text = a6
        }
    }

    fun move(view: ImageView) {
        val va = ValueAnimator.ofFloat(0f, 3f)
        va.duration = 3000 //in millis
        va.addUpdateListener { animation -> view.rotationX = animation.animatedValue as Float }
        va.repeatCount = 5
        va.start()
    }}
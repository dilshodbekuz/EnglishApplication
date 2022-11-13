package com.example.englishapplication.fragment

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.englishapplication.R
import com.example.englishapplication.databinding.FragmentEssentialWords1Binding
import com.example.englishapplication.databinding.FragmentEssentialWords6Binding
import java.util.*

class EssentialWords6Fragment : Fragment() {
    lateinit var binding:FragmentEssentialWords6Binding

    val wordsList1 = arrayListOf<String>(
        "afraid",
        "agree",
        "angry",
        "arrive",
        "attack",
        "bottom",
        "clever",
        "cruel",
        "finally",
        "hide",
        "hunt",
        "lot",
        "middle",
        "moment",
        "pleased",
        "promise",
        "reply",
        "safe",
        "trick",
        "well",
        "adventure",
        "approach",
        "carefully",
        "chemical",
        "create",
        "evil",
        "experiment",
        "kill",
        "laboratory",
        "laugh",
        "loud",
        "nervous",
        "noise",
        "project",
        "scare",
        "secret",
        "shout",
        "smell",
        "terrible",
        "worse",
        "alien",
        "among",
        "chart",
        "ClOUd",
        "comprehend",
        "describe",
        "ever",
        "fail",
        "friendly",
        "grade",
        "instead",
        "library",
        "planet",
        "report",
        "several",
        "solve",
        "suddenly",
        "SUppOSe",
        "universe",
        "view",
        "appropriate",
        "avoid",
        "behave",
        "calm",
        "concern",
        "content",
        "expect",
        "frequently",
        "habit",
        "instruct",
        "issue",
        "none",
        "patient",
        "positive",
        "punish",
        "represent",
        "shake",
        "spread",
        "stroll",
        "village",
        "aware",
        "badly ",
        "belong",
        "continue",
        "error",
        "experience ",
        "field",
        "hurt",
        "judgment",
        "likely",
        "normal",
        "rare",
        "relax",
        "request",
        "reside",
        "result",
        "roll",
        "since",
        "visible",
        "wild",

        )

    val wordsList2 = arrayListOf(
        "advantage",
        "cause",
        "choice",
        "community",
        "dead",
        "distance",
        "escape",
        "face",
        "follow",
        "fright",
        "ghost",
        "individual",
        "pet",
        "reach",
        "return",
        "survive",
        "upset",
        "voice",
        "weather",
        "wise",
        "allow",
        "announce",
        "beside",
        "challenge",
        "claim",
        "condition",
        "contribute",
        "difference",
        "divide",
        "expert",
        "famous",
        "force",
        "harm",
        "lay",
        "peace",
        "prince",
        "protect",
        "sense",
        "sudden",
        "therefore",
        "accept",
        "arrange",
        "attend",
        "balance",
        "contrast",
        "encourage",
        "familiar",
        "grab",
        "hang",
        "huge",
        "necessary",
        "pattern",
        "propose",
        "purpose",
        "release",
        "require",
        "single",
        "SUCCeSS",
        "tear",
        "theory",
        "against",
        "beach",
        "damage",
        "discover",
        "emotion",
        "fix",
        "frank",
        "identify",
        "island",
        "ocean",
        "perhaps",
        "pleasant",
        "prevent",
        "rock",
        "save",
        "Step",
        "still",
        "taste",
        "throw",
        "wave",
        "benefit",
        "certain",
        "chance",
        "effect",
        "essential",
        "far",
        "focus",
        "function",
        "grass",
        "guard",
        "image",
        "immediate",
        "primary",
        "proud",
        "remain",
        "rest",
        "separate",
        "Site",
        "tail",
        "trouble",

        )
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentEssentialWords6Binding.inflate(layoutInflater)
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
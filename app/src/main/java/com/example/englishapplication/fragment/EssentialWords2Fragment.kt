package com.example.englishapplication.fragment

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.englishapplication.R
import com.example.englishapplication.databinding.FragmentEssentialWords2Binding
import com.example.englishapplication.fragment.saveWords.SaveWordsFragment
import com.example.room.data.User
import com.example.room.data.UserViewModel
import java.util.*

class EssentialWords2Fragment : Fragment() {
    lateinit var mUserViewModel: UserViewModel
    lateinit var binding: FragmentEssentialWords2Binding

    val wrongWords = arrayListOf<String>()
    val wordsList1 = arrayListOf<String>(
        "anxious",
        "awful",
        "consist",
        "desire",
        "eager",
        "household",
        "intent",
        "landscape",
        "lift",
        "load",
        "lung",
        "motion",
        "pace",
        "polite",
        "possess",
        "rapidly",
        "remark",
        "seek",
        "shine",
        "spill",
        "bring",
        "castle",
        "command",
        "counsel",
        "ensure",
        "explosion",
        "jewelry",
        "land",
        "meteor",
        "monster",
        "northern",
        "remote",
        "southern",
        "statue",
        "steam",
        "submit",
        "temple",
        "upper",
        "weed",
        "wing",
        "arrow",
        "battle",
        "bow",
        "brave",
        "chief",
        "disadvantage",
        "enemy",
        "entrance",
        "hardly",
        "intend",
        "laughter",
        "log",
        "military",
        "obey",
        "secure",
        "steady",
        "trust",
        "twist",
        "unless",
        "weapon",
        "chest",
        "confidence",
        "consequence",
        "disaster",
        "disturb",
        "estimate",
        "honor",
        "impress",
        "marathon",
        "narrow",
        "pale",
        "rough",
        "satisfy",
        "scream",
        "sensitive",
        "shade",
        "supplement",
        "terror",
        "threat",
        "victim",
        "ancestor",
        "angle",
        "boot",
        "border",
        "congratulate",
        "frame",
        "heaven",
        "incredible",
        "legend",
        "praise",
        "proceed",
        "pure",
        "relative",
        "senior",
        "silent",
        "sink",
        "superior",
        "surround",
        "thick",
        "wrap",
    )
    val wordsList2 = arrayListOf(
        "abroad",
        "anger",
        "bride",
        "brief",
        "chase",
        "disappoint",
        "dive",
        "exchange",
        "favor",
        "fee",
        "forever",
        "guy",
        "lovely",
        "mood",
        "palace",
        "permit",
        "protest",
        "sculpture",
        "tribe",
        "youth",
        "basis",
        "biology",
        "cage",
        "colleague",
        "colony",
        "debate",
        "depart",
        "depress",
        "factual",
        "fascinate",
        "mission",
        "nevertheless",
        "occupation",
        "overseas",
        "persuade",
        "route",
        "ruins",
        "scholar",
        "significant",
        "volcano",
        "broad",
        "bush",
        "capable",
        "cheat",
        "concentrate",
        "conclude",
        "confident",
        "considerable",
        "convey",
        "definite",
        "delight",
        "destination",
        "dictate",
        "edge",
        "path",
        "resort",
        "shadow",
        "succeed",
        "suspect",
        "valley",
        "admire",
        "aid",
        "attempt",
        "authority",
        "capital",
        "cooperate",
        "defend",
        "destruction",
        "disorder",
        "division",
        "enable",
        "frustrate",
        "govern",
        "plenty",
        "relieve",
        "reputation",
        "royal",
        "slave",
        "struggle",
        "stupid",
        "citizen",
        "council",
        "declare",
        "enormous",
        "extraordinary",
        "fog",
        "funeral",
        "giant",
        "impression",
        "income",
        "mad",
        "ought",
        "resist",
        "reveal",
        "rid",
        "sword",
        "tale",
        "trap",
        "trial",
        "violent",
    )
    val wordsList3 = arrayListOf(
        "admission",
        "astronomy",
        "blame",
        "chemistry",
        "despite",
        "dinosaur",
        "exhibit",
        "fame",
        "forecast",
        "genius",
        "gentle",
        "geography",
        "interfere",
        "lightly",
        "principal",
        "row",
        "shelf",
        "spite",
        "super",
        "wet",
        "abuse",
        "afford",
        "bake",
        "bean",
        "candle",
        "convert",
        "debt",
        "decrease",
        "fault",
        "fund",
        "generous",
        "ingredient",
        "insist",
        "mess",
        "metal",
        "monitor",
        "oppose",
        "passive",
        "quantity",
        "sue",
        "anxiety",
        "army",
        "billion",
        "carve",
        "consult",
        "emergency",
        "fortune",
        "guarantee",
        "hike",
        "initial",
        "intense",
        "lend",
        "peak",
        "potential",
        "pride",
        "proof",
        "quit",
        "spin",
        "tiny",
        "tutor",
        "apparent",
        "blind",
        "calculate",
        "chat",
        "commit",
        "compose",
        "dormitory",
        "exhaust",
        "greenhouse",
        "ignore",
        "obvious",
        "physics",
        "portion",
        "remind",
        "secretary",
        "severe",
        "talent",
        "thesis",
        "uniform",
        "vision",
        "absorb",
        "boss",
        "committee",
        "contract",
        "crew",
        "devote",
        "dig",
        "dine",
        "donate",
        "double",
        "elevate",
        "flavor",
        "foundation",
        "generation",
        "handle",
        "layer",
        "mud",
        "smooth",
        "soil",
        "unique",
    )
    val wordsList4 = arrayListOf(
        "chamber",
        "deny",
        "document",
        "emphasize",
        "fever",
        "flu",
        "freeze",
        "gesture",
        "interrupt",
        "last",
        "likeness",
        "moreover",
        "perspective",
        "rational",
        "recover",
        "rely",
        "shock",
        "shy",
        "stare",
        "thus",
        "aim",
        "attach",
        "bet",
        "carriage",
        "classic",
        "commute",
        "confirm",
        "criticize",
        "differ",
        "expense",
        "formal",
        "height",
        "invent",
        "junior",
        "labor",
        "mechanic",
        "prime",
        "shift",
        "signal",
        "sincere",
        "ability",
        "agriculture",
        "cartoon",
        "ceiling",
        "convince",
        "curious",
        "delay",
        "diary",
        "element",
        "faith",
        "grain",
        "greet",
        "investigate",
        "joy",
        "label",
        "monk",
        "odd",
        "pause",
        "priest",
        "profession",
        "adopt",
        "beg",
        "beyond",
        "costume",
        "exclaim",
        "extend",
        "fool",
        "forbid",
        "illustrate",
        "indeed",
        "interpret",
        "kindly",
        "motive",
        "nest",
        "origin",
        "reception",
        "reject",
        "silence",
        "stream",
        "tone",
        "accomplish",
        "approve",
        "approximate",
        "barrier",
        "detect",
        "duty",
        "elementary",
        "failure",
        "gradual",
        "immigrant",
        "insert",
        "instant",
        "poverty",
        "pretend",
        "rank",
        "recognition",
        "refrigerate",
        "rent",
        "retire",
        "statistic",
    )
    val wordsList5 = arrayListOf(
        "astronaut",
        " awake",
        " courage",
        " float",
        " grant",
        " gravity",
        " jewel",
        " miner",
        " mineral",
        " participate",
        " permission",
        " pour",
        " presence",
        " raw",
        " satellite",
        " scale",
        " skip",
        " stretch",
        " telescope",
        " underground",
        " alarm",
        " apart",
        " arrest",
        " award",
        " breed",
        " bucket",
        " contest",
        " convict",
        " garage",
        " journalist",
        " pup",
        " qualify",
        " repair",
        " resume",
        " rob",
        " slip",
        " somewhat",
        " stable",
        " tissue",
        " yard",
        " alike",
        " annoy",
        " architecture",
        " artificial",
        " chain",
        " distinct",
        " distinguish",
        " dust",
        " excitement",
        " heal",
        " inherit",
        " manner",
        " mount",
        " roof",
        " shortage",
        " solid",
        " stock",
        " substance",
        " tomb",
        " wound",
        " bath",
        " bend",
        " chew",
        " disabled",
        " fantastic",
        " fiction",
        " flag",
        " inspect",
        " journal",
        " liquid",
        " marvel",
        " nutrient",
        " overcome",
        " recall",
        " regret",
        " soul",
        " sufficient",
        " surgery",
        " tough",
        " tube",
        " admit",
        " bin",
        " bowl",
        " cabin",
        " cash",
        " criminal",
        " dozen",
        " elder",
        " facial",
        " fence",
        " inspire",
        " mere",
        " neat",
        " occasion",
        " penalty",
        " rude",
        " settle",
        " vehicle",
        " wallet",
        " yell",
    )
    val wordsList6 = arrayListOf(
        "accuse",
        " adjust",
        " amuse",
        " coral",
        " cotton",
        " crash",
        " deck",
        " engage",
        " firm",
        " fuel",
        " grand",
        " hurricane",
        " loss",
        " plain",
        " reef",
        " shut",
        " strict",
        " surf",
        " task",
        " zone",
        " apology",
        " bold",
        " capture",
        " cardinal",
        " duke",
        " expose",
        " guilty",
        " hire",
        " innocent",
        " jail",
        " minister",
        " ordinary",
        " permanent",
        " preserve",
        " pronounce",
        " resemble",
        " symptom",
        " tobacco",
        " twin",
        " witch",
        " accompany",
        " bare",
        " branch",
        " breath",
        " bridge",
        " cast",
        " dare",
        " electronic",
        " inn",
        " net",
        " philosophy",
        " pot",
        " seed",
        " sharp",
        " sort",
        " subtract",
        " tight",
        " virtual",
        " weigh",
        " whisper",
        " abstract",
        " annual",
        " clay",
        " cloth",
        " curtain",
        " deserve",
        " feather",
        " fertile",
        " flood",
        " furniture",
        " grave",
        " ideal",
        " intelligence",
        " nowadays",
        " obtain",
        " religious",
        " romantic",
        " shell",
        " shore",
        " wheel",
        " appeal",
        " assume",
        " borrow",
        " client",
        " downtown",
        " dull",
        " embarrass",
        " fare",
        " former",
        " formula",
        " found",
        " invest",
        " loan",
        " practical",
        " quarter",
        " salary",
        " scholarship",
        " temporary",
        " treasure",
        " urge",
    )

    val changeColor = arrayListOf("#549cf1", "#708cb2", "#fFb800", "#22ddca")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        binding = FragmentEssentialWords2Binding.inflate(layoutInflater)
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

    private fun Click() {

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
}
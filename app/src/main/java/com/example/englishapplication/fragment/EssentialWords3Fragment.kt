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
import com.example.englishapplication.databinding.FragmentEssentialWords3Binding
import com.example.englishapplication.fragment.saveWords.SaveWordsFragment
import com.example.room.data.User
import com.example.room.data.UserViewModel
import java.util.*

class EssentialWords3Fragment : Fragment() {

    lateinit var mUserViewModel: UserViewModel
    lateinit var binding: FragmentEssentialWords3Binding

    val wrongWords = arrayListOf<String>()
    val wordsList1 = arrayListOf(
        "arise",
        "benefactor",
        "blacksmith",
        "charitable",
        "chimney",
        "compensate",
        "encounter",
        "exceed",
        "forge",
        "humble",
        "iron",
        "ladder",
        "modest",
        "occupy",
        "penny",
        "preach",
        "prosper",
        "province",
        "satisfaction",
        "sustain",
        "acquire",
        "awkward",
        "caretaker",
        "deceive",
        "discourage",
        "fake",
        "hatred",
        "hut",
        "inferior",
        "lodge",
        "neglect",
        "newcomer",
        "offense",
        "overlook",
        "repay",
        "ridiculous",
        "satisfactory",
        "shepherd",
        "venture",
        "wheat",
        "alley",
        "ax",
        "bunch",
        "chore",
        "decent",
        "disgrace",
        "elbow",
        "grateful",
        "irritate",
        "kid",
        "loose",
        "offend",
        "overnight",
        "persist",
        "pine",
        "scar",
        "sensation",
        "sled",
        "tease",
        "valentine",
        "bloom",
        "compact",
        "curl",
        "decay",
        "dessert",
        "dip",
        "distant",
        "eclipse",
        "fairy",
        "grace",
        "leisure",
        "mankind",
        "passion",
        "pillow",
        "pulse",
        "refresh",
        "sneeze",
        "spice",
        "whistle",
        "wool",
        "acquaint",
        "cemetery",
        "curse",
        "disguise",
        "fancy",
        "flashlight",
        "hood",
        "inhabitant",
        "nourish",
        "pirate",
        "publication",
        "riddle",
        "rot",
        "scare",
        "shortly",
        "skeleton",
        "spoil",
        "starve",
        "thrill",
        "wicked",
    )
    val wordsList2 = arrayListOf(
        "alert",
        "broadcast",
        "bulletin",
        "bump",
        "chop",
        "closet",
        "console",
        "district",
        "drawer",
        "endure",
        "execute",
        "grasp",
        "rear",
        "senator",
        "skull",
        "stir",
        "tap",
        "tremendous",
        "underneath",
        "worm",
        "abandon",
        "ambitious",
        "bark",
        "bay",
        "brilliant",
        "chin",
        "complaint",
        "deaf",
        "enthusiastic",
        "expedition",
        "horizon",
        "loyal",
        "mayor",
        "mutual",
        "overweight",
        "refuge",
        "restore",
        "rub",
        "senses",
        "veterinarian",
        "anniversary",
        "arithmetic",
        "ashamed",
        "burst",
        "carpenter",
        "coal",
        "couch",
        "drip",
        "elegant",
        "fabric",
        "highlands",
        "ivory",
        "mill",
        "needle",
        "polish",
        "sew",
        "shed",
        "thread",
        "trim",
        "upwards",
        "ail",
        "ally",
        "boast",
        "bounce",
        "bully",
        "carbohydrate",
        "crawl",
        "defeat",
        "dial",
        "dominant",
        "mercy",
        "nod",
        "opponent",
        "quarrel",
        "rival",
        "sore",
        "sting",
        "strain",
        "torture",
        "wrestle",
        "absence",
        "aloud",
        "bald",
        "blanket",
        "creep",
        "divorce",
        "imitate",
        "infant",
        "kidnap",
        "nap",
        "nowhere",
        "pat",
        "relief",
        "reproduce",
        "rhyme",
        "suck",
        "urgent",
        "vanish",
        "wagon",
        "wrinkle",
    )
    val wordsList3 = arrayListOf(

        "abnormal",
        " bamboo",
        " blossom",
        " compass",
        " dialect",
        " dishonest",
        " dwarf",
        " ecosystem",
        " fatal",
        " impatient",
        " leaf",
        " manuscript",
        " marsh",
        " patience",
        " perfume",
        " pond",
        " proverb",
        " pursuit",
        " recite",
        " wilderness",
        " anticipate",
        " barrel",
        " beam",
        " casual",
        " caution",
        " contrary",
        " deliberate",
        " dissolve",
        " explode",
        " fasten",
        " germ",
        " kit",
        " puff",
        " rag",
        " scatter",
        " scent",
        " steel",
        " swift",
        " toss",
        " triumph",
        " aboard",
        " bitter",
        " bullet",
        " devil",
        " drift",
        " enforce",
        " fountain",
        " harbor",
        " inhabit",
        " march",
        " millionaire",
        " port",
        " sheriff",
        " startle",
        " sweat",
        " trigger",
        " unify",
        " vessel",
        " voyage",
        " worship",
        " apprentice",
        " assure",
        " bandage",
        " bleed",
        " bond",
        " chef",
        " crown",
        " departure",
        " diligent",
        " emperor",
        " fiber",
        " horrible",
        " impolite",
        " kneel",
        " luxury",
        " massive",
        " panic",
        " priority",
        " robe",
        " scold",
        " affair",
        " assembly",
        " bless",
        " cereal",
        " cheerful",
        " diameter",
        " exploit",
        " famine",
        " harvest",
        " merry",
        " nut",
        " pardon",
        " pharaoh",
        " ripe",
        " roast",
        " routine",
        " scheme",
        " slim",
        " stove",
        " theft",
    )
    val wordsList4 = arrayListOf(
                "adolescent",
                "aptitude",
                "compliment",
                "hinder",
                "journalism",
                "jury",
                "justice",
                "liberty",
                "literary",
                "pharmacy",
                "pill",
                "presume",
                "privacy",
                "punishment",
                "sensible",
                "slice",
                "sorrow",
                "straw",
                "swell",
                "tidy",
                "affection",
                "agency",
                "ash",
                "confine",
                "dismiss",
                "erupt",
                "fate",
                "lava",
                "miserable",
                "navigate",
                "originate",
                "remainder",
                "retrieve",
                "shallow",
                "slope",
                "span",
                "superstition",
                "sympathy",
                "vibrate",
                "wander",
                "armor",
                "blare",
                "boom",
                "cliff",
                "flame",
                "independence",
                "invasion",
                "knight",
                "lightning",
                "rebel",
                "retreat",
                "revolution",
                "spear",
                "steep",
                "summit",
                "thunder",
                "troops",
                "warrior",
                "withdraw",
                "yield",
                "bench",
                "confront",
                "daisy",
                "dispute",
                "horror",
                "incident",
                "mist",
                "object",
                "orphan",
                "plot",
                "pregnant",
                "rage",
                "revenge",
                "shame",
                "sigh",
                "sneak",
                "spare",
                "stem",
                "supper",
                "tender",
                "beneath",
                "cub",
                "dawn",
                "dissatisfied",
                "ease",
                "evident",
                "hail",
                "howl",
                "leap",
                "magnificent",
                "necessity",
                "outcome",
                "pile",
                "profound",
                "seize",
                "squeeze",
                "supreme",
                "terrific",
                "trait",
                "vital",
    )
    val wordsList5 = arrayListOf(
                "accustomed",
                "affirm",
                "astonished",
                "bang",
                "clan",
                "dim",
                "emphasis",
                "fable",
                "feast",
                "glow",
                "hollow",
                "instinct",
                "joint",
                "leak",
                "physician",
                "sacrifice",
                "stiff",
                "stroke",
                "tragic",
                "tune",
                "accommodate",
                "circus",
                "coincide",
                "commission",
                "dose",
                "dye",
                "extent",
                "gender",
                "headline",
                "informal",
                "inquire",
                "messenger",
                "peer",
                "portrait",
                "pose",
                "ranch",
                "steer",
                "stripe",
                "tame",
                "tempt",
                "Aborigine",
                "ban",
                "cautious",
                "confess",
                "cottage",
                "daytime",
                "desperate",
                "fade",
                "fierce",
                "gamble",
                "lawn",
                "mow",
                "outlaw",
                "prospect",
                "purse",
                "rod",
                "seldom",
                "shave",
                "terrified",
                "wizard",
                "bulb",
                "bundle",
                "cattle",
                "flee",
                "graze",
                "greed",
                "herd",
                "initiate",
                "lane",
                "luggage",
                "nerve",
                "optimist",
                "parade",
                "pave",
                "phantom",
                "portable",
                "poster",
                "scratch",
                "symphony",
                "widow",
                "circulate",
                "consequent",
                "derive",
                "drown",
                "dynasty",
                "fraction",
                "frost",
                "illusion",
                "invade",
                "lieutenant",
                "marine",
                "merit",
                "navy",
                "polar",
                "ray",
                "resign",
                "suicide",
                "tremble",
                "underlying",
                "via",
    )
    val wordsList6 = arrayListOf(
                "alter",
               " aside",
               " autumn",
               " blend",
               " collapse",
               " crush",
               " curve",
               " disgusting",
               " drain",
               " embrace",
               " envy",
               " fireworks",
               " flour",
               " fuse",
               " ginger",
               " jealous",
               " paste",
               " receipt",
               " wipe",
               " wire",
               " acknowledge",
               " ambassador",
               " blonde",
               " conquer",
               " drag",
               " exaggerate",
               " heritage",
               " insult",
               " meanwhile",
               " necklace",
               " noble",
               " precious",
               " prejudice",
               " rumor",
               " sin",
               " spectacle",
               " stack",
               " suspicious",
               " tin",
               " vase",
               " ache",
               " arctic",
               " canal",
               " chemist",
               " chill",
               " congress",
               " dairy",
               " descend",
               " grocer",
               " hesitate",
               " institution",
               " jog",
               " merchant",
               " poke",
               " postpone",
               " splash",
               " stubborn",
               " suburb",
               " tide",
               " tragedy",
               " bomb",
               " certificate",
               " circumstance",
               " coffin",
               " cope",
               " criticism",
               " devastate",
               " frown",
               " gaze",
               " glance",
               " grief",
               " groom",
               " license",
               " microscope",
               " nuclear",
               " portray",
               " rotate",
               " souvenir",
               " submarine",
               " trace",
               " appliance",
               " basin",
               " broom",
               " caterpillar",
               " cupboard",
               " delicate",
               " emerge",
               " handicap",
               " hook",
               " hop",
               " laundry",
               " pursue",
               " reluctant",
               " sleeve",
               " spine",
               " stain",
               " strip",
               " swear",
               " swing",
               " utilize",
    )
    val changeColor = arrayListOf("#549cf1", "#708cb2", "#fFb800", "#22ddca")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        binding = FragmentEssentialWords3Binding.inflate(layoutInflater)
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
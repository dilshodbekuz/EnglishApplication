package com.example.englishapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.englishapplication.databinding.FragmentEssentialBinding
import com.example.englishapplication.fragment.*

class EssentialFragment : Fragment() {
    lateinit var binding: FragmentEssentialBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentEssentialBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.words1.setOnClickListener {
            val transaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainerView, EssentialWords1Fragment())
            transaction.addToBackStack(null)
            transaction.commit()
        }
        binding.words2.setOnClickListener {
            val transaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainerView, EssentialWords2Fragment())
            transaction.addToBackStack(null)
            transaction.commit()
        }
        binding.words3.setOnClickListener {
            val transaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainerView, EssentialWords3Fragment())
            transaction.addToBackStack(null)
            transaction.commit()
        }
        binding.words4.setOnClickListener {
            val transaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainerView, EssentialWords4Fragment())
            transaction.addToBackStack(null)
            transaction.commit()
        }
        binding.words5.setOnClickListener {
            val transaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainerView, EssentialWords5Fragment())
            transaction.addToBackStack(null)
            transaction.commit()
        }
        binding.words6.setOnClickListener {
            val transaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainerView, EssentialWords6Fragment())
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }
}
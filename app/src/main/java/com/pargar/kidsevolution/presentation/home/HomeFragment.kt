package com.pargar.kidsevolution.presentation.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.pargar.kidsevolution.R
import com.pargar.kidsevolution.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
    }


    private fun initListeners() {
        with(binding) {
            bBack.setOnClickListener{activity?.onBackPressed()}
            bPlay.setOnClickListener { findNavController().navigate(R.id.action_homeFragment_to_juegoParejasFragment)}
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
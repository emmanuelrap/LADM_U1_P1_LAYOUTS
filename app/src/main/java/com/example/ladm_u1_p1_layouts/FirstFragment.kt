package com.example.ladm_u1_p1_layouts

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ladm_u1_p1_layouts.databinding.FragmentFirstBinding
import com.example.ladm_u1_p1_layouts.ui.login.LoginActivity

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button9.setOnClickListener {
            binding.tv2.setText(">> Comida <<")
        }
        binding.button8.setOnClickListener {
            binding.tv2.setText(">> PC's <<")
        }
        binding.button7.setOnClickListener {
            binding.tv2.setText(">> Autos <<")
        }
        binding.button.setOnClickListener {
            binding.tv2.setText(">> Casas <<")
        }




    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null

    }
}
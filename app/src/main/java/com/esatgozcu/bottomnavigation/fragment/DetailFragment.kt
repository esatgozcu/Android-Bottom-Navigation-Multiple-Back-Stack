package com.esatgozcu.bottomnavigation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.esatgozcu.bottomnavigation.R
import com.esatgozcu.bottomnavigation.databinding.FragmentDetailBinding
import com.esatgozcu.bottomnavigation.databinding.FragmentHomeBinding

class DetailFragment : Fragment() {

    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textView.text = findNavController()
            .previousBackStackEntry?.destination?.displayName
            .toString()
            .split("/")[1]
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
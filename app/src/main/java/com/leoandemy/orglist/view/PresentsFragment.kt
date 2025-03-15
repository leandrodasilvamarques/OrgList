package com.leoandemy.orglist.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.leoandemy.orglist.databinding.FragmentPresentsBinding
import com.leoandemy.orglist.viewmodel.PresentsViewModel
import kotlin.jvm.java

class PresentsFragment : Fragment() {

    private var _binding: FragmentPresentsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val viewModel =
            ViewModelProvider(this).get(PresentsViewModel::class.java)

        _binding = FragmentPresentsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textPresents
        viewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
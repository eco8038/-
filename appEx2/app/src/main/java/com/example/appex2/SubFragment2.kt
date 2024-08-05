package com.example.appex2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels

class SubFragment2 : Fragment() {

    private val viewModel: SharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_sub2, container, false)
        val resultTextView: TextView = view.findViewById(R.id.resultTextView)

        viewModel.apiResponse.observe(viewLifecycleOwner) { response ->
            resultTextView.text = response
        }

        return view
    }
}

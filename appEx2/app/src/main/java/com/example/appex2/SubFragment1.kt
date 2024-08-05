package com.example.appex2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels

class SubFragment1 : Fragment() {

    private val viewModel: SharedViewModel by activityViewModels()
    private lateinit var searchEditText: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_sub1, container, false)
        searchEditText = view.findViewById(R.id.searchEditText)
        val searchButton: Button = view.findViewById(R.id.searchButton)

        searchButton.setOnClickListener {
            val query = searchEditText.text.toString()
            viewModel.setSearchQuery(query)
            // 서브 탭 2로 이동
            (activity as MainActivity).moveToSubTab2()
        }

        return view
    }
}

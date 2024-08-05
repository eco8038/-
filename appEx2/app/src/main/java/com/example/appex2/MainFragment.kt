package com.example.appex2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)

        val startButton: Button = view.findViewById(R.id.startButton)
        startButton.setOnClickListener {
            // 서브 탭 1로 이동
            (activity as MainActivity).moveToSubTab1()
        }

        return view
    }
}

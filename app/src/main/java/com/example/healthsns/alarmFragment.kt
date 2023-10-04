package com.example.healthsns

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment

class AlarmFragment: DialogFragment() {

    private lateinit var btn1:Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.alarm_fragment, container, false)

        btn1 = view.findViewById(R.id.alarm_btn1)
        btn1.setOnClickListener {
            this.dismiss()
        }

        return view
    }
}
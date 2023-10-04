package com.example.healthsns

import android.app.Dialog
import android.content.Context
import android.graphics.Point
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.Button
import androidx.fragment.app.DialogFragment

class FollowFragment : DialogFragment() {

    private lateinit var btn1 : Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.follow_fragment, container, false)

        btn1 = view.findViewById(R.id.follow_btn1)
        btn1.setOnClickListener {
            this.dismiss()
        }

        return view
    }

}
package com.example.healthsns

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment

class ProfilePlanEditFragment: DialogFragment() {
    private lateinit var btn1 : Button
    private lateinit var btn2 : Button
    private lateinit var btn3 : Button
    private lateinit var btn4 : Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.profile_plan_edit_fragment, container, false)
        btn1 = view.findViewById(R.id.profile_plan_edit_btn1)

        btn2 = view.findViewById(R.id.profile_plan_edit_btn2)

        btn3 = view.findViewById(R.id.profile_plan_edit_btn3)

        btn4 = view.findViewById(R.id.profile_plan_edit_btn4)

        btn4.setOnClickListener {
            this.dismiss()
        }

        return view
    }
}
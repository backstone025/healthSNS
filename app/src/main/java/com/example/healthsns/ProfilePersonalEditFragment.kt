package com.example.healthsns

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment

class ProfilePersonalEditFragment: DialogFragment() {

    private lateinit var btn1 : Button
    private lateinit var btn2 : Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.profile_personal_edit, container, false)

        btn1 = view.findViewById(R.id.profile_personal_btn1)

        btn2 = view.findViewById(R.id.profile_personal_btn2)

        btn1.setOnClickListener {
            this.dismiss()
        }

        return view
    }
}
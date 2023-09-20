package com.example.healthsns

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class AlarmFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // 여기에 첫 번째 Fragment의 레이아웃을 inflate하고 초기화하는 코드를 작성합니다.
        return inflater.inflate(R.layout.alarm_fragment, container, false)
    }
}
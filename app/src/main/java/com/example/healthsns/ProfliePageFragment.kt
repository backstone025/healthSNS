package com.example.healthsns

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date

class ProfliePageFragment:Fragment() {

    private lateinit var calendar: Calendar
    private var year: Int = 0
    private var month: Int = 0
    private var day: Int = 0

    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button
    private lateinit var btn4: Button
    private lateinit var btn5: Button

    private lateinit var tv1: TextView
    private lateinit var tv2: TextView
    private lateinit var tv3: TextView
    private lateinit var tv4: TextView
    private lateinit var tv5: TextView

    private lateinit var iv1: ImageView

    private lateinit var switch1: Switch

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.profile_page, container, false)

        calendar = Calendar.getInstance()
        calendar.time = Date()

        // -> 개인 정보 설정
        btn1 = view.findViewById(R.id.profile_page_setting1)

        // -> 운동 계획 편집
        btn2 = view.findViewById(R.id.profile_page_setting2)

        // -> 팔로우
        btn3 = view.findViewById(R.id.profile_page_btn1)


        // -> 달력 넘김 버튼
        btn4 = view.findViewById(R.id.profile_page_btn2)
        btn5 = view.findViewById(R.id.profile_page_btn3)

        tv1 = view.findViewById(R.id.profile_page_nickname)

        // -> 신체 정보
        tv2 = view.findViewById(R.id.profile_page_tv6)
        tv3 = view.findViewById(R.id.profile_page_tv7)
        tv4 = view.findViewById(R.id.profile_page_tv8)

        tv5 = view.findViewById(R.id.profile_page_date)

        iv1 = view.findViewById(R.id.profile_page_picture)

        // -> 개인 정보 공개 여부
        switch1 = view.findViewById(R.id.profile_page_switch1)

        btn1.setOnClickListener {
            val dialog1 = ProfilePersonalEditFragment()
            dialog1.show(requireActivity().supportFragmentManager, "ProfilePersonalEditFragment")
        }

        btn2.setOnClickListener {
            val dialog2 = ProfilePlanEditFragment()
            dialog2.show(requireActivity().supportFragmentManager, "ProfilePlanEditFragment")
        }

        btn3.setOnClickListener {
            val dialog3 = FollowFragment()
            dialog3.show(requireActivity().supportFragmentManager, "FollowFragment")
        }



        btn4.setOnClickListener {
            calendar.add(Calendar.DATE, -1)
            applyCalendar()
        }

        btn5.setOnClickListener {
            calendar.add(Calendar.DATE, 1)
            applyCalendar()
        }

        applyCalendar()

        return view
    }

    fun applyCalendar(){
        val formatter1 = SimpleDateFormat("yyyy")
        val formatter2 = SimpleDateFormat("MM")
        val formatter3 = SimpleDateFormat("dd")

        year = formatter1.format(calendar.time).toInt()
        month = formatter2.format(calendar.time).toInt()
        day = formatter3.format(calendar.time).toInt()

        tv5.text = "$year.$month.$day"
    }

}
package com.example.healthsns

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter


class ViewPageAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return 2 // 예시로 2개의 슬라이드를 설정합니다.
    }

    override fun createFragment(position: Int): Fragment {
        // position에 따라 반환할 Fragment를 선택합니다.
        return when (position) {
            0 -> AlarmFragment()
            1 -> FeedEditFragment()
            else -> throw IllegalArgumentException("Invalid position")
        }
    }
}

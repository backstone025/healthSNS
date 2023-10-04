import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.healthsns.AlarmFragment
import com.example.healthsns.CommunityPageFragment
import com.example.healthsns.FeedEditFragment
import com.example.healthsns.FeedPageFragment
import com.example.healthsns.ProfliePageFragment

class ViewPageAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return 3 // 예시로 3개의 슬라이드를 설정합니다.
    }

    override fun createFragment(position: Int): Fragment {
        // position에 따라 반환할 Fragment를 선택합니다.
        val fragment = when (position) {
            0 -> CommunityPageFragment()
            1 -> FeedPageFragment()
            2 -> ProfliePageFragment()
            else -> throw IllegalArgumentException("Invalid position")
        }

        return fragment
    }

}



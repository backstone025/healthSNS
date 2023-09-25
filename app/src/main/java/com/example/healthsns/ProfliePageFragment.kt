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
import androidx.fragment.app.Fragment
import com.example.healthsns.DialogUtil.Companion.dialogResize

class ProfliePageFragment:Fragment() {

    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button
    private lateinit var btn4: Button
    private lateinit var btn5: Button
    private lateinit var btn6: Button
    private lateinit var btn7: Button
    private lateinit var btn8: Button
    private lateinit var btn9: Button


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.profile_page, container, false)

        btn1 = view.findViewById(R.id.profile_page_setting1)
        btn2 = view.findViewById(R.id.profile_page_setting2)
        btn3 = view.findViewById(R.id.profile_page_picture)
        btn4 = view.findViewById(R.id.profile_page_btn1)
        btn5 = view.findViewById(R.id.profile_page_btn2)
        btn6 = view.findViewById(R.id.profile_page_btn3)
        btn7 = view.findViewById(R.id.profile_page_btn4)
        btn8 = view.findViewById(R.id.profile_page_btn5)
        btn9 = view.findViewById(R.id.profile_page_btn6)

        btn2.setOnClickListener {

        }

        btn4.setOnClickListener {
            val dialog4 = Dialog(requireContext(), R.style.CustomDialog)
            dialog4.setContentView(R.layout.follow_fragment)
            requireContext().dialogResize(dialog4, 0.8f, 0.6f)
            dialog4.show()
        }

        return view
    }

}

class DialogUtil {
    companion object {
        fun Context.dialogResize(dialog: Dialog, width: Float, height: Float){
            val windowManager = getSystemService(Context.WINDOW_SERVICE) as WindowManager

            if (Build.VERSION.SDK_INT < 30){
                val display = windowManager.defaultDisplay
                val size = Point()

                display.getSize(size)

                val window = dialog.window

                val x = (size.x * width).toInt()
                val y = (size.y * height).toInt()

                window?.setLayout(x, y)

            }else{
                val rect = windowManager.currentWindowMetrics.bounds

                val window = dialog.window
                val x = (rect.width() * width).toInt()
                val y = (rect.height() * height).toInt()

                window?.setLayout(x, y)
            }
        }
    }
}

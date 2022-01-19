package org.techtown.andriodlab

import android.graphics.Typeface
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import org.techtown.andriodlab.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //이름 문자열 출력 TextView 생성
        val name = TextView(this).apply{
            typeface = Typeface.DEFAULT_BOLD
            text = "Lake Stef"
        }

        //이미지 출력 ImageView 생성
        val image = ImageView(this).also{
           // it.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.lake_1))
        }

        val address = TextView(this).apply{
            typeface = Typeface.DEFAULT_BOLD
            text = "Address of Lake Stef"
        }

        val layout = LinearLayout(this).apply{
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            //LinearLayout 객체에 TextView, ImageView, TextView 객체 추가
            addView(name, WRAP_CONTENT,WRAP_CONTENT)
            //addView(image, WRAP_CONTENT,WRAP_CONTENT)
            addView(address, WRAP_CONTENT,WRAP_CONTENT)
        }


        //setContentView(layout)
        //XML 화면 출력, 뷰 겍체 생성 완료
        //setContentView(R.layout.activity_main)

        //---------------------------------------------------------------------Ch06
        //for ch06 XML file: R.layout.activity_ch06_learning_layout_xml
        //XML 화면 출력, 뷰 겍체 생성 완료
        //setContentView(R.layout.activity_ch06_learning_layout_xml)
        //setContentView(R.layout.activity_ch06_learning_visibility)
        //setContentView(R.layout.activity_ch06_learning_basic_views)
        //button and texteditor:
        setContentView(R.layout.activity_ch06_learning_basic_buttons_and_texteditors)
        //butterknife:
        //setContentView(R.layout.activity_ch06_learning_basic_butterknife)
        /*
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button1.setOnClickLisener{
            binding.button1.visibility = View.INVISIBLE
        }
        */

        //id 값으로 뷰 객체 확등
        //val buttonView1 = findViewById<TextView>(R.id.text1)
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------Ch07
        //---------------------------------------------------------------------
    }
}

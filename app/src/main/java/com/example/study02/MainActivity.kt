 package com.example.study02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_rain.setOnClickListener {
            //텍스트 바꿈
            textView.text = "Rainy"
            imageView.setImageResource(R.drawable.cloudy02)
        }

        btn_snow.setOnClickListener {
            textView.text = "Snow"
            imageView.setImageResource(R.drawable.snowy01)
        }

        btn_sunny.setOnClickListener {
            textView.text = "sunny"
            imageView.setImageResource(R.drawable.sunny01)
        }
    }
     //일단 하긴 했는데 제 노트북에서 에뮬이 돌아가질 않습니다. ㅋㅋㅋㅋㅋㅋㅋ (맥북 베타버전으로 올렸는데 버전이 지원하지 않는거 같아요ㅠㅠ)
}
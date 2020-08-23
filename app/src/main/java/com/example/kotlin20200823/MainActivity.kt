package com.example.kotlin20200823

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_click.setOnClickListener {
            Log.d("log", "버튼이 클릭되었습니다")
        }

        btn_make_log.setOnClickListener {
            Log.d("메인","로그남기기 버튼 눌림")
            Log.e("메인", "에러로그 체험")
        }

        btn_make_toast.setOnClickListener {
//            사용자에게 버튼 눌림이라는 안내문구
            Toast.makeText(this@MainActivity, "버튼이 눌렸습니다.", Toast.LENGTH_SHORT).show()
        }
    }
}
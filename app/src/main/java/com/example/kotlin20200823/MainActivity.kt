package com.example.kotlin20200823

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
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
            Log.d("메인", "로그남기기 버튼 눌림")
            Log.e("메인", "에러로그 체험")
        }

        btn_make_toast.setOnClickListener {
//            사용자에게 버튼 눌림이라는 안내문구
            Toast.makeText(this@MainActivity, "버튼이 눌렸습니다.", Toast.LENGTH_SHORT).show()
        }

        btn_text_toast.setOnClickListener {
            var msg = edit_toast_msg.text
            Toast.makeText(this@MainActivity, msg, Toast.LENGTH_SHORT).show()
            Log.d("main",msg.toString())
            when {
                msg.toString() == "안녕하세요" -> {
                    Toast.makeText(this@MainActivity, "인사", Toast.LENGTH_SHORT).show()
                }
                msg.toString() == "안녕히 가세요" -> {
                    Toast.makeText(this@MainActivity, "작별인사", Toast.LENGTH_SHORT).show()
                }
                else -> {
                    Toast.makeText(this@MainActivity, "문장이 잘못되었습니다.", Toast.LENGTH_SHORT).show()
                }
            }

//            when (msg.toString()) {
//                "안녕하세요", "안녕히 가세요" -> Toast.makeText(this@MainActivity, "인사", Toast.LENGTH_SHORT)
//                    .show()
//
//                else -> Toast.makeText(this@MainActivity, "XXX", Toast.LENGTH_SHORT).show()
//
//            }
        }

        btn_change_text.setOnClickListener {
            val msg = edit_text_change.text
            text_text_chage.text = msg.toString()
        }

        btn_greeting.setOnClickListener {
            val name = edit_greeting.text.toString()
            val printName = "안녕하세요 ${name} 입니다."
            Toast.makeText(this@MainActivity, printName, Toast.LENGTH_SHORT).show()

        }

    }
}
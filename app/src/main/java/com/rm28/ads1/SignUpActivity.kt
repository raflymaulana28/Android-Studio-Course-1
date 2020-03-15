package com.rm28.ads1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        button2.setOnClickListener{
            back()
        }
        textView4.setOnClickListener {
          back()
        }
    }
    override fun onBackPressed(){
       back()
    }
    private fun back(){
        finish()
        overridePendingTransition(R.anim.no_animation,R.anim.slide_out)
    }
}

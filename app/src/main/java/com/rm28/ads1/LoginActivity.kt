package com.rm28.ads1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        button2.setOnClickListener{
            startActivity(Intent(this,HomeActivity::class.java))
            overridePendingTransition(R.anim.slide_in,R.anim.slide_in_out)
        }
        textView4.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
            overridePendingTransition(R.anim.slide_in, R.anim.slide_in_out)
        }
    }
    override fun onBackPressed(){
        finish()
    }
}

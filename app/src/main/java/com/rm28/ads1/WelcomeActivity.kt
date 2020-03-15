package com.rm28.ads1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*
import com.rm28.ads1.LoginActivity as LoginActivity

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        button.setOnClickListener{
            finish()
            startActivity(Intent(this,LoginActivity::class.java))
            overridePendingTransition(R.anim.slide_in,R.anim.slide_in_out)
    }
    }
}

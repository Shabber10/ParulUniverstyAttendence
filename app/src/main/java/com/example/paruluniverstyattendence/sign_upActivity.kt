package com.example.paruluniverstyattendence

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val btnPiet = findViewById<Button>(R.id.btn_piet)
        btnPiet.setOnClickListener {
            val intent = Intent(this, PietActivity::class.java)
            startActivity(intent)
        }

        // Repeat the pattern for other buttons:
        // val btnAnotherBranch = findViewById<Button>(R.id.btn_another_branch)
        // btnAnotherBranch.setOnClickListener {
        //     val intent = Intent(this, AnotherBranchActivity::class.java)
        //     startActivity(intent)
        // }
    }
}

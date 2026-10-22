package com.example.activityintent

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.open_second_activity).setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }
}

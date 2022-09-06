package com.example.example

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var btn1:Button
    lateinit var btn2:Button
    lateinit var img1:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1=findViewById(R.id.btn0)
        btn2=findViewById(R.id.btn1)
        img1=findViewById(R.id.img)

        btn1.setOnClickListener {
            var i=Intent(this,MainActivity2::class.java)
            startActivity(i)
        }

        btn2.setOnClickListener {
           var url="https://github.com/arjungotgit"
            var i=Intent(Intent.ACTION_VIEW)
            i.setData(Uri.parse(url))
            startActivity(i)
        }
    }
}
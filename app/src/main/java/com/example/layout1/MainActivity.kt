package com.example.layout1

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.layout1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //启用binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //传统方法:查找

        val bot1:Button = findViewById(R.id.bot1)
        val bot2:Button = findViewById(R.id.bot2)
        bot1.setOnClickListener {
            Toast.makeText(this,"Button1 Clicked!",Toast.LENGTH_SHORT).show()
        }
        bot2.setOnClickListener {
            Toast.makeText(this,"Button2 Clicked!",Toast.LENGTH_SHORT).show()
        }

        //View Binding方法
        binding.bot3.setOnClickListener{
            Toast.makeText(this,"Button3 Clicked!",Toast.LENGTH_SHORT).show()
        }
        binding.bot4.setOnClickListener{
            Toast.makeText(this,"Button4 Clicked!",Toast.LENGTH_SHORT).show()

        }
    }
}
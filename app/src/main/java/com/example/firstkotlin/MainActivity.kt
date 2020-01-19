package com.example.firstkotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.firstkotlin.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.counter = getString(R.string.counter)
        binding.setToastButton(getString(R.string.toastButton))
        binding.setCountButton(getString(R.string.countButton))
        binding.setRandomButton(getString(R.string.randomButton))
    }

    fun toastMe(view : View) {
        val myToast = Toast.makeText(this, "Hello, Toast!", Toast.LENGTH_SHORT)

        myToast.show()
    }

    fun countMe(view : View) {
        val countString = textView.text.toString()

        var count: Int = Integer.parseInt(countString)
        count++

        textView.text = count.toString()
    }

    fun randomMe (view : View) {
        val randomIntent = Intent(this, SecondActivity::class.java)

        val countString = textView.text.toString()

        val count = Integer.parseInt(countString)

        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)

        startActivity(randomIntent)
    }
}

package com.example.firstkotlin.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.firstkotlin.R
import com.example.firstkotlin.data.SimpleViewModel
import com.example.firstkotlin.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val viewModel by lazy { ViewModelProviders.of(this).get(SimpleViewModel::class.java) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var binding: ActivityMainBinding = DataBindingUtil.setContentView(this,
            R.layout.activity_main
        )

        binding.lifecycleOwner = this

        binding.viewModel = viewModel
    }

    fun toastMe() {
        val myToast = Toast.makeText(this, "Hello, Toast!", Toast.LENGTH_SHORT)

        myToast.show()
    }

    fun randomMe () {
        val randomIntent = Intent(this, SecondActivity::class.java)

        val countString = textView.text.toString()

        val count = Integer.parseInt(countString)

        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)

        startActivity(randomIntent)
    }
}

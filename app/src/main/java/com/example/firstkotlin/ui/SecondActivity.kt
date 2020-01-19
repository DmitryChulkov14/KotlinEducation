package com.example.firstkotlin.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.firstkotlin.R
import kotlinx.android.synthetic.main.activity_second.*
import java.util.*

class SecondActivity : AppCompatActivity() {

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }

    fun showRandomNumber() {
        val count = intent.getIntExtra(TOTAL_COUNT, 0)

        val random = Random()
        var randomInt = 0

        if (count>0) {
            randomInt = random.nextInt(count + 1)
        }

        textViewRandom.text = randomInt.toString()

        textViewLabel.text = getString(R.string.random_heading, count)
    }
}

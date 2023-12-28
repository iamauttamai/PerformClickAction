package com.auttasoft.performclickaction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.auttasoft.clickaction.ButtonClickHandler

class MainActivity : AppCompatActivity() {
    private val buttonClickHandler = ButtonClickHandler()
    private var button: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)
        button?.setOnClickListener {
            buttonClickHandler.performClickAction {
                // Your custom click handling logic here
                // This block is invoked when the button is clicked and isClickable is true
                Log.e("ClickAction", "this log.")
            }
        }
    }
}
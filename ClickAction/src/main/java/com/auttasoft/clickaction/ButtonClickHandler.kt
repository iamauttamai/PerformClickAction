package com.auttasoft.clickaction

import android.os.Handler

/**
 * Created by AuttaphonL. on 28,ธันวาคม,2566
 */
// ButtonClickHandler.kt
class ButtonClickHandler {
    private var isButtonClickable = true
    private var delayMillis: Long = 2000 // Default delay is 2 second

    fun isClickable(): Boolean {
        return isButtonClickable
    }

    fun setClickable(clickable: Boolean) {
        isButtonClickable = clickable
    }

    fun setDelay(delayMillis: Long) {
        this.delayMillis = delayMillis
    }

    fun performClickAction(clickAction: () -> Unit) {
        if (isButtonClickable) {
            // Disable the button to prevent double-click
            setClickable(false)

            // Your custom click handling logic provided by the user
            clickAction.invoke()

            // Simulate a delay (replace this with your actual task)
            Handler().postDelayed({
                // Re-enable the button after the delay
                setClickable(true)
            }, delayMillis)
        }
    }
}

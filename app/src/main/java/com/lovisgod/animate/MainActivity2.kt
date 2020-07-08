package com.lovisgod.animate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.constraintlayout.motion.widget.MotionLayout

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val image = findViewById<ImageView>(R.id.image)
        val motion = findViewById<MotionLayout>(R.id.motionlayout)
        motion.transitionToEnd()
         motion.setTransitionListener(object: MotionLayout.TransitionListener {
             override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {

             }

             override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {

             }

             override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {

             }

             override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
                 startActivity(Intent(this@MainActivity2, MainActivity::class.java))
             }

         })
    }
}
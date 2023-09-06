package com.example.stopwatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    // public static final double PI = 3.14
    // in kotlin, we use a companion object:
    companion object {
            // TAG is the default var ame for labeling your log statements
            val TAG = "MainActivity"
            val ASTROPHYSICISTISTS = 3
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: this is a log")
    }

    // to override an existing function, just start typing it
    // can do this for the rest of the lifecycle functions (or any
    // function that exists in the superclass)
    override fun onStart() {
                                        super.onStart()
    }
    override fun onResume() {
        super.onResume()
    }
    override fun onPause() {
        super.onPause()
    }
    override fun onStop() {
        super.onStop()
    }
    override fun onRestart() {
        super.onRestart()
    }
    override fun onDestroy() {
        super.onDestroy()
    }
}

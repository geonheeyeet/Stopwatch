package com.example.stopwatch

import android.os.Bundle
import android.os.SystemClock
import android.util.Log
import android.widget.Button
import android.widget.Chronometer
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var Start: Button
    lateinit var Reset: Button
    lateinit var Clock: Chronometer
    var toggle = 2
    var timeWhenStopped: Long = 0

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
        wireWidgets()


        //https://stackoverflow.com/questions/5594877/android-chronometer-pause
        // i love you HenrikS
        Start.setOnClickListener {
            if(toggle == 2){
                Clock.setBase(SystemClock.elapsedRealtime() + timeWhenStopped);
                Clock.start()
                toggle ++
                Start.text = "Stop"
            }
            else{
                timeWhenStopped = Clock.getBase() - SystemClock.elapsedRealtime();
                Clock.stop()
                toggle = 2
                Start.text = "Start"
            }
        }
        Reset.setOnClickListener {
            Clock.setBase(SystemClock.elapsedRealtime())
            timeWhenStopped = 0
            Clock.stop()
            toggle = 2
            Start.text = "Start"
        }

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

    private fun wireWidgets(){
        Start = findViewById(R.id.button_main_start)
        Reset = findViewById(R.id.button_main_reset)
        Clock = findViewById(R.id.chronometer_main_stopwatch)
    }
}

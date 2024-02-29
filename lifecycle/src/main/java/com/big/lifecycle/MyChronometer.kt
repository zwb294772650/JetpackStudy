package com.big.lifecycle

import android.content.Context
import android.os.SystemClock
import android.util.AttributeSet
import android.widget.Chronometer
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent


class MyChronometer : Chronometer, LifecycleObserver {
     private var elapsedTime:Long = 0
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {}


     @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
     private fun startMeter(){
        base = SystemClock.elapsedRealtime() - elapsedTime
        start()
     }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
     private fun stopMeter(){
         elapsedTime =  SystemClock.elapsedRealtime() - base
         stop()
     }
}
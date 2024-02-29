package com.big.lifecycle;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Chronometer;

import androidx.lifecycle.LifecycleObserver;

public class Testa extends Chronometer implements LifecycleObserver {
    public Testa(Context context) {
        super(context);
    }

    public Testa(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Testa(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public Testa(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}

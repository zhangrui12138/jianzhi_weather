package com.example.weather_jianzhi.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.widget.ScrollView;

import com.example.weather_jianzhi.util.LoggerUtil;

public class MyScrollView extends ScrollView {
    private VelocityTracker velocityTracker;
    private LoggerUtil loggerUtil;
    public MyScrollView(Context context) {
        super(context);
        init();
    }

    public MyScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    private void init(){
        velocityTracker = VelocityTracker.obtain();
        loggerUtil = new LoggerUtil();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if(velocityTracker != null) {
            velocityTracker.addMovement(ev);
            velocityTracker.computeCurrentVelocity(1000);
            /*loggerUtil.debug("velocityTrackerY="+velocityTracker.getYVelocity());
            loggerUtil.debug("velocityTrackerX="+velocityTracker.getXVelocity());*/

            if(Math.abs((int)velocityTracker.getYVelocity()) < 2500){
                if(Math.abs((int)velocityTracker.getXVelocity()) > 100){
                    getParent().requestDisallowInterceptTouchEvent(false);
                }else {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            }else {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.dispatchTouchEvent(ev);
    }
}

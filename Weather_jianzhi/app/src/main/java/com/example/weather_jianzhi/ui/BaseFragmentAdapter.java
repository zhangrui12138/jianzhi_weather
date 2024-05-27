package com.example.weather_jianzhi.ui;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

public class BaseFragmentAdapter extends FragmentPagerAdapter {
    private List<Fragment> mFragments;
    public BaseFragmentAdapter(FragmentManager fm, List<Fragment> fragments){
        super(fm);
        mFragments = fragments;
    }
    @Override
    public Fragment getItem(int i) {
        return mFragments.get(i);
    }
    @Override
    public int getCount() {
        return mFragments.size();
    }
}

package com.task1.optisol;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class HomeActivity extends FragmentActivity {
    ViewPager mViewPager;
    HomeViewPagerAdapter homeViewPagerAdapter;
    TabLayout mTabLayout;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidget();

    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void initWidget() {
        mViewPager = findViewById(R.id.home_viewpager);
        homeViewPagerAdapter = new HomeViewPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(homeViewPagerAdapter);
        mTabLayout = findViewById(R.id.home_tab_layout);
        mTabLayout.setupWithViewPager(mViewPager);
    }


}

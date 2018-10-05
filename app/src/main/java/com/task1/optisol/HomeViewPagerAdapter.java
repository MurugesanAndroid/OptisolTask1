package com.task1.optisol;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.task1.optisol.HeaderFragment.AlertFragment;
import com.task1.optisol.HeaderFragment.MyalertFragment;
import com.task1.optisol.HeaderFragment.VectoryFragment;


public class HomeViewPagerAdapter extends FragmentPagerAdapter {

    public HomeViewPagerAdapter(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0) {
            fragment = new VectoryFragment();
        } else if (position == 1) {
            fragment = new AlertFragment();
        } else if (position == 2) {
            fragment = new MyalertFragment();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0) {
            title = "Vectory";
        } else if (position == 1) {
            title = "Alert";
        } else if (position == 2) {
            title = "My alert";
        }
        return title;
    }
}

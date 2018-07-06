package com.example.android.wildutah;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryPagerAdapter extends FragmentPagerAdapter {

    // create array to hold tab titles as a set of strings
    private String tabTitles[] = {"Hiking", "Paddle Sports", "Backpacking", "Camping", "Leisure Drives", "National Parks"};

    public CategoryPagerAdapter(FragmentManager fm){
        super(fm);

    }
// get page title for each tab
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

// switch statement to figure out which fragment to load
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HikingFragment();
            case 1:
                return new PaddleSportsFragment();
            case 2:
                return new BackPackingFragment();
            case 3:
                return new CampingFragment();
            case 4:
                return new DrivesFragment();
            case 5:
                return new NationalParksFragment();
            default:
                return null;
        }


    }
// return the count of the number of fragments
    @Override
    public int getCount() {
        return 6 ;
    }
}

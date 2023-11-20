package com.abyantra.product.trip_2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PatrollingTabAdapter extends FragmentPagerAdapter {


    public PatrollingTabAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new TaskFragment();
        } else if(position == 1){
            return new ParticularsFragment();
        } else {
            return new ChatFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return "      TASK      ";
        } else if (position == 1){
            return "       PARTICULARS      ";
        } else {
            return "      CHAT      ";
        }
    }

}

package com.abyantra.product.trip_2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerMessengerAdapter extends FragmentPagerAdapter {


    public ViewPagerMessengerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0) {
            return new NewFragment();
        } else if (position == 1){
            return new AcceptedFragment();
        } else if (position == 2){
            return new InProgessFragment();
        } else {
            return new CompletedFragment();
        }
    }

    @Override
    public int getCount() {
        return 4; // type the number of tabs
    }


    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return "NEW";
        } else if (position == 1){
            return "ACCEPTED";
        } else if (position == 2){
            return "IN PROGRESS";
        } else {
            return "COMPLETED";
        }
    }
}

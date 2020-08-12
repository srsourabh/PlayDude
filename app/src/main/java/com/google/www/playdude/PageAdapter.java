package com.google.www.playdude;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter  {

    private  int numoftabs;

    public PageAdapter(FragmentManager fm ,int numOfTabs) {
        super(fm);
        this.numoftabs=numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch(position){
            case 0:
                return new MessageFragment() ;

            case 1:
                return new ChatFragment();

            case 2:
                return new ProfileFragment();
                default:
                    return null;
        }

    }

    @Override
    public int getCount() {
        return numoftabs;
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }
}

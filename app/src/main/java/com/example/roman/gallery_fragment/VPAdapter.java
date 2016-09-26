package com.example.roman.gallery_fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class VPAdapter extends FragmentPagerAdapter {
    public VPAdapter(FragmentManager mgr) {
        super(mgr);
    }

    @Override
    public int getCount() {
        return (new Config().getPictures().size());
    }

    @Override
    public Fragment getItem(int position) {
        return (InVPFragment.newInstance(position));
    }
}

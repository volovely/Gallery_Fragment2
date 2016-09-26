package com.example.roman.gallery_fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.viewpagerindicator.CirclePageIndicator;


public class VPFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.gallery_fragment, null);
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        viewPager.setAdapter(new VPAdapter(getFragmentManager()));

        CirclePageIndicator circleIndicator = (CirclePageIndicator)view.findViewById(R.id.indicator);
        circleIndicator.setSnap(true);
        circleIndicator.setViewPager(viewPager);
        return view;
    }
}

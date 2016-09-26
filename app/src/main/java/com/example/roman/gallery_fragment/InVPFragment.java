package com.example.roman.gallery_fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;


public class InVPFragment extends Fragment {

    int picNumber;
    ArrayList<Integer> pics;

    public InVPFragment(){
        pics = new Config().getPictures();
    }

    public static InVPFragment newInstance(int num){
        InVPFragment fragment = new InVPFragment();
        Bundle args = new Bundle();
        args.putInt("frag", num);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        picNumber = getArguments() != null ? getArguments().getInt("frag") : 0;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.invp_fragment, container, false);
        ImageView imageView = (ImageView)view.findViewById(R.id.imageView);
        imageView.setImageResource(pics.get(picNumber));
        return view;
    }
}

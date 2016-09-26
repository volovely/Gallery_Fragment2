package com.example.roman.gallery_fragment;

import java.util.ArrayList;

/**
 * Created by Roman on 20.09.2016.
 */ class Config {
    ArrayList<Integer> pictures = new ArrayList<>();

    Config(){
        pictures.add(R.drawable.one);
        pictures.add(R.drawable.two);
        pictures.add(R.drawable.three);
        //pictures.add(R.drawable.four);
    }

    ArrayList<Integer> getPictures (){
        return pictures;
    }
}

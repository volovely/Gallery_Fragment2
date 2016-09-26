package com.example.roman.gallery_fragment;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment fr = new VPFragment();

        getSupportFragmentManager().beginTransaction()
                .add(R.id.main, fr)
                .commit();
    }
}

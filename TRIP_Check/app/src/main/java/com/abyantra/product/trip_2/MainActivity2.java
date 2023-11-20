package com.abyantra.product.trip_2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.abyantra.product.trip_check.R;
import com.google.android.material.tabs.TabLayout;

public class MainActivity2 extends AppCompatActivity {

    TabLayout tab2;
    ViewPager viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);

        tab2 = findViewById(R.id.tab2);
        viewPager2 = findViewById(R.id.viewPager2);

        PatrollingTabAdapter adapter = new PatrollingTabAdapter(getSupportFragmentManager());
        viewPager2.setAdapter(adapter);

        tab2.setupWithViewPager(viewPager2);
    }
}
package com.seghir.hamza.mistermoodfinal.Controller;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import com.seghir.hamza.mistermoodfinal.R;
import com.seghir.hamza.mistermoodfinal.View.PageAdapter;


public class MainActivity extends AppCompatActivity{

    private String[] data;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.vertical_viewPager);
        initData();
        initView();
    }

    private void initData() {
        this.data = new String[]{
                "Page 1",
                "Page 2",
                "Page 3",
                "Page 4",
                "Page 5",
        };
    }


    private void initView() {
        PageAdapter viewPageAdapter = new PageAdapter(getSupportFragmentManager(), data);
        viewPager.setAdapter(viewPageAdapter);
    }

}
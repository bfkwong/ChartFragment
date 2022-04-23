package com.bkwongsjsu.chartfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Float> inner = new ArrayList<>();
        inner.add(1f);
        inner.add(2f);
        List<Float> inneralt = new ArrayList<>();
        inneralt.add(1f);
        inneralt.add(20f);
        List<List<Float>> inner2 = new ArrayList<>();
        inner2.add(inner);
        inner2.add(inneralt);
        List<List<List<Float>>> data = new ArrayList<>();
        data.add(inner2);

        ChartFragment fragment = new ChartFragment(data);
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.chart_fragment_container, fragment)
                .commit();
    }
}
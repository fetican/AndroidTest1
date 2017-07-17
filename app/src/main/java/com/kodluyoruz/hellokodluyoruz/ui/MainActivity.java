package com.kodluyoruz.hellokodluyoruz.ui;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.kodluyoruz.hellokodluyoruz.R;

public class MainActivity extends AppCompatActivity {

    TextView curryText;
    private FragmentManager fm;
    private FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        fm = getSupportFragmentManager();
        ft.add(R.id.container,new ExampleFragment(),null);
        ft.commit();

    }

    public void init(){

    }

    @Override
    protected void onStart() {
        super.onStart();
    }
    }


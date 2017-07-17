package com.kodluyoruz.hellokodluyoruz.ui;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.kodluyoruz.hellokodluyoruz.R;

/**
 * Created by Feti on 17.07.2017.
 */

public class ExampleActivity extends AppCompatActivity implements View.OnClickListener {
    private FragmentManager fm;
    private FragmentTransaction ft;
    private Button mButton;
    private EditText mEditText;
    private String data;
    private Bundle bundle = new Bundle();
    private Toast toast;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);
        mButton = (Button) findViewById(R.id.button_example);
        mButton.setOnClickListener(this);
        mEditText = (EditText) findViewById(R.id.edit_text_example);

        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        ft.add(R.id.container_example,new ExampleFragment(),null);
        ft.commit();
    }

    @Override
    public void onClick(View v) {
        toast = Toast.makeText(this,"Clicked",Toast.LENGTH_LONG);
        toast.show();
        data = mEditText.getText().toString();

    }
}

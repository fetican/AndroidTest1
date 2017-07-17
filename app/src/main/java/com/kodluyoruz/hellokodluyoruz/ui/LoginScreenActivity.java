package com.kodluyoruz.hellokodluyoruz.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.kodluyoruz.hellokodluyoruz.R;

public class LoginScreenActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText mUserName, mUserLastName, mUserPassword, mUserPasswordConfirm;
    private Button mSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginscreen);
        init();
    }

    private void init() {
        mUserName = (EditText) findViewById(R.id.user_name);
        mUserLastName = (EditText) findViewById(R.id.user_last_name);
        mUserPassword = (EditText) findViewById(R.id.user_password);
        mUserPasswordConfirm = (EditText) findViewById(R.id.user_password_confirm);
        mSubmit = (Button) findViewById(R.id.submit);
        mSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (mUserPassword.getText().toString().equalsIgnoreCase(mUserPasswordConfirm.getText().toString())) {

        } else {
            Toast toast = Toast.makeText(getApplicationContext(),"Parolalar uyumsuz.", Toast.LENGTH_LONG);
            toast.show();
        }
    }


}

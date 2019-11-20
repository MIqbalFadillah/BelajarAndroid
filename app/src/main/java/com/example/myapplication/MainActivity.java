package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLinear = findViewById(R.id.btLinear);
        btnLinear.setOnClickListener(this);

        Button btnRelative = findViewById(R.id.btRelative);
        btnRelative.setOnClickListener(this);

        Button btnLogin = findViewById(R.id.btLogin);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btLinear:
                Intent moveLinear = new Intent(MainActivity.this, LinearLayout.class);
                startActivity(moveLinear);
                break;
            case R.id.btRelative:
                Intent moveRelative = new Intent(MainActivity.this, RelativeLayout.class);
                startActivity(moveRelative);
                break;
            case R.id.btLogin:
                Intent moveLogin = new Intent(MainActivity.this, LoginForm.class);
                startActivity(moveLogin);
                break;
        }
    }
}

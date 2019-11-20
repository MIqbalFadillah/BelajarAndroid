package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class LoginForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);

        ImageView imgLogo = (ImageView) findViewById(R.id.imgLogo);

        final EditText txtUsername = (EditText) findViewById(R.id.txtUsername);

        final EditText txtPassword = (EditText) findViewById(R.id.txtPassword);

        Button btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (txtUsername.getText().toString().isEmpty() || txtPassword.getText().toString().isEmpty()) {
                    // COMPLETED: (9) Jika username dan password belum lengkap, tampilkan pesan error dengan Toast
                    Toast.makeText(LoginForm.this, "Mohon melengkapi data username dan password pada form ini", Toast.LENGTH_SHORT).show();
                } else {
                    // COMPLETED: (10) Jika sudah lengkap, tampilkan activity yang baru
                    Intent intent = new Intent(LoginForm.this, GetInten.class);
                    startActivity(intent);
                }
            }
        });

        // COMPLETED: (6) Buatlah Empty Activity baru dari template
        // COMPLETED: (7) Didalam Empty Activity, tambahkan komponen TextView di tengah layar dengan tulisan "Selamat Datang"
    }
}

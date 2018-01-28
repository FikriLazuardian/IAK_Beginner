package com.example.lazuardian.iakbeginner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.security.PrivateKey;

public class Activity_Login extends AppCompatActivity {
    private EditText et_username;
    private EditText et_password;
    private Button btn_cancel;
    private Button btn_login;
    private final String USERNAME="admin";
    private final String PASSWORD="admin";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__login);
        et_username=findViewById(R.id.et_username);
        et_password=findViewById(R.id.et_password);
        btn_cancel=findViewById(R.id.btn_cancel);
        btn_login=findViewById(R.id.btn_login);

        btn_cancel.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(Activity_Login.this, "btn_cancel", Toast.LENGTH_SHORT).show();
            }
        });
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = et_username.getText().toString();
                String password = et_password.getText().toString();
                if (TextUtils.isEmpty(username)){
                    et_username.setError("Jangan Kosong Ganz!!!");
                }
                if (TextUtils.isEmpty(password)){
                    et_password.setError("Jangan Kosong Ganz!!!");
                }
                Toast.makeText(Activity_Login.this, "btn_password", Toast.LENGTH_SHORT).show();
            }

        });
    }
}

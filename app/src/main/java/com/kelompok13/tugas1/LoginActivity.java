package com.kelompok13.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Resources res = getResources();
        String[] users = res.getStringArray(user);
        setContentView(R.layout.activity_login);
        EditText usernameET = findViewById(R.id.username_ET);
        EditText passwordET = findViewById(R.id.password_ET);
        Button loginBtn = findViewById(R.id.login_button);
        String username = usernameET.toString();
        String password = passwordET.toString();


    }
}
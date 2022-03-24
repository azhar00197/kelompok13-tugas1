package com.kelompok13.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Resources res = getResources();
        String[] users = res.getStringArray(R.array.user);
        setContentView(R.layout.activity_login);
        EditText usernameET = findViewById(R.id.username_ET);
        EditText passwordET = findViewById(R.id.password_ET);
        Button loginBtn = findViewById(R.id.login_button);
        Intent intent = new Intent (this, MainActivity.class);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View loginBtn) {
                String username = usernameET.toString();
                String password = passwordET.toString();
                for(int i=0; i<users.length; i=i+2) {
                    if(users[i].equals(username)) {
                        if (users[++i].equals(password)) {
                            startActivity(intent);
                        }
                    }
                }
            }
        });
    }
}
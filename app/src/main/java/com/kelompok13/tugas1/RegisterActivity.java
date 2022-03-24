package com.kelompok13.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button reg_Btn = findViewById(R.id.register_button);
        TextView log_Btn = findViewById(R.id.login_button);
        TextView usernameET = findViewById(R.id.username_ET);

        reg_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View reg_Btn) {
                String username = usernameET.getText().toString();
                if(!username.isEmpty()) {
                    Intent home = new Intent(RegisterActivity.this, MainActivity.class);
                    home.putExtra(MainActivity.USER_EXTRA, username);
                    startActivity(home);
                    finish();
                }
            }
        });

        log_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View log_Btn) {
                finish();
            }
        });
    }
}
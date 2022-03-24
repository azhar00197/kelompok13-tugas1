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

        Intent home = new Intent(this, MainActivity.class);
        Intent login = new Intent(this, LoginActivity.class);

        reg_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View reg_Btn) {
                startActivity(home);
            }
        });

        log_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View log_Btn) {
                startActivity(login);
            }
        });
    }
}
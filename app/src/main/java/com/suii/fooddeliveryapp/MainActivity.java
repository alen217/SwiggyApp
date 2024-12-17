package com.suii.fooddeliveryapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button b1, b2;
    String s1, s2;
    String s3 = "Wrong password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.login);
        b2 = findViewById(R.id.forpass);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = et1.getText().toString().trim();
                s2 = et2.getText().toString().trim();

                if (s1.isEmpty() || s2.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Fields cannot be empty", Toast.LENGTH_SHORT).show();
                } else if (s1.equals("admin") && s2.equals("12345")) {
                    Intent in = new Intent(MainActivity.this, store.class);
                    startActivity(in);
                } else {
                    Toast.makeText(getApplicationContext(), s3, Toast.LENGTH_LONG).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ip = new Intent(getApplicationContext(), forgot.class);
                startActivity(ip);
            }
        });
    }
}

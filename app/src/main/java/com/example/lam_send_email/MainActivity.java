package com.example.lam_send_email;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    public static String MESSAGE = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        Intent intent = new Intent(this, MainActivity2.class);
        TextInputEditText fromInput = findViewById(R.id.fromInput);
        TextInputEditText toInput = findViewById(R.id.toInput);
        TextInputEditText messageInput = findViewById(R.id.messageInput);

        MESSAGE = getString(R.string.from) + " " + fromInput.getText().toString() + "\n"
                + getString(R.string.to) + " " + toInput.getText().toString() + "\n" +
                getString(R.string.message) + " " + messageInput.getText().toString();

        startActivity(intent);
    }
}
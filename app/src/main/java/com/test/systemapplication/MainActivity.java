package com.test.systemapplication;

import android.content.Context;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private String TAG = "MainActivity";

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.confirm) {

            Toast.makeText(this, "confirm onClick", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnConfirm = (Button) findViewById(R.id.confirm);
        btnConfirm.setOnClickListener(this);
    }
}

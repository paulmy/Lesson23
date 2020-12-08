package com.example.lesson23;


import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class About extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void AboutFinish(View view) {
        finish();
    }
}

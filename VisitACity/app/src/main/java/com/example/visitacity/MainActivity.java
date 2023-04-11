package com.example.visitacity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.visitacity.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());
        lonodon();
    }

    public void lonodon() {
        mainBinding.btnLondon.setOnClickListener( b1 -> {

            Intent i=new Intent(MainActivity.this,LondonActivity.class);
            startActivity(i);

        });
    }
}
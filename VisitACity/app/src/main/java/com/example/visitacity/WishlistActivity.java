package com.example.visitacity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;

import com.example.visitacity.databinding.ActivityWishlistBinding;

public class WishlistActivity extends AppCompatActivity {

    Toolbar toolbar;
    ActivityWishlistBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityWishlistBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        toolbar();
        explore();
    }

    private void toolbar() {

//        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(binding.toolbar);
    }


    private void explore() {
        binding.btnexplore.setOnClickListener(ex ->{
            Intent explore=new Intent(WishlistActivity.this,LondonActivity.class);
            startActivity(explore);
        });
    }
}
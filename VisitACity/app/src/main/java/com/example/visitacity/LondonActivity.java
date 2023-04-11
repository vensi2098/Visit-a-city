package com.example.visitacity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.visitacity.databinding.ActivityLondonBinding;
import com.example.visitacity.databinding.ActivityMainBinding;

public class LondonActivity extends AppCompatActivity {
    ActivityLondonBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityLondonBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        clickl1();
        clickl2();
        clickl3();
        explore();
        wishlist();
    }



    private void clickl1() {
        binding.btnl1.setOnClickListener(l1 ->{
            Intent londonPlans=new Intent(LondonActivity.this,VedioPlayActivity.class);
            londonPlans.putExtra("url","https://www.google.com/search?rlz=1C1CHBD_enIN1002IN1002&sxsrf=AJOqlzWZ0TyBAnGdHh7J9alj4fXyZBDllw:1675156880933&q=london&tbm=vid&sa=X&ved=2ahUKEwiV1dLWvfH8AhW1RXwKHU18AJkQ0pQJegQICBAB&biw=1536&bih=722&dpr=1.25#fpstate=ive&vld=cid:311ce872,vid:X8zLJlU_-60");
            startActivity(londonPlans);

        });

    }
    private void clickl2() {
        binding.btnl2.setOnClickListener(l2 ->{
            Intent londonPlans=new Intent(LondonActivity.this,VedioPlayActivity.class);
            londonPlans.putExtra("url","https://www.google.com/search?q=london+landmarks+video&rlz=1C1CHBD_enIN1002IN1002&biw=1536&bih=722&tbm=vid&sxsrf=AJOqlzV9X33ruxmRofuwcaWKI_tgorF_Qw%3A1675225643768&ei=K-rZY57ILvOTseMPn9WYgAg&oq=london+landmarks+video%5C&gs_lcp=Cg1nd3Mtd2l6LXZpZGVvEAMYADIGCAAQBxAeMgYIABAHEB4yBggAEAcQHjIICAAQCBAHEB4yCAgAEAgQBxAeMggIABAIEAcQHjIICAAQCBAHEB4yCAgAEAgQBxAeMggIABAIEAcQHjINCAAQCBAHEB4Q8QQQCjoECCMQJzoFCAAQgAQ6CggAEIAEEBQQhwI6BggAEBYQHjoHCCMQsAIQJzoHCAAQgAQQDToICAAQBxAeEA9QmQdY5KICYO2iAmgBcAB4AIABowGIAfAHkgEDMC43mAEAoAEBwAEB&sclient=gws-wiz-video#fpstate=ive&vld=cid:c9a11996,vid:-XhYdiApQJ4");
            startActivity(londonPlans);

        });
    }
    private void clickl3() {
        binding.btnl3.setOnClickListener(l3 ->{
            Intent londonPlans=new Intent(LondonActivity.this,VedioPlayActivity.class);
            londonPlans.putExtra("url","https://www.google.com/search?q=london+video&rlz=1C1CHBD_enIN1002IN1002&oq=&aqs=chrome.1.35i39i362l8.144411859j0j15&sourceid=chrome&ie=UTF-8#fpstate=ive&vld=cid:60609b48,vid:usGgZwPGs8Y");
            startActivity(londonPlans);

        });

    }
    private void explore() {
        binding.btnexplore.setOnClickListener(ex1 ->{
            Intent explore=new Intent(LondonActivity.this,LondonActivity.class);
            startActivity(explore);
        });
    }
    private void wishlist() {
        binding.imgClickWishlist.setOnClickListener(wish ->{
            Intent wishlist=new Intent(LondonActivity.this,WishlistActivity.class);
            startActivity(wishlist);
        });
    }

}
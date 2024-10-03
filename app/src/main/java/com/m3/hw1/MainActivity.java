package com.m3.hw1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.m3.hw1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.sendBtn.setOnClickListener(view -> {
            String emailsend = binding.emailEditText.getText().toString();
            String emailsubject = binding.subjectEditText.getText().toString();
            String emailbody = binding.messageEditText.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);

            intent.putExtra(Intent.EXTRA_EMAIL, new String[]{emailsend});
            intent.putExtra(Intent.EXTRA_SUBJECT, emailsubject);
            intent.putExtra(Intent.EXTRA_TEXT, emailbody);

            intent.setType("message/rfc822");

            startActivity(Intent.createChooser(intent, "Choose an Email client :"));
        });

        binding.activity2Btn.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ImageActiviity.class);
            intent.putExtra("image", R.drawable.pudge_image);
            MainActivity.this.startActivity(intent);
        });
    }
}
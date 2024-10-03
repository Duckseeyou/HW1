package com.m3.hw1;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ImageActiviity extends AppCompatActivity {
    int imagevalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_image);

        ImageView pudge = findViewById(R.id.pudge_image);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            imagevalue = bundle.getInt("image");
        }
        pudge.setImageResource(imagevalue);
    }
}
package com.example.projecttt;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final int SPLASH_DELAY = 3000; // 3 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView logoImageView = findViewById(R.id.logoImageView);
        ProgressBar loaderProgressBar = findViewById(R.id.loaderProgressBar);
        ImageView pictureImageView = findViewById(R.id.pictureImageView);

        // Simulate loading process with a delay
        loaderProgressBar.setVisibility(View.VISIBLE);

        // Introduce a delay using Handler
        new Handler().postDelayed(() -> {
            loaderProgressBar.setVisibility(View.GONE);

            // Start the SignInActivity after the loading is complete
            Intent intent = new Intent(MainActivity.this, SignInActivity.class);
            startActivity(intent);

            // Close the MainActivity to prevent going back to it
            finish();
        }, SPLASH_DELAY);
    }
}

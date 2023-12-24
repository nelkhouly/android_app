package com.example.projecttt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Course3DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course3_detail);
        Button backButton = findViewById(R.id.back);
        backButton.setOnClickListener(view -> onBackPressed());
    }

    public void onBackPressed() {
        // Create an Intent to navigate back to the main activity (home page)
        Intent intent = new Intent(this, HomeActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();

        super.onBackPressed();  // Move this line to the end
    }
}
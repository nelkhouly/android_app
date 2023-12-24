package com.example.projecttt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MyAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_account);

        Button backButton = findViewById(R.id.back);
        backButton.setOnClickListener(view -> onBackPressed());

        Button logoutButton = findViewById(R.id.logoutButton);
        logoutButton.setOnClickListener(view -> logout()); // Set the click listener for logoutButton
    }

    public void nav() {
        // Create an Intent to navigate back to the main activity (home page)
        Intent intent = new Intent(this, HomeActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }

    public void logout() {
        // Create an Intent to navigate back to the starting of the app (probably MainActivity)
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }
}

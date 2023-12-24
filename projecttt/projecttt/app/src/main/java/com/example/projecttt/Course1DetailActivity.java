package com.example.projecttt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.net.Uri;


public class Course1DetailActivity extends AppCompatActivity {
    private Button start, stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course1_detail);

        Button details = findViewById(R.id.details);
        Button backButton = findViewById(R.id.back);
        backButton.setOnClickListener(view -> onBackPressed());

        start = findViewById(R.id.start);
        stop = findViewById(R.id.stop);

        // Set click listeners using lambda expressions
        start.setOnClickListener(v -> startService(new Intent(this, MyMediaPlayer.class)));
        stop.setOnClickListener(v -> stopService(new Intent(this, MyMediaPlayer.class)));
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.investopedia.com/terms/f/financial_plan.asp#:~:text=A%20financial%20plan%20documents%20an,plan%20for%20saving%20and%20investing.";

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        // Create an Intent to navigate back to the main activity (home page)
        Intent intent = new Intent(this, HomeActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();

        super.onBackPressed();  // Move this line to the end
    }
}

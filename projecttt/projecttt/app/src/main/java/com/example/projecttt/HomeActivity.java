package com.example.projecttt;
// Import necessary packages
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

// Declare the HomeActivity class, extending AppCompatActivity
public class HomeActivity extends AppCompatActivity {

    TextView v1;
    Button b1;
    // Override the onCreate method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content view to the activity_home.xml layout
        setContentView(R.layout.activity_home);

        // Find views for each course item using their IDs
        v1=findViewById(R.id.emailTextView);
        b1=findViewById(R.id.myacc);
        LinearLayout course1Layout = findViewById(R.id.course1Layout);
        LinearLayout course2Layout = findViewById(R.id.course2Layout);
        LinearLayout course3Layout = findViewById(R.id.course3Layout);
        LinearLayout course4Layout = findViewById(R.id.course4Layout);
        LinearLayout course5Layout = findViewById(R.id.course5Layout);
        LinearLayout course6Layout = findViewById(R.id.course6Layout);
        LinearLayout course7Layout = findViewById(R.id.course7Layout);
        LinearLayout course8Layout = findViewById(R.id.course8Layout);


        SharedPreferences sp= getApplicationContext().getSharedPreferences("MyUserPrefs", Context.MODE_PRIVATE);
        String email=sp.getString("email","");
        v1.setText(email);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // When Course 1 is clicked, start Course1DetailActivity
                startActivity(new Intent(HomeActivity.this, MyAccount.class));
            }
        });
        // Set click listeners for each course item
        course1Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // When Course 1 is clicked, start Course1DetailActivity
                startActivity(new Intent(HomeActivity.this, Course1DetailActivity.class));
            }
        });

        course2Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // When Course 2 is clicked, start Course2DetailActivity
                startActivity(new Intent(HomeActivity.this, Course2DetailActivity.class));
            }
        });

        course3Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // When Course 1 is clicked, start Course1DetailActivity
                startActivity(new Intent(HomeActivity.this, Course3DetailActivity.class));
            }
        });

        course4Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // When Course 1 is clicked, start Course1DetailActivity
                startActivity(new Intent(HomeActivity.this, Course4DetailActivity.class));
            }
        });


        course5Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // When Course 1 is clicked, start Course1DetailActivity
                startActivity(new Intent(HomeActivity.this, Course5DetailActivity.class));
            }
        });

        course6Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // When Course 1 is clicked, start Course1DetailActivity
                startActivity(new Intent(HomeActivity.this, Course6DetailActivity.class));
            }
        });

        course7Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // When Course 1 is clicked, start Course1DetailActivity
                startActivity(new Intent(HomeActivity.this, Course7DetailActivity.class));
            }
        });

        course8Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // When Course 1 is clicked, start Course1DetailActivity
                startActivity(new Intent(HomeActivity.this, Course8DetailActivity.class));
            }
        });
        
    }
}

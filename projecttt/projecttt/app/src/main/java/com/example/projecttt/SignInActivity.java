package com.example.projecttt;
import androidx.core.app.ActivityCompat;
import android.content.pm.PackageManager;
import androidx.core.content.ContextCompat;



import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignInActivity extends AppCompatActivity {
    SharedPreferences sp;
    String emailstr;

    // Predefined email and password for demonstration purposes
    private static final String DEMO_EMAIL = "farah";
    private static final String DEMO_PASSWORD = "farah123";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        sp= getSharedPreferences("MyUserPrefs", Context.MODE_PRIVATE);

        ImageView logoImageView = findViewById(R.id.logoImageView);
        TextView signInTextView = findViewById(R.id.signInTextView);
        EditText emailEditText = findViewById(R.id.emailEditText);
        EditText passwordEditText = findViewById(R.id.passwordEditText);
        CheckBox rememberMeCheckBox = findViewById(R.id.rememberMeCheckBox);
        Button signInButton = findViewById(R.id.signInButton);
        TextView createAccountTextView = findViewById(R.id.createAccountTextView);
        Button createAccountButton = findViewById(R.id.createAccountButton);

        if (ContextCompat.checkSelfPermission(this, "android.permission.POST_NOTIFICATIONS")
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
        }




        // Sign In Button Click Listener
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                emailstr=emailEditText.getText().toString();
                SharedPreferences.Editor editor=sp.edit();

                editor.putString("email",emailstr);
                editor.commit();
                Toast.makeText(SignInActivity.this,"Information Saved",Toast.LENGTH_SHORT);
                // Retrieve user input
                String enteredEmail = emailEditText.getText().toString().trim();
                String enteredPassword = passwordEditText.getText().toString().trim();

                // Check against predefined credentials for demonstration
                if (enteredEmail.equals(DEMO_EMAIL) && enteredPassword.equals(DEMO_PASSWORD)) {
                    // Authentication successful, navigate to the HomeActivity
                    Intent intent = new Intent(SignInActivity.this, HomeActivity.class);
                    startActivity(intent);
                    finish(); // Close the SignInActivity to prevent going back to it
                } else {
                    // Authentication failed, show an error message
                    Toast.makeText(SignInActivity.this, "Invalid email or password", Toast.LENGTH_SHORT).show();


                }

            }
        });

        // Create Account Button Click Listener
        createAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the SignUpActivity
                Intent intent = new Intent(SignInActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });
    }
}


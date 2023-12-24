package com.example.projecttt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        ImageView logoImageView = findViewById(R.id.logoImageView);
        TextView signUpTextView = findViewById(R.id.signUpTextView);
        EditText usernameEditText = findViewById(R.id.usernameEditText);
        EditText emailEditText = findViewById(R.id.emailEditText);
        EditText passwordEditText = findViewById(R.id.passwordEditText);
        EditText confirmPasswordEditText = findViewById(R.id.confirmPasswordEditText);
        CheckBox rememberMeCheckBox = findViewById(R.id.rememberMeCheckBox);
        Button signUpButton = findViewById(R.id.signUpButton);

        // Sign Up Button Click Listener
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieve user input
                String enteredUsername = usernameEditText.getText().toString().trim();
                String enteredEmail = emailEditText.getText().toString().trim();
                String enteredPassword = passwordEditText.getText().toString().trim();
                String enteredConfirmPassword = confirmPasswordEditText.getText().toString().trim();

                // Perform input validation (for simplicity in this example)
                if (enteredUsername.isEmpty() || enteredEmail.isEmpty() || enteredPassword.isEmpty() || enteredConfirmPassword.isEmpty()) {
                    // Show an error message for incomplete fields
                    // In a real application, you would handle this differently (e.g., display Toast)
                    showToast("Please fill in all fields");
                    return;
                }

                // Check if passwords match
                if (!enteredPassword.equals(enteredConfirmPassword)) {
                    // Show an error message for password mismatch
                    // In a real application, you would handle this differently (e.g., display Toast)
                    showToast("Passwords do not match");
                    return;
                }

                // If input is valid, you can proceed with further registration logic
                // For simplicity in this example, let's assume the registration is successful

                // Show a success message
                showToast("Account created successfully");

                // After successful registration, navigate to the HomeActivity
                Intent intent = new Intent(SignUpActivity.this, HomeActivity.class);
                startActivity(intent);
                finish(); // Close the SignUpActivity to prevent going back to it
            }
        });
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}

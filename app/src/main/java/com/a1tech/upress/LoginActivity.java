package com.a1tech.upress;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private EditText edMail, edPassword;
    private Button signInButton;
    private CheckBox rememberMe;
    private TextView tvSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        initViews();
        buttons();
        transparentStatusBar();
    }

    private void transparentStatusBar() {
        // In Activity's onCreate() for instance
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
    }

    private void initViews() {
        edMail = findViewById(R.id.edEmail);
        edPassword = findViewById(R.id.edPassword);
        signInButton = findViewById(R.id.signUpButton);
        rememberMe = findViewById(R.id.checkBox);
        tvSignUp = findViewById(R.id.tvSignUpBtn);
    }

    private void buttons() {
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!edMail.getText().toString().trim().isEmpty() && !edPassword.getText().toString().trim().isEmpty()) {
                    // if edMail == regMail && edPassword == regPass -> Login Succesfull
                    // if checkbox == true save to sharedPrefs
                }
            }
        });
        tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
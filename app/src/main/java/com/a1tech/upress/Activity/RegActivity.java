package com.a1tech.upress.Activity;

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
import android.widget.Toast;

import com.a1tech.upress.R;

public class RegActivity extends AppCompatActivity {

    private EditText edName, edMail, edPassword, edConfirmPass;
    private Button signUpBtn;
    private CheckBox checkBoxTerms;
    private TextView tvLogInBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

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
        edName = findViewById(R.id.edName);
        edMail = findViewById(R.id.edEmail);
        edPassword = findViewById(R.id.edPassword);
        edConfirmPass = findViewById(R.id.edConfirmPass);
        signUpBtn = findViewById(R.id.signUpButton);
        checkBoxTerms = findViewById(R.id.checkBox);
        tvLogInBtn = findViewById(R.id.signInBtn);
    }

    private void buttons() {
        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!edName.getText().toString().trim().isEmpty() && !edMail.getText().toString().trim().isEmpty() && !edPassword.getText().toString().trim().isEmpty()) {
                    if (edPassword.getText().toString().trim().equals(edConfirmPass.getText().toString().trim())) {
                        if (checkBoxTerms.isChecked()) {
                            Intent intent = new Intent(RegActivity.this, MainActivity.class);
                            // need to save data to sharedPrefs!!!
                            startActivity(intent);
                            finish();
                        } else {
                            Toast.makeText(RegActivity.this, "You did not agree to the terms of the user agreement!", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(RegActivity.this, "Passwords do not match!", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(RegActivity.this, "Please fill the form!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tvLogInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
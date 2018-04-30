package com.example.joke.chikinimoni.AccountActivity;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.joke.chikinimoni.Food;
import com.example.joke.chikinimoni.FoodActivity;
import com.example.joke.chikinimoni.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignUpActivity extends AppCompatActivity {
    ProgressBar progressBar;
    TextView inputEmail, inputPassword;
    Button btn_signup;

    //get firebase instance
    FirebaseAuth auth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btn_signup = findViewById(R.id.btn_signup);

        progressBar = findViewById(R.id.progressBar);
        auth = FirebaseAuth.getInstance();

        ImageView signUpIV = findViewById(R.id.closeSignUpIV);
        signUpIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SignUpActivity.super.onBackPressed();
            }
        });
    }


    public void SignUpPressed(View view) {
        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


        String email = inputEmail.getText().toString().trim();
        String password = inputPassword.getText().toString().trim();

        if (TextUtils.isEmpty(email)) {
            Toast.makeText(getApplicationContext(), "Please provide your email", Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(password)) {
            Toast.makeText(getApplicationContext(), "please provide password", Toast.LENGTH_SHORT).show();
            return;
        }

        if (password.length() < 6) {
            Toast.makeText(getApplicationContext(), "Password too weak", Toast.LENGTH_SHORT).show();
           return;
        }

       progressBar.setVisibility(View.VISIBLE);
        setTitle("wait a moment...");
        //create user
        auth.createUserWithEmailAndPassword(email, password)
               .addOnCompleteListener(SignUpActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Intent intent = new Intent(SignUpActivity.this, FoodActivity.class);
                            startActivity(intent);
                            finish();

                           // Sign in success, update UI with the signed-in user's information

                        } else {
                           // If sign in fails, display a message to the user.
                            Toast.makeText(SignUpActivity.this, "createUserWithEmail:onComplete:" + task.isSuccessful(), Toast.LENGTH_SHORT).show();
                            progressBar.setVisibility(View.GONE);
                        }

                       // ...
                    }
               });

        }
    });
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        progressBar.setVisibility(View.GONE);
    }
}


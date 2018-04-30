package com.example.joke.chikinimoni.AccountActivity;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.joke.chikinimoni.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ProceedActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proceed);

    }

    public void LoginPressed(View view) {
        Intent loginIntent = new Intent(ProceedActivity.this, LoginActivity.class);
        startActivity(loginIntent);
    }

    public void SignUpPressed(View view) {
        Intent signupIntent = new Intent(ProceedActivity.this, SignUpActivity.class);
        startActivity(signupIntent);

    }
}

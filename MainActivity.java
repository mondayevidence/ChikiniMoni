package com.example.joke.chikinimoni;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.joke.chikinimoni.AccountActivity.ProceedActivity;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout1, linearLayout2;
    Button btn_dive;
    Animation uptodown, downtoup;
    TextView txtSlogan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_dive = findViewById(R.id.btn_dive);
        linearLayout1 = findViewById(R.id.linear_layout1);
        linearLayout2 = findViewById(R.id.linear_layout2);
        uptodown = AnimationUtils.loadAnimation(this, R.anim.uptodown);
        downtoup = AnimationUtils.loadAnimation(this, R.anim.downtoup);
        linearLayout1.setAnimation(uptodown);
    }

    public void Proceed(View view) {
        Intent proceedIntent = new Intent(MainActivity.this, ProceedActivity.class );
        startActivity(proceedIntent);
    }
}

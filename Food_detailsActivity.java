package com.example.joke.chikinimoni;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Food_detailsActivity extends AppCompatActivity {

    private TextView tvName, tvRecipe, tvCategory;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_details);

        tvName = findViewById(R.id.food_name);
        tvRecipe = findViewById(R.id.recipe);
        tvCategory = findViewById(R.id.category);
        img = findViewById(R.id.img_thumbnail);

        //Receive data

        Intent intent = getIntent();

        String Name = intent.getExtras().getString("Name");
        String Recipe = intent.getExtras().getString("Recipe");
        int image =  intent.getExtras().getInt("Thumnails");


        //setting values

        tvName.setText(Name);
        tvRecipe.setText(Recipe);
        img.setImageResource(image);

    }
}

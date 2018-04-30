package com.example.joke.chikinimoni;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class FoodActivity extends AppCompatActivity {
    List<Food> listFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        listFood = new ArrayList<>();
        listFood.add(new Food("Egusi soup","Igbo", "1hour",R.drawable.egusi ));
        listFood.add(new Food("Edikaikong","Calabar", "2hours",R.drawable.edikaikong ));
        listFood.add(new Food("Fried Rice","Foreign", "1hour",R.drawable.fried ));
        listFood.add(new Food("Yam Porridge","Igbo", "45minutes",R.drawable.porr ));
        listFood.add(new Food("Porridge Beans","Urhobo", "2hours",R.drawable.porridgebeans ));
        listFood.add(new Food("Jollof Rice","Nigeria", "1hour",R.drawable.jollof ));
        listFood.add(new Food("Tomato Stew","Nigeria", "1hour",R.drawable.stew ));
        listFood.add(new Food("Spaghetti","Italy", "30minutes",R.drawable.spag));
        listFood.add(new Food("Efo Riro","Yoruba", "1hour",R.drawable.efo ));
        listFood.add(new Food("Egusi soup","Igbo", "1hour",R.drawable.egusi ));
        listFood.add(new Food("Edikaikong","Calabar", "2hours",R.drawable.edikaikong ));
        listFood.add(new Food("Fried Rice","Foreign", "1hour",R.drawable.fried ));
        listFood.add(new Food("Yam Porridge","Igbo", "45minutes",R.drawable.porr ));
        listFood.add(new Food("Porridge Beans","Urhobo", "2hours",R.drawable.porridgebeans ));
        listFood.add(new Food("Jollof Rice","Nigeria", "1hour",R.drawable.jollof ));
        listFood.add(new Food("Tomato Stew","Nigeria", "1hour",R.drawable.stew ));
        listFood.add(new Food("Spaghetti","Italy", "30minutes",R.drawable.spag));
        listFood.add(new Food("Efo Riro","Yoruba", "1hour",R.drawable.efo ));
        listFood.add(new Food("Egusi soup","Igbo", "1hour",R.drawable.egusi ));
        listFood.add(new Food("Edikaikong","Calabar", "2hours",R.drawable.edikaikong ));
        listFood.add(new Food("Fried Rice","Foreign", "1hour",R.drawable.fried ));
        listFood.add(new Food("Yam Porridge","Igbo", "45minutes",R.drawable.porr ));
        listFood.add(new Food("Porridge Beans","Urhobo", "2hours",R.drawable.porridgebeans ));
        listFood.add(new Food("Jollof Rice","Nigeria", "1hour",R.drawable.jollof ));
        listFood.add(new Food("Tomato Stew","Nigeria", "1hour",R.drawable.stew ));
        listFood.add(new Food("Spaghetti","Italy", "30minutes",R.drawable.spag));
        listFood.add(new Food("Efo Riro","Yoruba", "1hour",R.drawable.efo ));


        RecyclerView myrv = findViewById(R.id.recyclerview);
        RecyclerviewAdapter myAdapter = new RecyclerviewAdapter(this, listFood);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);

    }

    public void UploadPressed(View view) {
        Intent uploadIntent = new Intent(FoodActivity.this, UploadActivity.class);
        startActivity(uploadIntent);
    }
}

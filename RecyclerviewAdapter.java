package com.example.joke.chikinimoni;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Author @Evi
 */

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.MyViewHolder> {

    private Context mContext;
    private List<Food> mData;

    public RecyclerviewAdapter(Context mContext, List<Food> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item_food, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.foodName.setText(mData.get(position).getName());
        holder.img_food.setImageResource(mData.get(position).getThumbnail());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext,Food_detailsActivity.class);


                //passing data to the food activity
                intent.putExtra("Food Name", mData.get(position).getName());
                intent.putExtra("Recipe", mData.get(position).getDescription());
                intent.putExtra("Thumbnail", mData.get(position).getThumbnail());

                //start activity
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView foodName;
        ImageView img_food;
        CardView cardView;

        public MyViewHolder(View itemView) {
            super(itemView);
            foodName = itemView.findViewById(R.id.food_name);
            img_food = itemView.findViewById(R.id.food);
            cardView = itemView.findViewById(R.id.card_view);
        }
    }


}

package com.example.recyclerview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class B_RecyclerViewAdapter extends RecyclerView.Adapter<B_RecyclerViewAdapter.MyViewHolder>{
    Context context;
    ArrayList<BirdModel> birdModels;


    public B_RecyclerViewAdapter(Context context, ArrayList<BirdModel> birdModels) {
        this.context = context;
        this.birdModels = birdModels;
    }

    @NonNull
    @Override
    public B_RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // This is where you inflate the layout (Giving a look to our rows)
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull B_RecyclerViewAdapter.MyViewHolder holder, int position) {
        //assigning values to the views we created in the recycler_view_row layout file
        //Based on the position of the recycler view
        holder.tvName.setText(birdModels.get(position).getBirdName());
    }

    @Override
    public int getItemCount() {
        //The Recycler view just wants to know the number of items you want displayed/ have in total
        return birdModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        //Grabbing the views from our recycler_view_row layout file
        //Kind of like the onCreate method

        ImageView imageView;
        TextView tvName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            tvName = itemView.findViewById(R.id.textView);

        }
    }
}

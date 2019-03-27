package com.example.colliensepodder.retrofit.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.colliensepodder.retrofit.R;

public class RetroRecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView textview_name;
    public TextView textview_hobby;

    public RetroRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);

        itemView.setOnClickListener(this);

        textview_name = itemView.findViewById(R.id.textview_name);
        textview_hobby = itemView.findViewById(R.id.textview_hobby);
    }

    @Override
    public void onClick(View view) {

    }
}

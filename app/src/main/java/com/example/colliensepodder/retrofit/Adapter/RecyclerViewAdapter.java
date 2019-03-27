package com.example.colliensepodder.retrofit.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.colliensepodder.retrofit.Model.User;
import com.example.colliensepodder.retrofit.R;
import com.example.colliensepodder.retrofit.ViewHolder.RetroRecyclerViewHolder;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RetroRecyclerViewHolder> {

    private List<User> itemlist;

    public RecyclerViewAdapter(List<User> instancelist){
        this.itemlist = instancelist;

    }
    @NonNull
    @Override
    public RetroRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_view,null);
        
        return new RetroRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RetroRecyclerViewHolder retroRecyclerViewHolder, int i) {

        retroRecyclerViewHolder.textview_name.setText(itemlist.get(i).getName());
        retroRecyclerViewHolder.textview_hobby.setText(itemlist.get(i).getHobby());

    }

    @Override
    public int getItemCount() {
        return itemlist.size();
    }
}

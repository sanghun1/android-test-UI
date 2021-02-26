package com.cos.testinsta;


import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MyViewHolder> {

    private static final String TAG = "UserAdapter";

    private final List<MainModel> mainModels;

    public MainAdapter(List<MainModel> mainModels) {
        this.mainModels = mainModels;
    }

    public void addItem(MainModel mainModel){
        mainModels.add(mainModel);
        notifyDataSetChanged();
    }

    public void removeItem(int position){
        mainModels.remove(position);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder: ");
        LayoutInflater inflater = (LayoutInflater)parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.post_item,parent,false);

        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: ");
//        holder.setItem(mainModels.get(position));
    }


    @Override
    public int getItemCount() {
        return mainModels.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {


        private TextView tvTitle;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.my_title);

            itemView.setOnClickListener(v -> {
                Log.d(TAG, "클릭됨"+getAdapterPosition());

            });

        }
//
//        public void setItem(MainModel mainModel){
//
//        }
    }

}
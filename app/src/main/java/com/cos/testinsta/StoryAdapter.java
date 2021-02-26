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


public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.MyViewHolder> {

    private static final String TAG = "UserAdapter";


    private final List<StoryModel> storyModels;

    public StoryAdapter(List<StoryModel> storyModels) {
        this.storyModels = storyModels;
    }


    public void addItem(StoryModel storyModel){
        storyModels.add(storyModel);
        notifyDataSetChanged();
    }

    public void removeItem(int position){
        storyModels.remove(position);
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder: ");
        LayoutInflater inflater = (LayoutInflater)parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.circle_story,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: ");
//        holder.setItem(storyModels.get(position));
    }

    @Override
    public int getItemCount() {
        return storyModels.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView tvUsername;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvUsername = itemView.findViewById(R.id.story_username);

            itemView.setOnClickListener(v -> {
                Log.d(TAG, "클릭됨"+getAdapterPosition());
            });

        }

//        public void setItem(StoryModel storyModel){
//
//        }
    }

}
package com.cos.testinsta;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;


import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity2";

    private RecyclerView rvStory, rvMain;

    private StoryAdapter storyAdapter;
    private MainAdapter mainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<StoryModel> storymodels = new ArrayList<>();
        for (int i=1; i<10; i++) {
            storymodels.add(new StoryModel("storymodels"));
        }

        List<MainModel> mainmodels = new ArrayList<>();
        for (int i=1; i<5; i++) {
            mainmodels.add(new MainModel("mainmodels"));
        }

        LinearLayoutManager storyManager = new LinearLayoutManager(this, rvStory.HORIZONTAL, false);
        LinearLayoutManager mainManager = new LinearLayoutManager(this, rvMain.VERTICAL, false);

        rvStory = findViewById(R.id.rv_story);
        rvStory.setLayoutManager(storyManager);

        rvMain = findViewById(R.id.rv_post);
        rvMain.setLayoutManager(mainManager);

        storyAdapter = new StoryAdapter(storymodels);
        rvStory.setAdapter(storyAdapter);

        mainAdapter = new MainAdapter(mainmodels);
        rvMain.setAdapter(mainAdapter);


    }



}
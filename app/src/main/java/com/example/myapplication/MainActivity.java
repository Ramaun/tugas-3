package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvTeam;
    private ArrayList<GameModel> listTeam = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvTeam = findViewById(R.id.list);
        rvTeam.setHasFixedSize(true);
        listTeam.addAll(GameData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvTeam.setLayoutManager(new LinearLayoutManager(this));
        GameAdapter gameAdapter = new GameAdapter(this);
        gameAdapter.setGameModels(listTeam);
        rvTeam.setAdapter(gameAdapter);
    }
}
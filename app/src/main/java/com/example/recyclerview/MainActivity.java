package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rview);

        RocketModel rocketModel = new RocketModel("falcon1", "03/11/2019",true,"satellite");
        RocketModel rocketModel2 = new RocketModel("falcon 9", "11/11/2019",false,"supplies");
        RocketModel rocketModel3 = new RocketModel("dragon", "20/12/2019",true,"satellite");
        RocketModel rocketModel4 = new RocketModel("dragon2", "20/12/2019",true,"supplies");
        ArrayList<RocketModel> rocketModels = new ArrayList<>();
        rocketModels.add(rocketModel);
        rocketModels.add(rocketModel2);
        rocketModels.add(rocketModel3);
        rocketModels.add(rocketModel4);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new RecyclerAdapter(rocketModels);
        recyclerView.setAdapter(mAdapter);
    }
}

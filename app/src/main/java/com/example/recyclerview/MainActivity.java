package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView = findViewById(R.id.recyclerview);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        RocketModel rocketModel = new RocketModel("falcon1", "03/11/2019",true,"satellite");
        RocketModel rocketModel2 = new RocketModel("falcon 9", "11/11/2019",false,"supplies");
        RocketModel rocketModel3 = new RocketModel("dragon", "20/12/2019",true,"satellite");

        ArrayList<RocketModel> rocketModels = new ArrayList<>();
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(rocketModels);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        rocketModels.add(rocketModel);
        rocketModels.add(rocketModel2);
        rocketModels.add(rocketModel3);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(recyclerAdapter);
    }
}

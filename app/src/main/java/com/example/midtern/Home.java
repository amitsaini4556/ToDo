package com.example.midtern;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {
    MyHomeDataAdapter myHomeAdapter;
    private List<MyHomeData> myHomeData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        myHomeData = new ArrayList<MyHomeData>();
        myHomeData.add(new MyHomeData("Ecell"));
        myHomeData.add(new MyHomeData("Online Webinar"));
        myHomeData.add(new MyHomeData("Something About ML"));
        myHomeData.add(new MyHomeData("Programming..."));
        myHomeData.add(new MyHomeData("PrePlacement Talk"));
        myHomeAdapter = new MyHomeDataAdapter(myHomeData,this);
        recyclerView.setAdapter(myHomeAdapter);
    }
}
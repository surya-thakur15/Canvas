package com.example.canvas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {
    private RecyclerView cities;
    private RecyclerView.Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<City> cities = initCities();

        this.cities = (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        this.cities.setLayoutManager(mLayoutManager);

        adapter = new CityAdapter(cities);
        this.cities.setAdapter(adapter);
    }

    private ArrayList<City> initCities() {
        ArrayList<City> list = new ArrayList<>();

        list.add(new City("Tent house", "Zirakpur"));
        list.add(new City("SS Farms", "Chandigarh"));
        list.add(new City("Lalit", "Panchkula"));
        list.add(new City("Utsav Palace", "Mohali"));

        return list;
    }
}

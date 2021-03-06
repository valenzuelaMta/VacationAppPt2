package com.example.vacationapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.vacationapp.adapter.RecentsAdapter;
import com.example.vacationapp.adapter.TopPlacesAdapter;
import com.example.vacationapp.model.RecentsData;
import com.example.vacationapp.model.TopPlacesData;
import com.parse.ParseUser;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveAction;

public class MainActivity extends AppCompatActivity {

    RecyclerView recentRecycler, topPlacesRecycler;
    RecentsAdapter recentsAdapter;
    TopPlacesAdapter topPlacesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        profile();
        favorites();
        search();

        // Now here we will add some dummy data in our model class

        List<RecentsData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentsData("Venice","Italy","$889 3-day trip",R.drawable.venice));
        recentsDataList.add(new RecentsData("Chicago","Illinois","$700 3-day trip",R.drawable.chicago));
        recentsDataList.add(new RecentsData("Sedona","Arizona","$300 3-day trip",R.drawable.sedona));
        recentsDataList.add(new RecentsData("Rosarito","Baja California","$300 3-day trip",R.drawable.rosarito));
        recentsDataList.add(new RecentsData("Austin","Texas","$300 3-day trip",R.drawable.austin));
        recentsDataList.add(new RecentsData("Seattle","Washington","$500 3-day trip",R.drawable.seattle));

        setRecentRecycler(recentsDataList);

        List<TopPlacesData> topPlacesDataList = new ArrayList<>();
        topPlacesDataList.add(new TopPlacesData("Crete","Greece","$900 3-day trip",R.drawable.crete));
        topPlacesDataList.add(new TopPlacesData("Edinburgh","Scotland","$800 3-day trip",R.drawable.edinburgh));
        topPlacesDataList.add(new TopPlacesData("Las Vegas","Nevada","$900 3-day trip",R.drawable.vegas));
        topPlacesDataList.add(new TopPlacesData("Yucatan","Mexico","$500 3-day trip",R.drawable.yucatan));
        topPlacesDataList.add(new TopPlacesData("Vancouver","Canada","$500 3-day trip",R.drawable.vancouver));

        setTopPlacesRecycler(topPlacesDataList);
    }

    private  void setRecentRecycler(List<RecentsData> recentsDataList){

        recentRecycler = findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsAdapter = new RecentsAdapter(this, recentsDataList);
        recentRecycler.setAdapter(recentsAdapter);

    }

    private  void setTopPlacesRecycler(List<TopPlacesData> topPlacesDataList){

        topPlacesRecycler = findViewById(R.id.top_places_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        topPlacesRecycler.setLayoutManager(layoutManager);
        topPlacesAdapter = new TopPlacesAdapter(this, topPlacesDataList);
        topPlacesRecycler.setAdapter(topPlacesAdapter);

    }
    private void profile(){
        ImageView profile = (ImageView) findViewById(R.id.profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Profile.class));
            }
        });
    }
    private void favorites(){
        ImageView favorites = (ImageView) findViewById(R.id.favorites);
        favorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Favorites.class));
            }
        });
    }
    private void search(){
        ImageView profile = (ImageView) findViewById(R.id.search);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Search.class));
            }
        });
    }

}
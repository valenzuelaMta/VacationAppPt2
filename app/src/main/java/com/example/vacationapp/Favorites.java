package com.example.vacationapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.vacationapp.adapter.RecentsAdapter;
import com.example.vacationapp.model.RecentsData;

import java.util.ArrayList;
import java.util.List;

public class Favorites extends AppCompatActivity {

    RecyclerView recentRecycler;
    RecentsAdapter recentsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        return5();

        List<RecentsData> recentsDataList = new ArrayList<>();

        recentsDataList.add(new RecentsData("Chicago","Illinois","$700 3-day trip",R.drawable.chicago));
        recentsDataList.add(new RecentsData("Sedona","Arizona","$300 3-day trip",R.drawable.sedona));
        recentsDataList.add(new RecentsData("Rosarito","Baja California","$300 3-day trip",R.drawable.rosarito));
        recentsDataList.add(new RecentsData("Austin","Texas","$300 3-day trip",R.drawable.austin));
        recentsDataList.add(new RecentsData("Seattle","Washington","$500 3-day trip",R.drawable.seattle));
        recentsDataList.add(new RecentsData("Venice","Italy","$889 3-day trip",R.drawable.venice));

        setRecentRecycler(recentsDataList);

    }
    private void return5(){
        ImageView return4 = (ImageView) findViewById(R.id.return5);
        return4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Favorites.this, MainActivity.class));
            }
        });
    }

    private  void setRecentRecycler(List<RecentsData> recentsDataList){

        recentRecycler = findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsAdapter = new RecentsAdapter(this, recentsDataList);
        recentRecycler.setAdapter(recentsAdapter);

    }
}
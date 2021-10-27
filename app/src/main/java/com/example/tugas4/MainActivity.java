package com.example.tugas4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvLambo;
    private ArrayList<Lambo> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvLambo = findViewById(R.id.rv_lambo);
        rvLambo.setHasFixedSize(true);
        list.addAll(LamboData.getListData());
        showRecyclerList();

    }

    private void showRecyclerList(){
        rvLambo.setLayoutManager(new LinearLayoutManager(this));
        ListLamboAdapter listLamboAdapter = new ListLamboAdapter(list);
        rvLambo.setAdapter(listLamboAdapter);
    }

}
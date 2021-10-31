package com.example.tugasr4recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private WpAdapter adapter;
    private ArrayList<Wp> wpArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView =
                (RecyclerView)findViewById(R.id.recycleview);
        adapter = new WpAdapter(wpArrayList);
        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void addData() {
        wpArrayList = new ArrayList<>();
        wpArrayList.add(new Wp("Polar Star", "Base ATK : 608", "CRIT Rate : +33.1%",R.drawable.wp1));
        wpArrayList.add((new Wp("Mistsplitter Reforged","Base ATK : 671", "CRIT DMG : 44.1%",R.drawable.wp2)));
        wpArrayList.add((new Wp("Wolf's Gravestone", "Base ATK : 608", "ATK : 49,6%",R.drawable.wp3)));
        wpArrayList.add((new Wp("Skyward Pride","Base ATK : 674", "Energy Recharge : 36,8%",R.drawable.wp4)));
        wpArrayList.add((new Wp("Staff of Homa", "Base ATK : 608", "CRIT DMG : 66,2% ", R.drawable.wp5)));
        wpArrayList.add((new Wp("Engulfing Lightning", "Base ATK : 608", "Energy Recharge : 55,1%", R.drawable.wp6)));
        wpArrayList.add((new Wp("Skyward Harp", "Base ATK : 674", "CRIT Rate : 22,1% ", R.drawable.wp7)));
    }
}

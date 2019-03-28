package com.example.lenovo.customadap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] players = {"Roger Federer","Lionel Messi","Virat Kohli"};
    String[] countries = {"Switzerland","Argentina","India"};
    String[] sports={"Tennis","Football","Cricket"};
    Integer[] images={R.drawable.federer,R.drawable.messi,R.drawable.virat};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.list_view);
        sportsAdapter adapter = new sportsAdapter(this,players,countries,sports,images);
        listView.setAdapter(adapter);

    }
}

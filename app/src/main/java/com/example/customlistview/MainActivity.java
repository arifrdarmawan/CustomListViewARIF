package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Hero> listHero;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);

        listHero = new ArrayList<>();
        listView = (ListView) findViewById(R.id.listView);

            listHero.add(new Hero(R.drawable.spiderman, "Spiderman","Avenged"));
            listHero.add(new Hero(R.drawable.joker,"Joker","Justice League"));
            listHero.add(new Hero(R.drawable.ironman,"Iron Man","Avenged"));
            listHero.add(new Hero(R.drawable.doctorstrange,"Doctor Strange", "Avenged"));
            listHero.add(new Hero(R.drawable.captainamerica,"Captain America","Avenged"));
            listHero.add(new Hero(R.drawable.batman,"Batman","Justice League"));

        MyListAdapter adapter = new MyListAdapter(this,R.layout.my_custom_list,listHero);
        listView.setAdapter(adapter);
    }
}

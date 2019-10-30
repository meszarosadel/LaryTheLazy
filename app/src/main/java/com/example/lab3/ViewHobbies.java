package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ViewHobbies extends AppCompatActivity {

    ListView listView;
    ArrayAdapter myAdapter;
    ArrayList<String> hobbiesString = new ArrayList<>();
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_hobbies);

        listView = findViewById(R.id.listView);
        db = new DatabaseHelper(this);
        writeHobbies((ArrayList<Hobby>)db.getAllHobbies());
    }

        public void writeHobbies( ArrayList<Hobby> hobbies){
            for(int i=0; i<hobbies.size(); i++){
                hobbiesString.add(hobbies.get(i).getHobby());
            }
            myAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_activated_1, hobbiesString);
            listView.setAdapter(myAdapter);

    }
}

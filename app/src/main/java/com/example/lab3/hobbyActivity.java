package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class hobbyActivity extends AppCompatActivity {

    DatabaseHelper db;
    User user;
    EditText newHobbyEditText;
    Button addNewHobbyBtn;
    Button viewHobbiesBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hobby);

        newHobbyEditText = findViewById(R.id.newHobbyEditText);
        addNewHobbyBtn = (Button) findViewById(R.id.addNewHobbyBtn);
        viewHobbiesBtn = (Button) findViewById(R.id.viewHobbiesBtn);
        addNewHobbyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user.addHobby(newHobbyEditText.getText().toString());
                db.insertHobby(newHobbyEditText.getText().toString());
            }
        });
        viewHobbiesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewListOfHobbies();
            }
        });
/*        //listView = findViewById(R.id.listView);
        db = new DatabaseHelper(this);
        writeHobbies((ArrayList<Hobby>)db.getAllHobbies());
    }

        public void writeHobbies( ArrayList<Hobby> hobbies){
            for(int i=0; i<hobbies.size(); i++){
                hobies.add(hobbies.get(i).getHobby());
            }
           // myAdapter = new ArrayAdapter(this, android.R.simple_list_item_activated_1, hobies);
            listView.setAdapter(myAdapter);
  */      }

        public void viewListOfHobbies(){
            Intent intent = new Intent(this, ViewHobbies.class );
            startActivity(intent);
        }
    }
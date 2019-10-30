package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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

        user=new User();
        db=new DatabaseHelper(this);
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
}

        public void viewListOfHobbies(){
            Intent intent = new Intent(this, ViewHobbies.class );
            startActivity(intent);
        }
    }
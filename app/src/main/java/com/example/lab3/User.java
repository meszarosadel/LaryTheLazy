package com.example.lab3;

import java.util.ArrayList;
import java.util.Date;

public class User {
    private String name = "";
    private String password = "";
    private String date = "";
    private ArrayList<String> hobbies = new ArrayList<String>();

    public User(){
        this.name = "";
        this.password = "";
        this.date = "";
        hobbies.add("");
    }

    public void addHobby(String hobby){
        this.hobbies.add(hobby);
    }
}

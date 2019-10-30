package com.example.lab3;

public class Hobby {
    public static final String TABLE_NAME = "hobbies";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_HOBBY = "hobby";

    private int id;
    private String hobby;


    // Create table SQL query
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_HOBBY + " TEXT"
                    + ")";

    public Hobby() {
    }

    public Hobby(int id, String hobby) {
        this.id = id;
        this.hobby = hobby;
       // this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setId(int id) {
        this.id = id;
    }

}
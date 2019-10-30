package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.content.Intent;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper myDb;
    TextView dateTextView;
    Button dateBtn;
    Calendar calendar;
    DatePickerDialog dpd;
    Button logInBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDb = new DatabaseHelper(this);

        dateTextView = (TextView) findViewById(R.id.dateViewText);
        dateBtn = (Button) findViewById(R.id.dateBtn);
        dateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calendar = Calendar.getInstance();

                int day = calendar.get(Calendar.DAY_OF_MONTH);
                int month = calendar.get(Calendar.MONTH);
                int year  = calendar.get(Calendar.YEAR);

                dpd = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int mYear, int mMonth, int mDayOfMonth) {
                        dateTextView.setText(mYear + "/" + (mMonth+1) + "/"+ mDayOfMonth);
                    }

                }, day, month, year);
                dpd.show();

            }
        });

        logInBtn= (Button) findViewById(R.id.loginBtn);
        logInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loggingIn();
            }
        });
    }

    public void loggingIn(){
        Intent intent = new Intent(this, hobbyActivity.class);
        startActivity(intent);
    }
}

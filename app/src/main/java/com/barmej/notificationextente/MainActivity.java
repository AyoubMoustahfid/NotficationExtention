package com.barmej.notificationextente;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    NotificationCounter notificationCounter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = findViewById(R.id.button);
        notificationCounter = new NotificationCounter(findViewById(R.id.notificationNumber));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notificationCounter.increaseNumber();
            }
        });
    }
}

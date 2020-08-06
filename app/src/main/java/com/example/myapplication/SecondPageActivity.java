package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

public class SecondPageActivity extends AppCompatActivity {

    private TextView greetingText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        //hiding title bar
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //hiding action bar
//        getActionBar().hide();


        greetingText = (TextView) findViewById(R.id.textId);
        greetingText.setText("Hello From "+MainActivity.activityName+" Activity");
    }
}

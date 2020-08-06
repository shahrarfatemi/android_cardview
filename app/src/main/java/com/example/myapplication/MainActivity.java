package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public static String activityName;

    CardView shopCardView,cameraCardView,foodCardView,shareCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shopCardView = (CardView) findViewById(R.id.shopCardViewId);
        cameraCardView = (CardView) findViewById(R.id.cameraCardViewId);
        foodCardView = (CardView) findViewById(R.id.foodCardViewId);
        shareCardView = (CardView) findViewById(R.id.shareCardViewId);

        shopCardView.setOnClickListener(this);
        cameraCardView.setOnClickListener(this);
        foodCardView.setOnClickListener(this);
        shareCardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.shopCardViewId){
            activityName = "Shop";
        }
        else if(v.getId() == R.id.cameraCardViewId){
            activityName = "Camera";
        }
        else if(v.getId() == R.id.foodCardViewId){
            activityName = "Food";
        }
        else if(v.getId() == R.id.shareCardViewId){
            activityName = "Share";
        }
        Intent intent = new Intent(MainActivity.this, SecondPageActivity.class);
        startActivity(intent);
    }
}

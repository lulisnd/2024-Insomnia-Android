package com.example.bumain;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class activity2 extends AppCompatActivity {
    public void startAcivitiy(Intent intent) {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ConstraintLayout constraintLayout = findViewById(R.id.ConstraintLayout6);
        ConstraintLayout constraintLayout1= findViewById(R.id.ConstraintLayout7);


    }
}

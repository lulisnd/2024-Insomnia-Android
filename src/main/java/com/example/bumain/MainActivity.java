package com.example.bumain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public void startAcivitiy(Intent intent) {

    }


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout constraintLayout = findViewById(R.id.ConstraintLayout4);
        ConstraintLayout constraintLayout1 = findViewById(R.id.ConstraintLayout5);

        ImageButton imageButton10 = findViewById(R.id.imageButton10);
        ImageButton imageButton2 = findViewById(R.id.imageButton9);

        imageButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建 Intent
                Intent intent = new Intent(MainActivity.this, activity2.class);

                // 可选：传递数据到目标 Activity
                intent.putExtra("key", "value");

                // 启动目标 Activity
                startActivity(intent);
            }
        });
    }
}
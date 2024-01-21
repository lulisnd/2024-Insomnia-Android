package com.example.bumain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;


public class zuyemian extends AppCompatActivity {

    private FrameLayout frameLayout;

    public void startAcivitiy(Intent intent) {

    }

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frameLayout = findViewById(R.id.frameLayout);

        ConstraintLayout constraintLayout1 = findViewById(R.id.constraintLayout1);
        ConstraintLayout constraintLayout2 = findViewById(R.id.constraintLayout2);

        ImageButton imageButton1 = findViewById(R.id.imageButton1);
        ImageButton imageButton2 = findViewById(R.id.imageButton2);
        ImageButton imageButton3 = findViewById(R.id.imageButton3);
        ImageButton imageButton4 = findViewById(R.id.imageButton4);

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建 Intent
                Intent intent = new Intent(zuyemian.this, activity1.class);

                // 可选：传递数据到目标 Activity
                intent.putExtra("key", "value");

                // 启动目标 Activity
                startActivity(intent);
            }
        });



    }
    public void onButtonClick(View view) {
        int imageButtonId = view.getId();

        // 根据点击的按钮ID执行相应的操作
        if (imageButtonId == R.id.imageButton4) {
            addImageButton(R.drawable.zuye);

        }
    }

    private void addImageButton(int imageResource) {
        ImageButton newImageButton = new ImageButton(this);
        newImageButton.setImageResource(imageResource);

        // 设置新按钮的其他属性和监听器等
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(20, 20, 0, 0); // 设置按钮在父布局中的位置
        newImageButton.setLayoutParams(layoutParams);

        frameLayout.addView(newImageButton);
    }
}

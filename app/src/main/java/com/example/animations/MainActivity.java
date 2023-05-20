package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.*;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    Button rotate,scale,alpha,translate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponent();

        translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation move = AnimationUtils.loadAnimation(MainActivity.this,R.anim.move);
                txt.startAnimation(move);
            }
        });

        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation rotateAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                txt.startAnimation(rotateAnim);
            }
        });

        alpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation alphaAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha);
                txt.startAnimation(alphaAnim);
            }
        });

        scale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation scaleAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
                txt.startAnimation(scaleAnim);
            }
        });




    }

    private void initComponent() {
        txt = findViewById(R.id.textView);
        rotate = findViewById(R.id.btnRotate);
        scale = findViewById(R.id.btnScale);
        alpha = findViewById(R.id.btnAlpha);
        translate = findViewById(R.id.btnTranslate);
    }
}
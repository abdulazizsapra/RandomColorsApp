package com.example.randomcolorsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button round_button;
    private View parent_bg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        round_button=(Button)findViewById(R.id.round_button);
        parent_bg=(View)findViewById(R.id.parent_bg);
        final int colors[]={Color.RED,Color.BLUE,Color.CYAN,Color.BLACK,Color.GREEN,Color.WHITE,Color.YELLOW,Color.LTGRAY,Color.DKGRAY,Color.GRAY,Color.MAGENTA};

        round_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                Random r = new Random();
                int random_number=r.nextInt(colors.length);
                parent_bg.setBackgroundColor(colors[random_number]);

            }
        });
    }
}

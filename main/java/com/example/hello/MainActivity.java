package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private boolean isInvisibleText = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void show(View view) {
        Button button = (Button) findViewById(R.id.button);
        TextView startText = (TextView) findViewById(R.id.start_text);
        TextView message = (TextView) findViewById(R.id.text_hello);
        if (isInvisibleText) {
            startText.setVisibility(view.INVISIBLE);
            message.setTextColor(randColor());
            message.setVisibility(view.VISIBLE);
            button.setText("Hide text");
            isInvisibleText = false;
        } else {
            message.setVisibility(view.INVISIBLE);
            button.setText("Show Hello");
            startText.setText("Try again. Press the button!");
            startText.setVisibility(view.VISIBLE);
            isInvisibleText = true;
        }

    }

    private int randColor() {
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        return color;
    }


}
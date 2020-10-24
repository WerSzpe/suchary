package com.example.suchary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button generateTextButton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generateTextButton = findViewById(R.id.generateButton);
        textView = findViewById(R.id.textOfJoke);

        generateTextButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                textView.setText(changeJoke(7));
            }
        });

    }

    public String changeJoke (int length) {

        String[] jokes = {
                "Lorem Lorem Lorem Lorem Lorem Lorem Lorem Lorem Lorem Lorem Lorem Lorem Lorem Lorem Lorem Lorem Lorem Lorem",
                "ipsum ipsum ipsum ipsum ipsum ipsum ipsum ipsum ipsum ipsum ipsum ipsum ipsum ipsum ipsum ipsum ipsum ipsum",
                "dolor dolor dolor dolor dolor dolor dolor dolor dolor dolor dolor dolor dolor dolor dolor dolor dolor dolor",
                "sit sit sit sit sit sit sit sit sit sit sit sit sit sit sit sit sit sit sit sit sit sit sit sit sit sit sit sit",
                "amet amet amet amet amet amet amet amet amet amet amet amet amet amet amet amet amet amet amet amet amet amet"
        };
        int rand = new Random().nextInt(jokes.length);

        return jokes[rand];

    }

    public void changeJoke(View view) {
        changeJoke(7);
    }
}
package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.LinkedList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay = (ImageView) findViewById(R.id.image_eightBall);

        final LinkedList<Integer> ballArray = new LinkedList<>();
        ballArray.add(R.drawable.ball1);
        ballArray.add(R.drawable.ball2);
        ballArray.add(R.drawable.ball3);
        ballArray.add(R.drawable.ball4);
        ballArray.add(R.drawable.ball5);

        final Button myButton = (Button)findViewById(R.id.askButton);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumberGenerator = new Random();
                final int number = randomNumberGenerator.nextInt(5);

                ballDisplay.setImageResource(ballArray.get(number));
            }
        });
    }
}

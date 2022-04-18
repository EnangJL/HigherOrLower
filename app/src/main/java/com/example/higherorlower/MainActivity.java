package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;
    public void randNumberGenerator()  //for repeeting the game
    {
        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;
    }
    public void onGues (View view)
    {
        String message;
        EditText editTextNumber = (EditText) findViewById(R.id.editTextNumber);
        int guessedNumber = Integer.parseInt(editTextNumber.getText().toString());
        if (guessedNumber < randomNumber)
            message="Higher !!";
        else if (guessedNumber > randomNumber)
            message="lower !!";
        else
        {
            message="You got you !!";
            randomNumberGenerator();  //kinda recurtion !
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void randomNumberGenerator() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;  //limit upto 20 from 1
    }
}
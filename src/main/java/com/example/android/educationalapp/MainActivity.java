package com.example.android.educationalapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void checkAnswers(View view){

        //check answer 1
        boolean answer1 = ((CheckBox)findViewById(R.id.question1_answer1)).isChecked();
        boolean answer2 = ((CheckBox)findViewById(R.id.question1_answer2)).isChecked();
        boolean answer3 = ((CheckBox)findViewById(R.id.question1_answer3)).isChecked();
        boolean answer4 = ((CheckBox)findViewById(R.id.question1_answer4)).isChecked();
        if (answer2 && answer4 && !answer1 && !answer3){
            score ++;
        }

        //check answer 2
        boolean isTwo = ((RadioButton) findViewById(R.id.question2_answer3)).isChecked();
        if(isTwo){
            score ++;
        }

        //checks question 3
        boolean isYes = ((RadioButton) findViewById(R.id.yes_radio_button)).isChecked();
        if (isYes){
            score ++;
        }

        //checks question 4
        EditText textbox = (EditText) findViewById(R.id.question4);
        String q4answer = textbox.getText().toString();
        q4answer = q4answer.toUpperCase();
        if (q4answer.equals("VENUS")){
            score ++;
        }


        String result = ("You scored " + score +" out of 4.");
        Toast.makeText(this, result, Toast.LENGTH_LONG).show();
        score = 0;
    }
}

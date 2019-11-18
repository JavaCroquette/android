package com.example.projet_quizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class QuestionActivity extends AppCompatActivity {

    final String THEME = "theme";
    final String trueAnswer = "ANSWER";
    Boolean isDone = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question);

        Intent intent = getIntent();
        String theme = intent.getStringExtra(THEME);

        final TextView textTheme = findViewById(R.id.textTheme);
        textTheme.setText(theme);

        final Button answer1 = findViewById(R.id.answerButton1);
        final Button answer2 = findViewById(R.id.answerButton2);
        final Button answer3 = findViewById(R.id.answerButton3);
        final Button answer4 = findViewById(R.id.answerButton4);

        View.OnClickListener onClickAnswer1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(trueAnswer.equals(answer1.getText().toString())){
                    showToast("Bonne réponse !");
                    isDone = true;
                }
                else{
                    showToast("Mauvaise réponse !");
                }
            }
        };
        answer1.setOnClickListener(onClickAnswer1);
        View.OnClickListener onClickAnswer2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(trueAnswer.equals(answer2.getText().toString())){
                    showToast("Bonne réponse !");
                    isDone = true;
                }
                else{
                    showToast("Mauvaise réponse !");
                }
            }
        };
        answer2.setOnClickListener(onClickAnswer2);
        View.OnClickListener onClickAnswer3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(trueAnswer.equals(answer3.getText().toString())){
                    showToast("Bonne réponse !");
                    isDone = true;
                }
                else{
                    showToast("Mauvaise réponse !");
                }
            }
        };
        answer3.setOnClickListener(onClickAnswer3);
        View.OnClickListener onClickAnswer4 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(trueAnswer.equals(answer4.getText().toString())){
                    showToast("Bonne réponse !");
                    isDone = true;
                }
                else{
                    showToast("Mauvaise réponse !");
                }
            }
        };
        answer4.setOnClickListener(onClickAnswer4);

    }

    public void showToast(String message) {
        CharSequence text = message;
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(getApplicationContext(), text, duration);
        toast.show();
    }
}

package com.example.projet_quizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String THEME = "theme";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageButton movies = findViewById(R.id.moviesButton);
        final ImageButton series = findViewById(R.id.seriesButton);
        final ImageButton video_games = findViewById(R.id.videoGamesButton);
        final ImageButton blax = findViewById(R.id.blaxButton);
        final ImageButton random = findViewById(R.id.randomButton);

        View.OnClickListener moviesClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String theme = "Movies";
                startActivity(getIntent(theme));
            }
        };
        movies.setOnClickListener(moviesClick);
        View.OnClickListener seriesClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String theme = "Series";
                startActivity(getIntent(theme));
            }
        };
        series.setOnClickListener(seriesClick);
        View.OnClickListener videoGamesClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String theme = "Video games";
                startActivity(getIntent(theme));
            }
        };
        video_games.setOnClickListener(videoGamesClick);
        View.OnClickListener blaxClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String theme = "Blax";
                startActivity(getIntent(theme));
            }
        };
        blax.setOnClickListener(blaxClick);
        View.OnClickListener randomClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                double randDouble = rand.nextDouble();
                String theme = null;
                if(randDouble < 0.25d){
                    theme = "Movies";
                }
                else if(0.25d <= randDouble && randDouble < 0.5d){
                    theme = "Series";
                }
                else if(0.5d <= randDouble && randDouble < 0.75d){
                    theme = "Video_games";
                }
                else if(0.75d <= randDouble){
                    theme = "Blax";
                }
                startActivity(getIntent(theme));
            }
        };
        random.setOnClickListener(randomClick);

    }

    private Intent getIntent(String theme){
        final Intent intent = new Intent(this, QuestionActivity.class);
        intent.putExtra(THEME, theme);
        return intent;
    }
}

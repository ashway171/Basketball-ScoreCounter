package com.example.basketballscorecounter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView scoreATextView;
    TextView scoreBTextView;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreATextView = (TextView) findViewById(R.id.teamAPoints);
        scoreBTextView = (TextView) findViewById(R.id.teamBPoints);
        resultTextView = (TextView) findViewById(R.id.resultDisplay);
    }
    int scoreTeamA=0;
    int scoreTeamB=0;
    String result="";

    //For 3 points
    public void teamA3points(View view){
        scoreTeamA+=3;
        scoreATextView.setText("" +scoreTeamA);

    }
    public void teamB3Points(View view){
        scoreTeamB+=3;
        scoreBTextView.setText("" +scoreTeamB);

    }

    //For 2 points
    public void teamA2points(View view){
        scoreTeamA+=2;
        scoreATextView.setText("" +scoreTeamA);

    }
    public void teamB2points(View view){
        scoreTeamB+=2;
        scoreBTextView.setText("" +scoreTeamB);
    }

    //For 1 point (Free throw)
    public void teamA1points(View view){
        scoreTeamA++;
        scoreATextView.setText("" +scoreTeamA);
    }
    public void teamB1points(View view){
        scoreTeamB++;
        scoreBTextView.setText("" +scoreTeamB);
    }

    //Reset scores of both teams to zero
    public void reset(View view){
        scoreTeamA = 0;
        scoreTeamB= 0;
        result="";
        scoreATextView.setText("" +scoreTeamA);
        scoreBTextView.setText("" +scoreTeamB);
        Toast.makeText(this, "Scores have been reset to zero", Toast.LENGTH_SHORT).show();
    }

    // Display the result in various conditions
    public void result(View view) {
        if (scoreTeamA > scoreTeamB) {
            result = "Team A Won by "+(scoreTeamA-scoreTeamB)+" Points";
            resultTextView.setText(result);
        }
        else
        if(scoreTeamA < scoreTeamB) {
            result = "Team B Won by "+(scoreTeamB-scoreTeamA)+" Points";
            resultTextView.setText(result);
        }
        else
        if(scoreTeamA==scoreTeamB) {
            if((scoreTeamA==0) && (scoreTeamB==0)) {
                Toast.makeText(this, "Enter Points First", Toast.LENGTH_SHORT).show();
            }
            else {
                result = "Match draw";
                resultTextView.setText(result);
            }
        }
    }
}
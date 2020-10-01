package com.example.basketball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int cal =0;
    int calb = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threeP(View view) {
        cal = cal+3;
        displayForTeamA(cal);
    }

    public void twoP(View view) {
        cal = cal+2;
        displayForTeamA(cal);
    }

    public void oneP(View view) {
        cal = cal+1;
        displayForTeamA(cal);
    }

    public void threeC(View view) {
        calb = calb+3;
        displayForTeamB(calb);
    }

    public void twoC(View view) {
        calb = calb+2;
        displayForTeamB(calb);
    }

    public void oneC(View view) {
        calb = calb+1;
        displayForTeamB(calb);
    }

    public void Reset(View view) {
        cal = 0;
        calb = 0;
        displayForTeamA(cal);
        displayForTeamB(calb);
    }
}
package com.example.sayedsalah.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int team_a_goal = 0, team_b_goal = 0;
    int team_a_mistake = 0, tam_b_mistake = 0;
    int team_a_offside = 0, tam_b_offside = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayForTeamA_goal(team_a_goal);
        displayForTeamA_mistake(team_a_mistake);
        displayForTeamA_offside(team_a_offside);

        displayForTeamB_goal(team_b_goal);
        displayforteamB_mistake(tam_b_mistake);
        displayforteamB_offside(tam_b_offside);
    }

    /**
     * execute when we click at goal for team A
     */
    public void team_a_goal_method(View view) {
        team_a_goal += 1;
        displayForTeamA_goal(team_a_goal);

    }

    /**
     * execute when we click at mistake for team A
     */
    public void team_a_mistake_method(View view) {
        team_a_mistake += 1;
        displayForTeamA_mistake(team_a_mistake);

    }

    /**
     * execute when we click at offside for team A
     */
    public void team_a_offside_method(View view) {
        team_a_offside += 1;
        displayForTeamA_offside(team_a_offside);

    }

    /**
     * execute when we click at goal for team B
     */
    public void team_b_goal_method(View view) {
        team_b_goal += 1;
        displayForTeamB_goal(team_b_goal);

    }

    /**
     * execute when we click at mistake for team B
     */

    public void team_b_mistake_method(View view) {
        tam_b_mistake += 1;
        displayforteamB_mistake(tam_b_mistake);

    }

    /**
     * execute when we click at offside for team B
     */
    public void team_b_offside_method(View view) {
        tam_b_offside += 1;
        displayforteamB_offside(tam_b_offside);

    }

    /**
     * execute when we click at reset button
     */
    public void resetmethod(View v) {
        team_a_goal = 0;
        team_a_mistake = 0;
        team_a_offside = 0;


        team_b_goal = 0;
        tam_b_mistake = 0;
        tam_b_offside = 0;
        displayForTeamA_goal(team_a_goal);
        displayForTeamA_mistake(team_a_mistake);
        displayForTeamA_offside(team_a_offside);

        displayForTeamB_goal(team_b_goal);
        displayforteamB_mistake(tam_b_mistake);
        displayforteamB_offside(tam_b_offside);

    }

    /**
     * Displays the given score  for Team A.
     */
    public void displayForTeamA_goal(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given mistake  for Team A.
     */
    public void displayForTeamA_mistake(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_mistake);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given offside  for Team A.
     */
    public void displayForTeamA_offside(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_offside);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB_goal(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given mistake for Team B.
     */

    public void displayforteamB_mistake(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_mistake);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given offside for Team B.
     */

    public void displayforteamB_offside(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_offside);
        scoreView.setText(String.valueOf(score));
    }


}

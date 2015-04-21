package com.example.seulki_lee.myapplication;

/**
 * Created by Seulki_Lee on 4/13/2015.
 */

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Statistic_Activity extends Activity{
    Button button;
    RelativeLayout menu;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistic);
        addListenerOnMenuButton();
        addListenerOnMonthlyButton();
        addListenerOnWeeklyButton();
    }
    public void addListenerOnMenuButton() {

        final Context context = this;

        menu = (RelativeLayout) findViewById(R.id.menu);

        menu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
            }
        });
    }
    public void addListenerOnMonthlyButton() {

        final Context context = this;

        menu = (RelativeLayout) findViewById(R.id.monthlyActivity);

        menu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
            }
        });
    }
    public void addListenerOnWeeklyButton() {

        final Context context = this;

        menu = (RelativeLayout) findViewById(R.id.weeklyActivity);

        menu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

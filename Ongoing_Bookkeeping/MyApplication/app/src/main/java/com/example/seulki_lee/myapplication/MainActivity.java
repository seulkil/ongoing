package com.example.seulki_lee.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnStatisticButton();
        addListenerOnRecordButton();
        addListenerOnPlanButton();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void addListenerOnStatisticButton() {

        final Context context = this;

        Button statisticButton = (Button) findViewById(R.id.statisticButton);

        statisticButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Statistic_Activity.class);
                startActivity(intent);
            }
        });
    }

    public void addListenerOnRecordButton() {

        final Context context = this;

        Button statisticButton = (Button) findViewById(R.id.recordButton);

        statisticButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Record_Activity.class);
                startActivity(intent);

            }
        });
    }

    public void addListenerOnPlanButton() {

        final Context context = this;

        Button statisticButton = (Button) findViewById(R.id.planButton);

        statisticButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Plan_Activity.class);
                startActivity(intent);
            }
        });
    }

}

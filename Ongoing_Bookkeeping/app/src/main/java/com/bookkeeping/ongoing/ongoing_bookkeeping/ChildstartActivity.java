package com.bookkeeping.ongoing.ongoing_bookkeeping;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.bookkeeping.ongoing.ongoing_bookkeeping.user.LoginActivity;
import com.parse.ParseUser;

/**
 * Created by Seulki_Lee on 5/5/2015.
 */
public class ChildstartActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_childstart);
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

        statisticButton.setOnClickListener(new View.OnClickListener() {

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

        statisticButton.setOnClickListener(new View.OnClickListener() {

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

        statisticButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Plan_Activity.class);
                startActivity(intent);
            }
        });
    }
    public void logoutButton(View view){
        ParseUser.logOut();
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

}

package com.example.seulki_lee.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

/**
 * Created by Seulki_Lee on 4/15/2015.
 */
public class Record_Activity extends Activity{
    Button button;
    RelativeLayout menu;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);
        addListenerOnMenuButton();
        addListenerOnRecordingButton();

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
    public void addListenerOnRecordingButton() {

        final Context context = this;

        menu = (RelativeLayout) findViewById(R.id.recordActivityButton);

        menu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Recording_Activity.class);
                startActivity(intent);
            }
        });
    }
}

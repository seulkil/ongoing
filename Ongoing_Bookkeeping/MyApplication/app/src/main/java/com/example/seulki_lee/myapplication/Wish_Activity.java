package com.example.seulki_lee.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

/**
 * Created by Seulki_Lee on 4/20/2015.
 */
public class Wish_Activity extends Activity {
    Button button;
    RelativeLayout menu;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recording);
        addListenerOnMenuButton();

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


}

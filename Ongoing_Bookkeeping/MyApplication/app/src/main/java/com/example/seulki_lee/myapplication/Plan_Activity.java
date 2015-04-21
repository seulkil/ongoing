package com.example.seulki_lee.myapplication;

/**
 * Created by Seulki_Lee on 4/15/2015.
 */

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Plan_Activity extends Activity {
    Button button;
    RelativeLayout menu;
    RelativeLayout makeWish;
    RelativeLayout deleteWish;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan);
        addListenerOnMenuButton();
        addListenerOnDeleteButton();
        addListenerOnWishButton();
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

    public void addListenerOnWishButton() {

        final Context context = this;

        menu = (RelativeLayout) findViewById(R.id.menu);

        menu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Wish_Activity.class);
                startActivity(intent);
            }
        });
    }

    public void addListenerOnDeleteButton() {

        final Context context = this;

        deleteWish = (RelativeLayout) findViewById(R.id.deleteWishActivityButton);

        menu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
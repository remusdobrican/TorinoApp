package com.example.remusdobrican.turapp.challenge2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.remusdobrican.turapp.MapActivity_5;
import com.example.remusdobrican.turapp.R;
import com.example.remusdobrican.turapp.challenge3.Challenge3Activity;


public class BadAnswerActivity2 extends ActionBarActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bad_answer_challenge2);

        addListenerOnButton1(); // tryAgain button
        addListenerOnButton2(); // nextChallenge button
        addListenerOnButton3(); // returnToMap button
    }

    // tryAgain -> Challenge2Activity
    private void addListenerOnButton1() {
        final Context context = this;
        button = (Button)findViewById(R.id.buttonretmap);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Challenge2Activity.class);
                startActivity(intent);
            }
        });
    }

    // nextChallenge -> Challenge3Activity
    private void addListenerOnButton2() {
        final Context context = this;
        button = (Button)findViewById(R.id.buttonnextchallenge);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Challenge3Activity.class);
                startActivity(intent);
            }
        });
    }

    // returnToMap -> MapActivity_5
    private void addListenerOnButton3() {
        final Context context = this;
        button = (Button)findViewById(R.id.buttontryagain);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MapActivity_5.class);
                startActivity(intent);
                finish();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bad_answer_challenge2, menu);
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
}

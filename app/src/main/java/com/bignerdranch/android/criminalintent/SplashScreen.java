package com.bignerdranch.android.criminalintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Muhib on 12/1/2016.
 */

public class SplashScreen extends AppCompatActivity{


    private void startUp(){
        CrimeLab.get(SplashScreen.this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startUp();
        setContentView(R.layout.splash);

        Thread countdown_timer = new Thread() {
            public void run() {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(SplashScreen.this, CrimeListActivity.class);
                    startActivity(intent);
                }
            }
        };

        countdown_timer.start();
    }
     @Override
     protected void onPause(){
         super.onPause();
         finish();
     }


}

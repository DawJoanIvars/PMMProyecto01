package com.example.joan.pmmproyecto01;

/**
 * Created by Joan on 14/10/2015.
 */

import android.app.Activity;
import java.util.Timer;
import java.util.TimerTask;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Window;

public class SplashActivity extends Activity {

    // Tiempo del timer
    private static final long SPLASH_SCREEN_DELAY = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Pongo la orientacion.
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        // Quito la barra de titulo.
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.imagen);

        TimerTask task = new TimerTask() {
            @Override
            public void run() {

                // Inicio el activity
                Intent mainIntent = new Intent().setClass(
                        SplashActivity.this, MainActivity.class);
                startActivity(mainIntent);
                finish();
            }
        };

        // Creo el timer y le doy el tiempo.
        Timer timer = new Timer();
        timer.schedule(task, SPLASH_SCREEN_DELAY);
    }

}
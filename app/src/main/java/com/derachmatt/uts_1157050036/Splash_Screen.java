package com.derachmatt.uts_1157050036;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);
        Thread thread = new Thread(){
            @Override
            public void run() {
                try{
                    sleep(4000);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(new Intent(Splash_Screen.this, Home.class));
                    Splash_Screen.this.finish();
                }
            }
        };
        thread.start();
    }
}

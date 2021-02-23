package comp3350.winSport.presentation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import comp3350.winSport.R;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        Handler handler=new Handler();

        handler.postDelayed(
                new Runnable() {
                    @Override
                    public void run() {
                        Intent intent=new Intent(SplashScreenActivity.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                },6000);

    }
}
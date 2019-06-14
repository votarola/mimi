package com.example.mimi;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.example.mimi.Colors.ColorsYellow;


public class MainActivity_result_nok extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_result_nok);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(MainActivity_result_nok.this, ColorsYellow.class);
                    startActivity(intent);
                    MainActivity_result_nok.this.finish();
                }
            }, 3000);

        }
    }


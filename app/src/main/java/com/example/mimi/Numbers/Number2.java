package com.example.mimi.Numbers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import com.example.mimi.R;
import es.dmoral.toasty.Toasty;

public class Number2 extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number2);

        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);
        findViewById(R.id.button5).setOnClickListener(this);
        findViewById(R.id.button6).setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button2:
                Toasty.success(Number2.this, "Excelente!!",
                        Toast.LENGTH_SHORT, true).show();
                Intent intent = new Intent(Number2.this, Number1.class);
                startActivity(intent);
                Number2.this.finish();

                break;

                    default:
                        Toasty.error(Number2.this, "Vuelve a intentarlo!",
                                Toast.LENGTH_SHORT, true).show();


        }
    }
}

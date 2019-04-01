package com.example.myfiretapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if(getIntent().hasExtra("com.example.myfiretapplication.SOMETHING")){
            TextView tv = (TextView) findViewById(R.id.viewInfo);
            String text = getIntent().getExtras().getString("com.example.myfiretapplication.SOMETHING");
            tv.setText(text);
        }

        Button convert = (Button) findViewById(R.id.convert);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText kg = (EditText) findViewById(R.id.kg);
                TextView lb = (TextView) findViewById(R.id.lb);

                double num1 = Integer.parseInt(kg.getText().toString());
                double sum = num1 * 2.20462262185;
                lb.setText(num1 + " KG equals to " + sum + " Lbs");

            }
        });



    }
}

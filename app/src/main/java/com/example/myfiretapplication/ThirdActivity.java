package com.example.myfiretapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        if(getIntent().hasExtra("com.example.myfiretapplication.SOMETHING")){
            TextView tv3 = (TextView) findViewById(R.id.tv3);
            String text = getIntent().getExtras().getString("com.example.myfiretapplication.SOMETHING");
            tv3.setText(text);
        }

        Button convert2 = (Button) findViewById(R.id.convert2);
        convert2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText cels = (EditText) findViewById(R.id.cels);
                TextView fah = (TextView) findViewById(R.id.fah);

                double num1 = Integer.parseInt(cels.getText().toString());
                double sum = num1 * 9/5 + 32;
                fah.setText(num1 + " Celsius equals to " + sum + " Fahrenheit");

            }
        });
    }
}

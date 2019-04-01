package com.example.myfiretapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = (Button) findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText personName = (EditText) findViewById(R.id.personName);
                Button addBtn = (Button) findViewById(R.id.addBtn);
                TextView greet = (TextView) findViewById(R.id.greet);

                name = personName.getText().toString();

                greet.setText("Welcome " + name);
            }
        });

        Button secondActivityBtn = (Button) findViewById(R.id.secondActivityBtn);
        secondActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), SecondActivity.class);
                startIntent.putExtra("com.example.myfiretapplication.SOMETHING", "Convert KG to LB");
                startActivity(startIntent);
            }
        });

        Button thirdActivityBtn = (Button) findViewById(R.id.thirdActivityBtn);
        thirdActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), ThirdActivity.class);
                startIntent.putExtra("com.example.myfiretapplication.SOMETHING", "Convert Celsius to Fahrenheit");
                startActivity(startIntent);
            }
        });
    }


}

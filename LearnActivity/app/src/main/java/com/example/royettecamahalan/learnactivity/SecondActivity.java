package com.example.royettecamahalan.learnactivity;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 *
 */
public class SecondActivity extends AppCompatActivity {

    Button btnOpenThird;
    TextView SecondTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        btnOpenThird= (Button) findViewById(R.id.btnopenthirdlayout);
        SecondTV= (TextView) findViewById(R.id.TVSecond);

        SecondTV.setText("sfsdsdfsdf");
        SecondTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnOpenThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Show Message to user
                Toast.makeText(SecondActivity.this,"Clicked", Toast.LENGTH_SHORT).show();

                Intent thirdintent=new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(thirdintent);
            }
        });
    }
}

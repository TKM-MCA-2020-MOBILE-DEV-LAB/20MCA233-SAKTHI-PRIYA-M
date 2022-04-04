package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView tv1,tv2,tv3,tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv1=findViewById(R.id.textView11);
        tv2=findViewById(R.id.textView12);
        tv3=findViewById(R.id.textView13);
        tv4=findViewById(R.id.textView14);

        Bundle extras=getIntent().getExtras();
        String str1= extras.getString("value1");
        String str2= extras.getString("value2");
        String str3= extras.getString("value3");
        String str4=extras.getString("value4");

        tv1.setText(str1);
        tv2.setText(str2);
        tv3.setText(str3);
        tv4.setText(str4);

    }
}
package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name,age,email,phone;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.edit1);
        age=findViewById(R.id.edit2);
        email=findViewById(R.id.edit3);
        phone=findViewById(R.id.edit4);

    }
        public void onClick(View view) {
            Intent i=new Intent(getApplicationContext(),MainActivity2.class);
            i.putExtra("value1",name.getText().toString());
            i.putExtra("value2",age.getText().toString());
            i.putExtra("value3",email.getText().toString());
            i.putExtra("value4",phone.getText().toString());
            startActivity(i);
        }

}
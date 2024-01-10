package com.example.gcalci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Gramactivity extends AppCompatActivity {


    EditText ea,eb;
    TextView ta;
    float numa,numb;
    Button reset1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gramactivity);
    }





    public boolean getNumber()
    {

        ea=(EditText) findViewById(R.id.numa);
        eb=(EditText) findViewById(R.id.numb);
        ta=(TextView) findViewById(R.id.result2);





        reset1=(Button) findViewById(R.id.reset1);

        reset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ea.setText("");
                eb.setText("");
                ta.setText("");
            }
        });
































        String s11=ea.getText().toString();
        String s21=eb.getText().toString();

        if((s11.isEmpty() && s21.isEmpty()))
        {
            String result2="Please enter value";
            ta.setText(result2);

            return false;
        }
        else {
            numa=Float.parseFloat(s11);
            numb=Float.parseFloat(s21);

        }
        return true;
    }

    public void Grams(View view)
    {
        if (getNumber())
        {
            float g=((1000/numb)*numa);
            ta.setText(Float.toString(g));
        }


    }

    public void Money1(View view) {
        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }

    public void Calculator11(View view) {

        Intent intent=new Intent(getApplicationContext(),Calculator.class);
        startActivity(intent);
    }
}
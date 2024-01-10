package com.example.gcalci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText e1,e2;
    TextView t1;
    float num1,num2;

    Button reset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public boolean getNumber()
    {

        e1=(EditText) findViewById(R.id.num1);
        e2=(EditText) findViewById(R.id.num12);
        t1=(TextView) findViewById(R.id.result);



        reset=(Button) findViewById(R.id.reset);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText("");
                e2.setText("");
                t1.setText("");
            }
        });



        


        String s1=e1.getText().toString();

        String s2=e2.getText().toString();



        if((s1.isEmpty() && s2.isEmpty()))
        {
            String result="Please enter value";
            t1.setText(result);

            return false;
        }
        else {
            num1=Float.parseFloat(s1);
            num2=Float.parseFloat(s2);

        }
        return true;
    }

    public void money(View view)
    {
        if (getNumber())
        {
            float m=(num1/(1000/num2));
            t1.setText(Float.toString(m));
        }

    }























    public void Calculator(View view) {

        Intent intent=new Intent(getApplicationContext(),Calculator.class);
        startActivity(intent);
    }

    public void Gram(View view) {

        Intent intent=new Intent(getApplicationContext(),Gramactivity.class);
        startActivity(intent);
    }
}

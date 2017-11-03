package com.example.tmp_sda_1108.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateFoot(View view) {

        try {
            EditText editText = (EditText) findViewById(R.id.meter);
            double b = Double.parseDouble(editText.getText().toString());

            EditText editText1 = (EditText) findViewById(R.id.foot);
            editText1.setText(b * 3.28084 + "foot");

            Toast toast = Toast.makeText(this, "done", Toast.LENGTH_LONG);
            toast.show();
        } catch (Exception ex) {
            Toast toast = Toast.makeText(this, "Wtf are you typing", Toast.LENGTH_LONG);
            toast.show();
        }
    }
        public void calculateYard(View view){

        try{
            EditText editText = (EditText)findViewById(R.id.meter);
            double f = Double.parseDouble(editText.getText().toString());

            EditText editText2 = (EditText)findViewById(R.id.yard);
            editText2.setText(f*3.28084*12+"yard");

            Toast toast = Toast.makeText(this,"Done",Toast.LENGTH_LONG);
        }
        catch (Exception ex){
            Toast toast = Toast.makeText(this,"hksdhkjh",Toast.LENGTH_LONG);
        }
    }



    }





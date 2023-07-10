package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText ed;
String num1="";
String op="";
boolean isnew=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed=findViewById(R.id.text);
    }

    public void numberEvent(View view) {
        if(isnew)
            ed.setText("");
        isnew=false;
        String num=ed.getText().toString();
        switch(view.getId())
        {
            case R.id.one:
                num+="1";
                break;
            case R.id.two:
                num+="2";
                break;
            case R.id.three:
                num+="3";
                break;
            case R.id.four:
                num+="4";
                break;
            case R.id.five:
                num+="5";
                break;
            case R.id.six:
            num+="6";
            break;
            case R.id.seven:
                num+="7";
                break;
            case R.id.eight:
                num+="8";
                break;
            case R.id.nine:
                num+="9";
                break;
            case R.id.zero:
                num+="0";
                break;
            case R.id.dot:
                num+=".";
                break;
            case R.id.ac:
                num="";
                break;
            case R.id.clear:
                num=num.substring(0,num.length()-1);
                break;

        }
        ed.setText(num);
    }

    public void operator(View view) {
        isnew=true;
        num1=ed.getText().toString();
        switch(view.getId())
        {
            case R.id.add: op="+";
            break;
            case R.id.sub: op="-";
                break;
            case R.id.mul: op="*";
                break;
            case R.id.div: op="/";
                break;
        }
    }

    @SuppressLint("SuspiciousIndentation")
    public void disp(View view) {
        double n1=Double.parseDouble(num1);
        double n2=Double.parseDouble(ed.getText().toString());
        if(op.equals("+"))
            ed.setText(Double.toString(n1+n2));
        else if(op.equals("-"))
            ed.setText(Double.toString(n1-n2));
         else if(op.equals("*"))
        ed.setText(Double.toString(n1*n2));
          else if(op.equals("/"))
        ed.setText(Double.toString(n1/n2));
          isnew=true;
    }
}
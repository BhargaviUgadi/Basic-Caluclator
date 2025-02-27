package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;


public class MainActivity extends AppCompatActivity {


    TextView num_et;
    Button continue_btn;
    TextView oneTV,twoTV,threeTV,fourTV,fiveTV,sixTV,sevenTV,eightTV,nineTV,zeroTV,acTV,addTV,subTV,mulTV,divTV,equalTv;
    ImageView clearIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        num_et = findViewById(R.id.num_et);
        oneTV = findViewById(R.id.oneTv);
        twoTV = findViewById(R.id.twoTv);
        threeTV = findViewById(R.id.threeTv);
        fourTV = findViewById(R.id.fourTv);
        fiveTV = findViewById(R.id.fiveTv);
        sixTV = findViewById(R.id.sixTv);
        sevenTV = findViewById(R.id.sevenTv);
        eightTV = findViewById(R.id.eightTv);
        nineTV = findViewById(R.id.nineTv);
        zeroTV = findViewById(R.id.zeroTv);
        acTV = findViewById(R.id.acTv);
        addTV = findViewById(R.id.addTv);
        subTV = findViewById(R.id.subTv);
        mulTV = findViewById(R.id.mulTv);
        divTV = findViewById(R.id.divTv);
        equalTv = findViewById(R.id.equalTv);
        clearIv = findViewById(R.id.clearIv);

        clearIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              if(!num_et.getText().toString().isEmpty()){
                  String updatedText = num_et.getText().toString().substring(0, num_et.getText().toString().length() - 1);
                  num_et.setText(updatedText);
              }

            }
        });
        equalTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String expressionText = num_et.getText().toString();
                try {
                    Expression expression = new ExpressionBuilder(expressionText).build();
                    double result = expression.evaluate();
                    num_et.setText(String.valueOf(result));
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Invalid Expression", Toast.LENGTH_SHORT).show();
                }
            }
        });
        addTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_et.setText(num_et.getText() + "+");
            }
        });
        subTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_et.setText(num_et.getText() + "-");
            }
        });
        mulTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_et.setText(num_et.getText() + "*");
            }
        });
        divTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_et.setText(num_et.getText() + "/");
            }
        });
        acTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_et.setText("");
            }
        });
        oneTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_et.setText(num_et.getText()+"1");
            }
        });
        twoTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_et.setText(num_et.getText()+ "2");
            }
        });
        threeTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_et.setText(num_et.getText()+ "3");
            }
        });
        fourTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_et.setText(num_et.getText()+ "4");
            }
        });
        fiveTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_et.setText(num_et.getText()+ "5");
            }
        });
        sixTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_et.setText(num_et.getText()+ "6");
            }
        });
        sevenTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_et.setText(num_et.getText()+ "7");

            }
        });
        eightTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_et.setText(num_et.getText()+ "8");
            }
        });
        nineTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_et.setText(num_et.getText()+ "9");
            }
        });
        zeroTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_et.setText(num_et.getText()+ "0");
            }
        });

    }
}
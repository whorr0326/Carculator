package com.example.carculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.carculator.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText et = findViewById(R.id.editTextNumber);
        EditText et2 = findViewById(R.id.editTextNumber2);
        TextView textView = findViewById(R.id.textView2);


        //더하기버튼 코드
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 try{
                    int v1 = Integer.parseInt(String.valueOf(et.getText()));
                    int v2 = Integer.parseInt(String.valueOf(et2.getText()));
                    float sum = v1 + v2;
                    textView.setText(String.valueOf(sum));

                }catch(NumberFormatException Exception){
                    Toast.makeText(getApplicationContext(), "올바른 값을 입력하세요", Toast.LENGTH_SHORT).show();
                }
            }
        });
        //빼기버튼 코드
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int v1 = Integer.parseInt(String.valueOf(et.getText()));
                    int v2 = Integer.parseInt(String.valueOf(et2.getText()));
                    double sum = (v1 - v2);
                    textView.setText(String.valueOf(sum));
                }catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(), "올바른 값을 입력하세요", Toast.LENGTH_SHORT).show();
                }

            }
        });
        //곱하기버튼 코드
        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int v1 = Integer.parseInt(String.valueOf(et.getText()));
                    int v2 = Integer.parseInt(String.valueOf(et2.getText()));
                    double sum = (v1 * v2);
                    textView.setText(String.valueOf(sum));
                }catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(), "올바른 값을 입력하세요", Toast.LENGTH_SHORT).show();
                }
            }
        });
        //나누기버튼 코드
        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 try{
                    int v1 = Integer.parseInt(String.valueOf(et.getText()));
                    int v2 = Integer.parseInt(String.valueOf(et2.getText()));
                    if (v2==0){
                        Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다", Toast.LENGTH_LONG).show();
                    }
                    else {
                        double sum = (v1 * 1.0 / v2 * 1.0);
                        textView.setText(String.valueOf(sum));
                    }
                }
                 catch (ArithmeticException e){
                     Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다", Toast.LENGTH_LONG).show();
                 }
                 catch (NumberFormatException e){
                     Toast.makeText(getApplicationContext(), "올바른 값을 입력하세요", Toast.LENGTH_SHORT).show();
                 }
            }
        });
    }
}


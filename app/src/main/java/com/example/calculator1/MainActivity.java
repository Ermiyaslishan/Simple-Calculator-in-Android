package com.example.calculator1;


import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textResult = findViewById(R.id.textView);
        EditText num1 = findViewById(R.id.editTextNumberDecimal);
        EditText num2 = findViewById(R.id.editTextNumberDecimal2);
        Button btn_sum = findViewById(R.id.button2);
        Button btn_min = findViewById(R.id.button13);
        Button btn_mul = findViewById(R.id.button3);
        Button btn_div = findViewById(R.id.button4);


        btn_sum.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
                   double number1 = Double.parseDouble(num1.getText().toString());
                   double number2 = Double.parseDouble(num2.getText().toString());
                   double sum = number1 + number2;
                   textResult.setText(Double.toString(sum));
         }

       }

        );
        btn_min.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           double number1 = Double.parseDouble(num1.getText().toString());
                                           double number2 = Double.parseDouble(num2.getText().toString());
                                           double min = number1 - number2;
                                           textResult.setText(Double.toString(min));
                                       }

                                   }

        );

        btn_mul.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           double number1 = Double.parseDouble(num1.getText().toString());
                                           double number2 = Double.parseDouble(num2.getText().toString());
                                           double mul = number1 * number2;
                                           textResult.setText(Double.toString(mul));
                                       }

                                   }

        );

        btn_div.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           double number1 = Double.parseDouble(num1.getText().toString());
                                           double number2 = Double.parseDouble(num2.getText().toString());
                                           if (number2==0){
                                               textResult.setText("can not be divide by zero");
                                           }
                                           else{
                                               double div = number1 / number2;
                                               textResult.setText(Double.toString(div));
                                           }


                                       }

                                   }

        );
        Button btn_clear = findViewById(R.id.button16);
        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 num1.setText(" ");
                 num2.setText(" ");
                textResult.setText(" ");
            }
        });

        Button btn_equal = findViewById(R.id.button15);
        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                num1.setText(" ");
//                num2.setText(" ");
//                double number1 = Double.parseDouble(num1.getText().toString());
//                double number2 = Double.parseDouble(num2.getText().toString());
//                double div = number1 / number2;
//                double mul = number1 * number2;
//                double min = number1 - number2;
//                double sum = number1 + number2;
//                textResult.setText(Double.toString(sum));
//                textResult.setText(Double.toString(min));
//                textResult.setText(Double.toString(mul));
//                textResult.setText(Double.toString(div));

            }
        });

    }

}
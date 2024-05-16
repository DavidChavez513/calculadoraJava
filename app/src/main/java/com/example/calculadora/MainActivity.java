package com.example.calculadora;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Button btnSum, btnRes, btnMul, btnDiv, btnDot, btnEqual, btnClear, btnPercent, btnPlusMinus;
    EditText etDisplay;
    TextView tvDisplay;

    boolean clearScreen = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        etDisplay = findViewById(R.id.etNumEdit);
        tvDisplay = findViewById(R.id.lblNumberOper);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnSum = findViewById(R.id.btnSum);
        btnRes = findViewById(R.id.btnResta);
        btnMul = findViewById(R.id.btnMultiply);
        btnDiv = findViewById(R.id.btnDivision);
        btnDot = findViewById(R.id.btnDot);
        btnEqual = findViewById(R.id.btnEqual);
        btnClear = findViewById(R.id.btnClean);
        btnPercent = findViewById(R.id.btnPorcent);
        btnPlusMinus = findViewById(R.id.btnMinusMore);

        if (clearScreen) {
            etDisplay.setText(" ");
            tvDisplay.setText(" ");
        }

        btn0.setOnClickListener(v -> {
            //TODO

            if (clearScreen) {
                etDisplay.setText(" ");
                tvDisplay.setText(" ");
            }

            if (etDisplay.getText().toString().equals(" ")) {
                etDisplay.setText("0");
                clearScreen = false;
            } else {
                etDisplay.setText(String.format("%s0", etDisplay.getText()));
            }
        });

        btn1.setOnClickListener(v -> {

            if (clearScreen) {
                etDisplay.setText(" ");
                tvDisplay.setText(" ");
            }

            if (etDisplay.getText().toString().equals(" ")) {
                etDisplay.setText("1");
                clearScreen = false;
            } else {
                etDisplay.setText(String.format("%s1", etDisplay.getText()));
            }
        });

        btn2.setOnClickListener(v -> {

            if (clearScreen) {
                etDisplay.setText(" ");
                tvDisplay.setText(" ");
            }

            if (etDisplay.getText().toString().equals(" ")) {
                etDisplay.setText("2");
                clearScreen = false;
            } else {
                etDisplay.setText(String.format("%s2", etDisplay.getText()));
            }
        });

        btn3.setOnClickListener(v -> {

            if (clearScreen) {
                etDisplay.setText(" ");
                tvDisplay.setText(" ");
            }

            if (etDisplay.getText().toString().equals(" ")) {
                etDisplay.setText("3");
                clearScreen = false;
            } else {
                etDisplay.setText(String.format("%s3", etDisplay.getText()));
            }
        });

        btn4.setOnClickListener(v -> {

            if (clearScreen) {
                etDisplay.setText(" ");
                tvDisplay.setText(" ");
            }

            if (etDisplay.getText().toString().equals(" ")) {
                etDisplay.setText("4");
                clearScreen = false;
            } else {
                etDisplay.setText(String.format("%s4", etDisplay.getText()));
            }
        });

        btn5.setOnClickListener(v -> {

            if (clearScreen) {
                etDisplay.setText(" ");
                tvDisplay.setText(" ");
            }

            if (etDisplay.getText().toString().equals(" ")) {
                etDisplay.setText("5");
                clearScreen = false;
            } else {
                etDisplay.setText(String.format("%s5", etDisplay.getText()));
            }
        });

        btn6.setOnClickListener(v -> {

            if (clearScreen) {
                etDisplay.setText(" ");
                tvDisplay.setText(" ");
            }

            if (etDisplay.getText().toString().equals(" ")) {
                etDisplay.setText("6");
                clearScreen = false;
            } else {
                etDisplay.setText(String.format("%s6", etDisplay.getText()));
            }
        });

        btn7.setOnClickListener(v -> {

            if (clearScreen) {
                etDisplay.setText(" ");
                tvDisplay.setText(" ");
            }

            if (etDisplay.getText().toString().equals(" ")) {
                etDisplay.setText("7");
                clearScreen = false;
            } else {
                etDisplay.setText(String.format("%s7", etDisplay.getText()));
            }
        });

        btn8.setOnClickListener(v -> {

            if (clearScreen) {
                etDisplay.setText(" ");
                tvDisplay.setText(" ");
            }

            if (etDisplay.getText().toString().equals(" ")) {
                etDisplay.setText("8");
                clearScreen = false;
            } else {
                etDisplay.setText(String.format("%s8", etDisplay.getText()));
            }
        });

        btn9.setOnClickListener(v -> {

            if (clearScreen) {
                etDisplay.setText(" ");
                tvDisplay.setText(" ");
            }

            if (etDisplay.getText().toString().equals(" ")) {
                etDisplay.setText("9");
                clearScreen = false;
            } else {
                etDisplay.setText(String.format("%s9", etDisplay.getText()));
            }
        });

        btnDot.setOnClickListener(v -> {
            if (etDisplay.getText().toString().equals(" ")) {
                etDisplay.setText("0.");
            } else {
                etDisplay.setText(String.format("%s.", etDisplay.getText()));
            }

            clearScreen = false;

        });

        btnSum.setOnClickListener(v -> {
            if (etDisplay.getText().toString().equals(" ")) {
                etDisplay.setText("0+");

            } else {
                etDisplay.setText(String.format("%s+", etDisplay.getText()));
            }
            clearScreen = false;
        });

        btnRes.setOnClickListener(v -> {
            if (etDisplay.getText().toString().equals(" ")) {
                etDisplay.setText("0-");

            } else {
                etDisplay.setText(String.format("%s-", etDisplay.getText()));
            }

            clearScreen = false;

        });

        btnMul.setOnClickListener(v -> {
            if (etDisplay.getText().toString().equals(" ")) {
                etDisplay.setText("0*");

            } else {
                etDisplay.setText(String.format("%s*", etDisplay.getText()));
            }

            clearScreen = false;
        });

        btnDiv.setOnClickListener(v -> {
            if (etDisplay.getText().toString().equals(" ")) {
                etDisplay.setText("0/");

            } else {
                etDisplay.setText(String.format("%s/", etDisplay.getText()));
            }

            clearScreen = false;
        });

        btnPercent.setOnClickListener(v -> {
            String operation = etDisplay.getText().toString();
            tvDisplay.setText(String.format("%s%%", operation));
            double num1 = Double.parseDouble(operation);

            double result = num1 / 100;
            etDisplay.setText(String.valueOf(result));

            clearScreen = true;

        });

        btnPlusMinus.setOnClickListener(v -> {
            if (etDisplay.getText().toString().equals(" ")) {
                etDisplay.setText("0");
            } else {
                etDisplay.setText(String.format("%s", etDisplay.getText()));
            }
        });

        btnClear.setOnClickListener(v -> {
            etDisplay.setText(" ");
            tvDisplay.setText(" ");
        });

        btnEqual.setOnClickListener(v -> {
            String operation = etDisplay.getText().toString();
            tvDisplay.setText(operation);
            String[] parts = operation.split("[+\\-*/]");
            double num1 = Double.parseDouble(parts[0]);
            double num2 = Double.parseDouble(parts[1]);
            double result = 0;
            if (operation.contains("+")) {
                result = num1 + num2;
            } else if (operation.contains("-")) {
                result = num1 - num2;
            } else if (operation.contains("*")) {
                result = num1 * num2;
            } else if (operation.contains("/")) {
                result = num1 / num2;
            }
            etDisplay.setText(String.valueOf(result));
            clearScreen = true;
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
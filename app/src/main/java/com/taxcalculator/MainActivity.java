package com.taxcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import javax.xml.validation.Validator;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText etsalary;
    private Button btncalculate;
    private TextView tvOutput;

    double salary, res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etsalary = findViewById(R.id.etsalary);
        btncalculate = findViewById(R.id.btncalculate);
        tvOutput = findViewById(R.id.tvOutput);

        btncalculate.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v.getId()== R.id.btncalculate){
            if(Validation()){
                salary = Double.parseDouble(etsalary.getText().toString());
                Taxcalculator obj = new Taxcalculator();
                obj.setSalary(salary);
                res = obj.Taxcal();
                tvOutput.setText("Your Tax is " + Double.toString(res));

            }
        }
    }

    public boolean Validation(){
        boolean flag =true;
        if (TextUtils.isEmpty(etsalary.getText().toString())) {
            etsalary.setError("Please enter Salary");
            etsalary.requestFocus();
            flag = false;
        }
        return flag;

    }
}




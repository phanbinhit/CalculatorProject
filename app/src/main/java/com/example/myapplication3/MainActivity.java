package com.example.myapplication3.;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edtNumber;
    private TextView tvResult;

    private Button btnNumber0;
    private Button btnNumber1;
    private Button btnNumber2;
    private Button btnNumber3;
    private Button btnNumber4;
    private Button btnNumber5;
    private Button btnNumber6;
    private Button btnNumber7;
    private Button btnNumber8;
    private Button btnNumber9;

    private Button btnAdd;
    private Button btnSub;
    private Button btnMul;
    private Button btnDiv;
    private Button btnComma;

    private Button btnClearAll;
    private Button btnClear;
    private Button btnResult;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidget();
    }
    public void initWidget()
    {
        edtNumber =(EditText) findViewById(R.id.edit_input);
        tvResult = (TextView) findViewById(R.id.tv_result);
        btnNumber0=(Button)findViewById(R.id.btn_number0);
        btnNumber1=(Button)findViewById(R.id.btn_number1);
        btnNumber2=(Button)findViewById(R.id.btn_number2);
        btnNumber3=(Button)findViewById(R.id.btn_number3);
        btnNumber4=(Button)findViewById(R.id.btn_number4);
        btnNumber5=(Button)findViewById(R.id.btn_number5);
        btnNumber6=(Button)findViewById(R.id.btn_number6);
        btnNumber7=(Button)findViewById(R.id.btn_number7);
        btnNumber8=(Button)findViewById(R.id.btn_number8);
        btnNumber9=(Button)findViewById(R.id.btn_number9);

        btnAdd=(Button)findViewById(R.id.btn_add);
        btnSub=(Button)findViewById(R.id.btn_sub);
        btnMul=(Button)findViewById(R.id.btn_mul);
        btnDiv=(Button)findViewById(R.id.btn_div);
        btnComma=(Button)findViewById(R.id.btn_comma);

        btnClearAll=(Button)findViewById(R.id.btn_clearall);
        btnClear=(Button)findViewById(R.id.btn_clear);
        btnResult=(Button)findViewById(R.id.btn_result);
    }
    public void setEventClickView()
    {
        btnNumber0.setOnClickListener(this);
        btnNumber1.setOnClickListener(this);
        btnNumber2.setOnClickListener(this);
        btnNumber3.setOnClickListener(this);
        btnNumber4.setOnClickListener(this);
        btnNumber5.setOnClickListener(this);
        btnNumber6.setOnClickListener(this);
        btnNumber7.setOnClickListener(this);
        btnNumber8.setOnClickListener(this);
        btnNumber9.setOnClickListener(this);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnComma.setOnClickListener(this);

        btnClearAll.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnResult.setOnClickListener(this);


    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn_number0 :
                edtNumber.append("0");
                break;
            case R.id.btn_number1 :
                edtNumber.append("1");
                break;
            case R.id.btn_number2 :
                edtNumber.append("2");
                break;
            case R.id.btn_number3 :
                edtNumber.append("3");
                break;
            case R.id.btn_number4 :
                edtNumber.append("4");
                break;
            case R.id.btn_number5 :
                edtNumber.append("5");
                break;
            case R.id.btn_number6 :
                edtNumber.append("6");
                break;
            case R.id.btn_number7 :
                edtNumber.append("7");
                break;
            case R.id.btn_number8 :
                edtNumber.append("8");
                break;
            case R.id.btn_number9 :
                edtNumber.append("9");
                break;
            case R.id.btn_add :
                edtNumber.append("+");
                break;
            case R.id.btn_sub :
                edtNumber.append("-");
                break;
            case R.id.btn_mul :
                edtNumber.append("*");
                break;
            case R.id.btn_div :
                edtNumber.append("/");
                break;
            case R.id.btn_comma :
                edtNumber.append(",");
                break;
            case R.id.btn_clearall :
                edtNumber.setText("");
                break;
            case R.id.btn_clear:

                break;
            case R.id.btn_result :

                break;





        }

    }
}


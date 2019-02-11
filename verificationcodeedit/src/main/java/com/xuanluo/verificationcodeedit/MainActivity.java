package com.xuanluo.verificationcodeedit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editCode;
    private Button btnShow;
    private TextView tvShow;
    private TextView tvCode1,tvCode2,tvCode3,tvCode4,tvCode5,tvCode6;

    private VerificationCodeEditText verificationCodeEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        initClick();

    }

    private void initView(){
        editCode = findViewById(R.id.v_main_edit_code);
        btnShow = findViewById(R.id.v_main_btn_show);
        tvShow = findViewById(R.id.v_main_tv_show);


        tvCode1 = findViewById(R.id.v_main_tv_code1);
        tvCode2 = findViewById(R.id.v_main_tv_code2);
        tvCode3 = findViewById(R.id.v_main_tv_code3);
        tvCode4 = findViewById(R.id.v_main_tv_code4);
        tvCode5 = findViewById(R.id.v_main_tv_code5);
        tvCode6 = findViewById(R.id.v_main_tv_code6);

        verificationCodeEditText = findViewById(R.id.v_main_VerificationCodeEditText);

        verificationCodeEditText.setOnInputListener(new VerificationCodeEditText.OnInputListener() {
            @Override
            public void OnEdittextChange(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void OnInputOk(String codeNum) {

                Log.e("----","输入完成");
            }
        });

    }

    private void initData(){

    }

    private void initClick(){

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                verificationCodeEditText.getCode();
                Log.e("----",verificationCodeEditText.getCode());
            }
        });



    }


}

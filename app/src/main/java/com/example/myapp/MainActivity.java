package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onBtnClick(View view){
        TextView txtV1 = findViewById(R.id.textView);
        TextView txtV2 = findViewById(R.id.textView2);
        TextView txtV3 = findViewById(R.id.textView3);

        EditText edt1 = findViewById(R.id.edtName);
        EditText edt2 = findViewById(R.id.edtSurname);
        EditText edt3 = findViewById(R.id.edtMail);

        txtV1.setText(edt1.getText().toString());
        txtV2.setText(edt2.getText().toString());
        txtV3.setText(edt3.getText().toString());
    }
}
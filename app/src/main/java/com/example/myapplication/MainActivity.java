package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        et = findViewById(R.id.editText);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "입력된 값이 없습니다.";
                if(et.getText().toString() != null){
                    msg = et.getText().toString();
                }

                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("message", msg);
                startActivity(intent);
            }
        });

    }
}
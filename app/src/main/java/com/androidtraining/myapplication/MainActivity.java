package com.androidtraining.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etUserName;

    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUserName = findViewById(R.id.et_username);
        submitButton = findViewById(R.id.submit_btn);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=etUserName.getText().toString();
//                Toast.makeText(MainActivity.this, "Name is "+name, Toast.LENGTH_LONG).show();
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("name_key",name);
                startActivity(intent);
            }
        });
    }
}
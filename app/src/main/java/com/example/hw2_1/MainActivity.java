package com.example.hw2_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

        init();
    }

    private void init() {
        Button buttonOk = findViewById(R.id.buttonOk);
        final Button buttonClear = findViewById(R.id.buttonClear);
        final EditText vName = findViewById(R.id.vName);
        final EditText vEmail = findViewById(R.id.vEmail);
        final TextView outputText = findViewById(R.id.outputText);

        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = vName.getText().toString();
                String email = vEmail.getText().toString();
                outputText.setText(getString(R.string.outputTxt, name, email));
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vName.getText().clear();
                vEmail.getText().clear();
                outputText.setText("");
            }
        });
    }

}
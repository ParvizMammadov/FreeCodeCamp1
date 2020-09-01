package com.example.freecodecamp1;

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

    }

    public void onBtnClick(View view) {
        TextView txtHelloWorld = findViewById(R.id.txtHelloWorld);
        EditText edtTxtName = findViewById(R.id.edtTxtName);

        String name = edtTxtName.getText().toString();
        txtHelloWorld.setText("Hello " + name);
    }
}
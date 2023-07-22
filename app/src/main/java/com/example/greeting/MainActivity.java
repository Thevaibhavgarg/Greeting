package com.example.greeting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name;
    // Button button;
    public static final String Transfer = "to_show";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //button.setOnClickListener(v->open());
    }
    public void open(View v){
        Intent intent = new Intent(this,MainActivity2.class);
        name = findViewById(R.id.name);
        String Text = name.getText().toString();
        intent.putExtra(Transfer,Text);
        startActivity(intent);
    }
}
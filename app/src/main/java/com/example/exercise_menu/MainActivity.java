package com.example.exercise_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button signIn;
    EditText Username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signIn = findViewById(R.id.button);
        Username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Username.getText().toString().equals("admin") && password.getText().toString().equals("123")){
                    Intent intent = new Intent(MainActivity.this, page_2.class) ;
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(),"Password Salah",
                            Toast.LENGTH_LONG).show();

                }
            }
        });

//
    }
}

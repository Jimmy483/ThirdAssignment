package com.example.thirdassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
private EditText username,password;
private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=findViewById(R.id.user);
        password=findViewById(R.id.pass);
        btnLogin=findViewById(R.id.btnLog);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
                {
                    Intent intent=new Intent(MainActivity.this,Dashboard.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Username or Password is wrong",Toast.LENGTH_LONG).show();
                    username.setText("");
                    username.requestFocus();

                }
            }
        });
    }
}

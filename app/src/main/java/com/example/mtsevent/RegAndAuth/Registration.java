package com.example.mtsevent.RegAndAuth;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.mtsevent.R;

public class Registration extends AppCompatActivity {

    private String name;
    private String password;

    private EditText editTextEmail, editTextPassword;
    private Button buttonEnter, buttonReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonEnter = findViewById(R.id.buttonEnter);
        buttonReg = findViewById(R.id.buttonReg);

        buttonEnter.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v) {


                /*try(Socket socket = new Socket()){
                    socket.connect(new InetSocketAddress("localhost",8080),2000);
                } catch (IOException e) {
                    e.printStackTrace();
                }*/
            }
        });

        buttonReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Registration.this, Registration.class);
                startActivity(intent);
            }
        });
    }


}

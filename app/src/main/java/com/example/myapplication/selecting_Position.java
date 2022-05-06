package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class selecting_Position extends AppCompatActivity {
    private Button btnsigninAgen, btnSignSupervr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecting_position);

        btnsigninAgen = (Button) findViewById(R.id.btnAgetnClicked);
        btnSignSupervr = (Button) findViewById(R.id.btnSupervrclicked);

        btnsigninAgen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                agentOpen();
            }
            public   void  agentOpen(){
                Intent nte = new Intent(getApplicationContext(), login_agent.class);
                startActivity(nte);

            }
        });

        btnSignSupervr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                superViourOpen();
            }
            public void superViourOpen(){

                Intent s = new Intent(getApplicationContext(),LoginSupervisor.class);
                startActivity(s);
            }
        });
    }
}
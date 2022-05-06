package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Locale;

public class AgentRegstration extends AppCompatActivity {
    private EditText etdFname, etdLname, etdEmail, etdPhone, etdPassword;
   private Button btnRegister;
   DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agent_regstration);
        etdFname = findViewById(R.id.etfName);
        etdLname = findViewById(R.id.Lname);
        etdEmail = findViewById(R.id.etEmail);
        etdPhone = findViewById(R.id.etPhone);
        etdPassword = findViewById(R.id.password1);
        btnRegister = (Button) findViewById(R.id.register);
       databaseReference = FirebaseDatabase.getInstance().getReference().child("registered_agent");
        
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registAgent();
            }
        });

  
            }
   private void registAgent(){

        String firstname = etdFname.getText().toString().trim().toUpperCase(Locale.ROOT);
        String lastname = etdLname.getText().toString().trim();
        String email = etdEmail.getText().toString().trim();
        String phone_number = etdPhone.getText().toString().trim();
        String password = etdPassword.getText().toString().trim();

Registered_Agent registered_agent = new Registered_Agent(firstname,lastname,email,phone_number,password);
databaseReference.push().setValue(registered_agent).addOnCompleteListener(new OnCompleteListener<Void>() {
    @Override
    public void onComplete(@NonNull Task<Void> task) {

        if (task.isSuccessful()){
            Toast.makeText(getApplicationContext(), "agent added", Toast.LENGTH_SHORT).show();
        finishAfterTransition();
        }

    }

});



    }
    }


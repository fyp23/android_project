package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class agent_dashbord extends AppCompatActivity {
private CardView cardCensusForm, cardLongForm,adminSettings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agent_dashbord);

        cardCensusForm = (CardView) findViewById(R.id.cardCensusForm);
        cardLongForm = (CardView) findViewById(R.id.cardrentalHouse);
        adminSettings = (CardView) findViewById(R.id.AdmnSettin);

        cardCensusForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openForm();
            }
            public void openForm(){
                Intent f =new Intent(getApplicationContext(),Agent_Option.class);
                startActivity(f);
            }
        });

adminSettings.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        setting();
    }
    private void setting(){
        Toast.makeText(agent_dashbord.this, "soon will be updated", Toast.LENGTH_SHORT).show();
    }
});
    }
}
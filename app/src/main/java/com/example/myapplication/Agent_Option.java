package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Agent_Option extends AppCompatActivity {
    CardView cardnormal, cardRenta, cardvend, cardSpecl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agent_option);

        cardnormal = findViewById(R.id.cardNormal);
        cardRenta = findViewById(R.id.cardrentalHouse);
        cardvend = findViewById(R.id.cardVender);
        cardSpecl = findViewById(R.id.cardspecl);


        cardnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                normalHouse();
            }

            private void normalHouse() {
                Intent intent = new Intent(getApplicationContext(), normal_house.class);
                startActivity(intent);

            }
        });

        cardRenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rentalHouse();
            }

            private  void rentalHouse(){
                Intent inten = new Intent(getApplicationContext(), LongForm_census.class);
                startActivity(inten);

            }
       });

       cardvend.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View view) {
               vendaHouse();
            }
           private void vendaHouse(){

               Toast.makeText(Agent_Option.this, "Soon Will be Updated..!", Toast.LENGTH_SHORT).show();     }
        });
        cardSpecl.setOnClickListener(new View.OnClickListener() {
        @Override
           public void onClick(View view) {
                special();
         }
          private void special(){

              Toast.makeText(Agent_Option.this, "Soon Will be updated stay tuned..!", Toast.LENGTH_SHORT).show();
           }
       });
    }



}

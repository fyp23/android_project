package com.example.myapplication;
        import android.content.Intent;
        import android.os.Bundle;
        import android.text.TextUtils;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;


        import androidx.appcompat.app.AppCompatActivity;

public class login_agent extends AppCompatActivity {


    Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_agent);
        button5 = (Button) findViewById(R.id.bntAentLOgin);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openAgentDashboard();

            }

            public void openAgentDashboard(){


                Intent intent= new Intent(getApplicationContext(), agent_dashbord.class);
                startActivity(intent);


            }
        });

    }
}
package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class LoginSupervisor extends AppCompatActivity {
    EditText etName, etPassword;
    Button button;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        progressBar = findViewById(R.id.progressBar);
        etName = findViewById(R.id.etUserName);
        etPassword = findViewById(R.id.etUserPassword);
        button= (Button) findViewById(R.id.loginButn);



        //calling the method userLogin() for login the user
      button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userLogin();
            }
        });


    }

    private void userLogin() {
        //first getting the values
        final String username = etName.getText().toString();
        final String password = etPassword.getText().toString();
        //validating inputs
        if (TextUtils.isEmpty(username)) {
            etName.setError("Please enter your username");
            etName.requestFocus();
            return;
        }

        if (TextUtils.isEmpty(password)) {
            etPassword.setError("Please enter your password");
            etPassword.requestFocus();
            return;
        }

//        //if everything is fine
//        StringRequest stringRequest = new StringRequest(Request.Method.POST, URLs.URL_LOGIN,
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//                        progressBar.setVisibility(View.GONE);
//
//                        try {
//                            //converting response to json object
//                            JSONObject obj = new JSONObject(response);
//
//                            //if no error in response
//                            if (!obj.getBoolean("error")) {
//                                Toast.makeText(getApplicationContext(), obj.getString("message"), Toast.LENGTH_SHORT).show();
//
//                                //getting the user from the response
//                                JSONObject userJson = obj.getJSONObject("user");
//
//                                //creating a new user object
//                                User user = new User(
//                                        userJson.getInt("id"),
//                                        userJson.getString("firstname"),
//                                        userJson.getString("lastname"),
//                                        userJson.getString("email"),
//                                        userJson.getString("phonenumber"),
//                                        userJson.getString("password")
//                                );
//
//                                //storing the user in shared preferences
//
//                                //starting the profile activity
//                                Intent intent=new Intent(getApplicationContext(), Admin_panel.class);
//                            } else {
//                                Toast.makeText(getApplicationContext(), obj.getString("message"), Toast.LENGTH_SHORT).show();
//                            }
//                        } catch (JSONException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                },
//                new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_SHORT).show();
//
//                    }
//                })
//        {
//            @Override
//            protected Map<String, String> getParams() throws AuthFailureError {
//                Map<String, String> params = new HashMap<>();
//                params.put("username", username);
//                params.put("password", password);
//                return params;
//            }
//        };
//
//        RequestQueue requestQueue = Volley.newRequestQueue(this);
//        requestQueue.add(stringRequest);
        Intent intent= new Intent(LoginSupervisor.this, Admin_panel.class);
        startActivity(intent);

    }
}
package com.example.fastsecuirty;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class signuppage extends AppCompatActivity {
    EditText usernameid,passwordid;
    Button loginbutton,signupbutton;
    String name,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signuppage);
        usernameid=findViewById(R.id.edittextusernameid);
        passwordid=findViewById(R.id.edittextpasswordbuttonid);
        loginbutton=findViewById(R.id.loginbuttonid);
        signupbutton=findViewById(R.id.signupbuttonid);


        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name=usernameid.getText().toString().trim();
                password=passwordid.getText().toString().trim();
                if(name.isEmpty())
                {
                    usernameid.setError("Enter user name");
                }
                else if(password.isEmpty())
                {
                    passwordid.setError("Enter Password");
                }
                else {

                    Intent intent = new Intent(signuppage.this, profilepage.class);
                    startActivity(intent);
                }


            }
        });

        signupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(signuppage.this,Createaccountpage.class);
                startActivity(intent);
            }
        });
    }
}

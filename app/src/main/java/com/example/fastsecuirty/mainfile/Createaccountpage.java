package com.example.fastsecuirty.mainfile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;

import com.example.fastsecuirty.R;

public class Createaccountpage extends AppCompatActivity {
    CheckBox checkbox;
    Button signup;
    ImageButton camera;
  

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createaccountpage);
        camera = findViewById(R.id.camerabuttonid);
        checkbox = findViewById(R.id.checkboxid);
        signup = findViewById(R.id.signupbuttonid);
        getSupportActionBar().setTitle("Sign Up Page");
        checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true) {
                    signup.setVisibility(View.VISIBLE);
                } else {
                    signup.setVisibility(View.GONE);
                }

            }
        });


        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 0);
            }
        });


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Createaccountpage.this, profilepage.class);
                startActivity(intent);
            }
        });
    }
}
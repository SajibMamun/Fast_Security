package com.example.fastsecuirty.mainfile;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.fastsecuirty.R;
import com.example.fastsecuirty.fragement.Homefragment;
import com.example.fastsecuirty.fragement.nextfragment;
import com.example.fastsecuirty.fragement.permissionfragment;
import com.example.fastsecuirty.fragement.settingsfragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class profilepage extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilepage);
        init();
        implementbuttonnevabr();
        getSupportActionBar().setTitle("Profile Page");
        replacefragment(new Homefragment());

    }

    private void implementbuttonnevabr() {
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull  MenuItem item) {
                switch(item.getItemId())
                {
                    case R.id.homeid:
                    {
                        replacefragment(new Homefragment());
                        return true;
                    }
                    case R.id.permissionid:
                    {
                        replacefragment(new permissionfragment());
                        return true;
                    }
                    case R.id.settingsid:
                    {
                       replacefragment(new settingsfragment());
                        return true;

                    }
                    case R.id.nextpageid:
                        replacefragment(new nextfragment());
                        return true;
                }
                return false;
            }
        });
    }

    private void replacefragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.framelayoutid,fragment).commit();

    }

    private void  init()
    {
        bottomNavigationView=findViewById(R.id.buttomnevbarid);

    }

    @Override
    public void onBackPressed() {
        if (bottomNavigationView.getSelectedItemId() == R.id.permissionid || bottomNavigationView.getSelectedItemId() == R.id.settingsid || bottomNavigationView.getSelectedItemId() == R.id.nextpageid) {
            replacefragment(new Homefragment());
            bottomNavigationView.setSelectedItemId(R.id.homeid);
        } else {
            super.onBackPressed();
        }
    }}
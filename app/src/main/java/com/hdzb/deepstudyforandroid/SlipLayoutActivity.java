package com.hdzb.deepstudyforandroid;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.Toolbar;

public class SlipLayoutActivity extends AppCompatActivity implements View.OnClickListener {

    NavigationView nv;
    DrawerLayout dw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slip_layout);

        Button button = findViewById(R.id.bt_click_show);
        button.setOnClickListener(this);

        dw = findViewById(R.id.dl_test_2);
        nv = findViewById(R.id.nv_test);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Toast.makeText(getApplication(), "show click", Toast.LENGTH_SHORT).show();
                dw.closeDrawers();
                return true;
            }
        });
    }

    boolean b = false;

    @Override
    public void onClick(View v) {
        dw.openDrawer(GravityCompat.START);
    }
}

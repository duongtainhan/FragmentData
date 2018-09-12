package com.example.duongtainhan555.fragmentdata;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements ActionPoint {

    TextView txtPoint;
    String action;
    int point;
    FragmentPlus fragmentPlus;
    FragmentMinus fragmentMinus;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Init
        Init();
        //Manager Fragment
        ManagerFragment();
        //Event
    }
    private void Init()
    {
        txtPoint = findViewById(R.id.txtPoint);

    }
    private void ManagerFragment()
    {
        fragmentManager = getSupportFragmentManager();
        fragmentPlus = (FragmentPlus) fragmentManager.findFragmentById(R.id.fragmentPlus);
        fragmentMinus = (FragmentMinus) fragmentManager.findFragmentById(R.id.fragmentMinus);
    }

    @Override
    public void SendAction(String action) {
        point = Integer.parseInt(txtPoint.getText().toString());
        this.action = action;
        if(action.equals("plus"))
        {
            point++;

        }
        else
            if(action.equals("minus"))
            {
                point--;
            }
            txtPoint.setText(String.valueOf(point));
    }
}


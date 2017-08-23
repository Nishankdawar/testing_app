package com.ultron.testing_app;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    TextView addMed , editDose;
    FloatingActionButton fab;
    boolean optionVisibility = false;

    public void toggleOptionVisibility(View v)
    {
        optionVisibility = !optionVisibility;

        if( optionVisibility )
        {
            addMed.setVisibility(View.VISIBLE);
            editDose.setVisibility(View.VISIBLE);
        }
        else
        {
            addMed.setVisibility(View.GONE);
            editDose.setVisibility(View.GONE);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        fab = (FloatingActionButton) findViewById(R.id.float_button);
        addMed = (TextView) findViewById(R.id.addMedicine);
        editDose = (TextView) findViewById(R.id.editDosage);

    }
}

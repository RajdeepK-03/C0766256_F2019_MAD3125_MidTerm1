package com.example.c0766256_f2019_mad3125_midterm;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class TaxDetailsActivity extends AppCompatActivity {

    private TextView calFullName;
    private TextView calSIN;
    private TextView calAge;
    private TextView calGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tax_details);


        calFullName = findViewById(R.id.txtFullName);
        calSIN =findViewById(R.id.edSinNumber1);
        calAge = findViewById(R.id.txtAgeCal);
        calGender = findViewById(R.id.RadioGender);

        backButton();

        Intent intent = getIntent();
        CRACustomer calCRA = intent.getParcelableExtra("CRACustomer");


        calSIN.setText("SIN: " + calCRA.getSinNumber());
        calFullName.setText("FullName: " + calCRA.getFullName());
        calAge.setText("Age: " + calCRA.getAge());
        calGender.setText("Gender: " + calCRA.getGender());
    }


    public void backButton()
    {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}


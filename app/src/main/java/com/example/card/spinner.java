package com.example.card;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class spinner extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
    spinner1=findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> o=ArrayAdapter.createFromResource(this,R.array.semesters,android.R.layout.simple_spinner_item);
        o.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(o);
        spinner1.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent;


        switch (i)
        { case 1:

           intent= new Intent(spinner.this,MainActivity.class);
            startActivity(intent);
            break;
            case 2:

                intent= new Intent(spinner.this,semester2.class);
                startActivity(intent);

                break;
            case 3:

                intent= new Intent(spinner.this,semester3.class);
                startActivity(intent);

                break;
            case 4:
                intent= new Intent(spinner.this,semester4.class);
                startActivity(intent);
                break;
            case 5:

                intent= new Intent(spinner.this,semester5.class);
                startActivity(intent);

                break;
            case 6:

                intent= new Intent(spinner.this,semester6.class);
                startActivity(intent);
                break;
            case 7:

                intent= new Intent(spinner.this,semester7.class);
                startActivity(intent);
            break;
            case 8:
                intent= new Intent(spinner.this,semester8.class);
                startActivity(intent);
                break;

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
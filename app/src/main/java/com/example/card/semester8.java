package com.example.card;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class semester8 extends AppCompatActivity {

    int s1,s2,s3;
    RadioGroup rg1,rg2,rg3;
    int o,A_plus,A,B,B_plus,RA;
    Button button1;

    int sub1,sub2,sub3;

    double gpa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester8);
        rg1=findViewById(R.id.radio1);
        rg2=findViewById(R.id.radio2);
        rg3=findViewById(R.id.radio3);

        button1=findViewById(R.id.bt1);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                o=10;A=8;A_plus=9;B=6;B_plus=7;RA=0;
                if (rg1.isEnabled())
                {sub1=3;

                    switch (rg1.getCheckedRadioButtonId())
                    {
                        case R.id.radioButton8:
                            s1=sub1*A;

                            break;
                        case R.id.radioButton9:
                            s1=sub1*A_plus;

                            break;
                        case R.id.radioButton10:
                            s1=sub1*B;

                            break;
                        case R.id.radioButton11:
                            s1=sub1*B_plus;

                            break;
                        case R.id.radioButton12:
                            s1=sub1*o;

                            break;
                        case R.id.radioButton13:
                            s1=sub1*RA;

                            break;


                    }
                }
                if (rg2.isEnabled())
                {
                    sub2=3;
                    switch (rg2.getCheckedRadioButtonId())
                    {
                        case R.id.radioButton14:
                            s2=sub2*A;
                            break;
                        case R.id.radioButton15:
                            s2=sub2*A_plus;
                            break;
                        case R.id.radioButton16:
                            s2=sub2*B;
                            break;
                        case R.id.radioButton17:
                            s2=sub2*B_plus;
                            break;
                        case R.id.radioButton18:
                            s2=sub2*o;
                            break;
                        case R.id.radioButton19:
                            s2=sub2*RA;
                            break;


                    }
                }
                if (rg3.isEnabled())
                {sub3=10;

                    switch (rg3.getCheckedRadioButtonId())
                    {
                        case R.id.radioButton20:
                            s3=sub3*A;
                            break;
                        case R.id.radioButton21:
                            s3=sub3*A_plus;
                            break;
                        case R.id.radioButton22:
                            s3=sub3*B;
                            break;
                        case R.id.radioButton23:
                            s3=sub3*B_plus;
                            break;
                        case R.id.radioButton24:
                            s3=sub3*o;
                            break;
                        case R.id.radioButton25:
                            s3=sub3*RA;
                            break;


                    }
                }

                calci3.calci(s1,s2,s3,getApplicationContext());

            }
        });


    }
}
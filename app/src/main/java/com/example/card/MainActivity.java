package com.example.card;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int s1,s2,s3,s4,s5,s6,s7,s8;
    RadioGroup rg1,rg2,rg3,rg4,rg5,rg6,rg7,rg8;
    int o,A_plus,A,B,B_plus,RA;
    Button button1;

    int sub1,sub2,sub3,sub4,sub5,sub6,sub7,sub8;

     double gpa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    rg1=findViewById(R.id.radio1);
         rg2=findViewById(R.id.radio2);
         rg3=findViewById(R.id.radio3);
        rg4=findViewById(R.id.radio4);
         rg5=findViewById(R.id.radio5);
        rg6=findViewById(R.id.radio6);
         rg7=findViewById(R.id.radio7);
         rg8=findViewById(R.id.radio8);
         button1=findViewById(R.id.bt1);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                o=10;A=8;A_plus=9;B=6;B_plus=7;RA=0;
                       if (rg1.isEnabled())
        {sub1=4;

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
sub2=4;
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
        {sub3=3;

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
        if (rg4.isEnabled())
        {sub4=3;

            switch (rg4.getCheckedRadioButtonId())
            {
                case R.id.radioButton26:
                    s4=sub4*A;
                    break;
                case R.id.radioButton27:
                    s4=sub4*A_plus;
                    break;
                case R.id.radioButton28:
                    s4=sub4*B;
                    break;
                case R.id.radioButton29:
                    s4=sub4*B_plus;
                    break;
                case R.id.radioButton30:
                    s4=sub4*o;
                    break;
                case R.id.radioButton31:
                    s4=sub4*RA;
                    break;


            }
        }
        if (rg5.isEnabled())
        {sub5=3;

            switch (rg5.getCheckedRadioButtonId())
            {
                case R.id.radioButton32:
                    s5=sub5*A;
                    break;
                case R.id.radioButton33:
                    s5=sub5*A_plus;
                    break;
                case R.id.radioButton34:
                    s5=sub5*B;
                    break;
                case R.id.radioButton35:
                    s5=sub5*B_plus;
                    break;
                case R.id.radioButton36:
                    s5=sub5*o;
                    break;
                case R.id.radioButton37:
                    s5=sub5*RA;
                    break;


            }
        }
        if (rg6.isEnabled())
        {sub6=4;

            switch (rg6.getCheckedRadioButtonId())
            {
                case R.id.radioButton38:
                    s6=sub6*A;
                    break;
                case R.id.radioButton39:
                    s6=sub6*A_plus;
                    break;
                case R.id.radioButton40:
                    s6=sub6*B;
                    break;
                case R.id.radioButton41:
                    s6=sub6*B_plus;
                    break;
                case R.id.radioButton42:
                    s6=sub6*o;
                    break;
                case R.id.radioButton43:
                    s6=sub6*RA;
                    break;


            }
        }
        if (rg7.isEnabled())
        {sub7=2;

            switch (rg7.getCheckedRadioButtonId())
            {
                case R.id.radioButton44:
                    s7=sub7*A;
                    break;
                case R.id.radioButton45:
                    s7=sub7*A_plus;
                    break;
                case R.id.radioButton46:
                    s7=sub7*B;
                    break;
                case R.id.radioButton47:
                    s7=sub7*B_plus;
                    break;
                case R.id.radioButton48:
                    s7=sub7*o;
                    break;
                case R.id.radioButton49:
                    s7=sub7*RA;
                    break;

            }
        }
        if (rg8.isEnabled())
        {sub8=2;

            switch (rg8.getCheckedRadioButtonId())
            {
                case R.id.radioButton50:
                    s8=sub8*A;
                    break;
                case R.id.radioButton51:
                    s8=sub8*A_plus;
                    break;
                case R.id.radioButton52:
                    s8=sub8*B;
                    break;
                case R.id.radioButton53:
                    s8=sub8*B_plus;
                    break;
                case R.id.radioButton54:
                    s8=sub8*o;
                    break;
                case R.id.radioButton55:
                    s8=sub8*RA;
                    break;


            }
        }
        calculation.calci(s1,s2,s3,s4,s5,s6,s7,s8,getApplicationContext());


            }
        });



    }


}
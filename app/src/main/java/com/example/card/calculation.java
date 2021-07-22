package com.example.card;

import android.content.Context;
import android.widget.Toast;

import androidx.fragment.app.FragmentManager;

public class calculation {
  static   int answer=0;
    public static void calci(int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, Context context)
    { answer=s1+s2+s3+s4+s5+s6+s7+s8;
        Toast.makeText(context,String.valueOf((double)answer/25),Toast.LENGTH_LONG).show();

    }



}

package com.example.card;

import android.content.Context;
import android.widget.Toast;

public class sem8calci {
    static   int answer=0;
    public static void calci(int s1, int s2, int s3,Context context)
    { answer=s1+s2+s3;
        Toast.makeText(context,String.valueOf((double)answer/16),Toast.LENGTH_LONG).show();

    }
}

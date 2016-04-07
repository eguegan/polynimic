package com.example.admin.polynomials;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        * .
        * .
        * .
        * After Parsing is done.
        * */

        Object[][] poly1 = new Object[][]{ {4, "x", 4}, {-16, "x", 3},{0, "x", 2}, {12, "x", 1}, {-4, "", 1} };
        Object[][] poly2 = new Object[][]{ {2, "x", 3}, {6, "x", 2}, {-9, "x", 1}, {3, "", 1} };
        String result = "";

        for(Object[] x : poly1){
            int sum = 0;
            boolean wasequal = false;
            for(int i = 0; i < poly2.length; i++){
                if(poly2[i][1].equals(x[1]) && poly2[i][2].equals(x[2])){
                    sum += (Integer)x[0] + (Integer)poly2[i][0];
                    wasequal = true;
                }
            }
            if(!wasequal)
                sum = (Integer)x[0];

            String resultStr = (sum > 0) ? "+" : "";
            String exp = ((Integer)x[2] > 1) ? "^" : "";
            String expStr = ((Integer)x[2] > 1) ?  Integer.toString((Integer)x[2]) : "";
            String sumStr = (sum == 0) ? "" : Integer.toString(sum);
            result +=  resultStr + sumStr + x[1] + exp + expStr;
        }

        Log.d("TAG", "onCreate: " + result);
    }
}

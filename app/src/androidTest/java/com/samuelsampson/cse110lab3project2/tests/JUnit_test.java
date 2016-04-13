package com.samuelsampson.cse110lab3project2.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.samuelsampson.cse110lab3project2.MainActivity;
import com.samuelsampson.cse110lab3project2.R;

/**
 * Created by Sam on 4/13/16.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mainActivity;
    public JUnit_test() {
        super(MainActivity.class);
    }

    public void test_sum() {
        mainActivity = getActivity();
        TextView textView = (TextView)mainActivity.findViewById(R.id.sum);
        int n1 = 5, n2 = 7;
        int n3 = n1 - n2;
        int sum = mainActivity.sum(n1,n2);

//        String sum = textView.getText().toString();
//        int foundSum = Integer.parseInt(sum);
        assertEquals(n3,sum);
    }
}

package com.example.b1vo.lab3exercise;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;

/**
 * Created by b1vo on 4/19/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mainActivity;
    public JUnit_test() {

        super(MainActivity.class);
    }

    public void test_first() {

        mainActivity = getActivity();
        EditText editText1 = (EditText) mainActivity.findViewById(R.id.editText);
        EditText editText2 = (EditText) mainActivity.findViewById(R.id.editText2);
        int num1 = Integer.parseInt(editText1.getText().toString());
        int num2 = Integer.parseInt(editText2.getText().toString());

        int finalNum = mainActivity.sum(num1, num2);
        assertEquals(15, finalNum);
    }
}

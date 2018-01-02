package com.nidhi.myapplicationtest;

import android.support.test.rule.ActivityTestRule;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;

import static org.junit.Assert.*;

/**
 * Created by nidhi on 1/1/2018.
 */
public class MainActivityTest {

    @Rule
    //We are launching the activity here using ActivityTestRule
    ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    public MainActivity mActivity = null;


    @Before
    public void setUp() throws Exception {
        mActivity = mActivityTestRule.getActivity();// mactivityTestRule gives the context
    }

    public void TestLaunch(){
        View view = mActivity.findViewById(R.id.textviewid);
        assertNotNull(view);
    }

    @After
    public void tearDown() throws Exception {
        mActivity = null;
    }

}
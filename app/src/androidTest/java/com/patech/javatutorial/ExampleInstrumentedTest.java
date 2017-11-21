package com.patech.javatutorial;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.patech.javatutorial", appContext.getPackageName());
    }
    @Test
    public void getAssetsFileList() {
        List<String> listOfFile = Collections.EMPTY_LIST;

//        try {
//            listOfFile = getAssets().list("java/tutorial");
//        } catch (IOException ioe) {
//
//        }
    }
}

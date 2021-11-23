package com.ptshell.testandroid;

import android.content.Context;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Instrumented AsyncTaskTest, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedAsyncTaskTest {
    @org.junit.Test
    public void useAppContext() {
        // MyContext of the app under AsyncTaskTest.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.ptshell.testandroid", appContext.getPackageName());
    }
}
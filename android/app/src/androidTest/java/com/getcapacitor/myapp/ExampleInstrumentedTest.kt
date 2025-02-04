package com.getcapacitor.myapp

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @org.junit.Test
    @Throws(java.lang.Exception::class)
    fun useAppContext() {
        // Context of the app under test.
        val appContext: android.content.Context =
            InstrumentationRegistry.getInstrumentation().targetContext

        org.junit.Assert.assertEquals("com.getcapacitor.app", appContext.packageName)
    }
}

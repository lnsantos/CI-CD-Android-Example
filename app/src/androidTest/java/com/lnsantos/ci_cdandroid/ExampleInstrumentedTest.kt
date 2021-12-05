package com.lnsantos.ci_cdandroid

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.lnsantos.ci_cdandroid", appContext.packageName)
    }

    @Test
    fun test_1(){
        assert(value = true)
    }

    @Test
    fun test_2(){
        assert(value = true)
    }

    @Test
    fun test_3(){
        assert(value = true)
    }

    @Test
    fun test_4(){
        assert(value = true)
    }

    @Test
    fun test_5(){
        assert(value = true)
    }

    @Test
    fun test_6(){
        assert(value = true)
    }

    @Test
    fun test_7(){
        assert(value = true)
    }

    @Test
    fun test_8(){
        assert(value = true)
    }

    @Test
    fun test_9(){
        assert(value = true)
    }

    @Test
    fun test_10(){
        assert(value = true)
    }

}
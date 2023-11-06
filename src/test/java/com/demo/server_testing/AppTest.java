package com.demo.server_testing;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void test_server_testing() throws InterruptedException {
    	String expectedResponse = "Message Sent!";
        String actualResponse = Server_Testing.performServer_Testing();
        assertEquals(expectedResponse, actualResponse);
    }
}

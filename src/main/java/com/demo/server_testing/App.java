package com.demo.server_testing;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args ) throws InterruptedException
    {
    	System.out.println("Test Started!");

        String responseText = Server_Testing.performServer_Testing();

        

        System.out.println("Message set: " + responseText);


        System.out.println("Test Done");
    }
}

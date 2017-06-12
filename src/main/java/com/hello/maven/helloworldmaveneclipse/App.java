package com.hello.maven.helloworldmaveneclipse;

/**
 * Hello world!
 *
 
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World Now!" );
    }
/*

/*package com.vogella.maven.lars;*/

import com.google.gson.Gson;

public class App
{
    public static void main( String[] args )
    {
        Gson gson = new Gson();
        System.out.println(gson.toJson("Hello World!") );
    }
    public static boolean testMaven(String text) {
    	 Gson gson1 = new Gson();
    	 System.out.println("Inside App.java" + gson1.toJson(text) );
    	 return true;
      }
}
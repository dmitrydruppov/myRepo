package com.mycompany.app;

/**
 * Hello world!
 * This code represnt my first experience with Java
 */
public class HellWorldApp 
{
    public static void main( String[] args )
    {
		if(args.length > 0) {
			System.out.println( "Argument :" + args[0] );
		} else {
			System.out.println( "Hello World!" );
		}
    }
}

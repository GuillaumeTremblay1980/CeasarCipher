package com.java.Guillaume;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
    	String s = "";
    	int decal = 0;
    	try {
			System.out.print( "Entrez un nombre : " );
			Scanner scanIn = new Scanner(System.in);
			decal = Integer.parseInt(scanIn.nextLine());
			System.out.print( "Entrez une phrase à encrypter : " );
			s = scanIn.nextLine();
			scanIn.close();
			Ceasarcipher c = new Ceasarcipher(decal);
			s = c.encipher(s);
			System.out.println( s );
		} catch (NumberFormatException e) {
			System.out.println( "Erreur. veuillez entrer un nombre valide" );
			e.printStackTrace();
		}
    }
}

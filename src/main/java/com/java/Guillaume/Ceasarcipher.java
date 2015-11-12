package com.java.Guillaume;

public class Ceasarcipher {
	
	private int decal; 
	
	public int getDecal() {
		return decal;
	}


	public void setDecal(int decal) {
		this.decal = decal;
	}


	public Ceasarcipher(int decal){
		this.decal=decal;
	}
		
	

	public String encipher(String msg){
	    String s = "";
	    for(int i = 0; i <  msg.length(); i++){
	    	char c = (char)(msg.charAt(i));
	    	if ((c >= 'a') && (c <= 'z') || ((c >='A') && (c <='Z')) || ((c <= '9') && ( c >= '0' )) )
	    		s += (char)(msg.charAt(i) + decal);
	    	else
	    		s += (char)(msg.charAt(i));
	    	}
	    return s;
	}
}
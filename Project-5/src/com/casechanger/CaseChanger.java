package com.casechanger;

public class CaseChanger {

	String s;
	public CaseChanger(String s) {
		this.s = s;
	}

	public String toUpperCase() {
		return s.toUpperCase();
	}
	
	public String toLowerCase() {
		return s.toLowerCase();
	}
	
	public String capitalize() { 
		 String result = "";
		    String[] splitString = s.split(" ");
		    for(String target : splitString){
		        result += Character.toUpperCase(target.charAt(0))
		                + target.substring(1) + " ";
		    }
		    return result.trim();
	}
	
	public String sentenceCase() {
		return Character.toUpperCase(s.charAt(0)) + s.substring(1);
	}
	
	public String swapCase() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
	    for (char c : s.toCharArray()) {
	    	if (Character.isUpperCase(c)) { 
	            c = Character.toLowerCase(c);
	        }
	        else {
	            c = Character.toUpperCase(c);
	        }
	        sb.append(c);
	    }
	    return sb.toString();
	}
}

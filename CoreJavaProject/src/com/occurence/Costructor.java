package com.occurence;

public class Costructor {
	
	public int Costructor(int x) {
		return x;
		
	}
	public int  Costructor(int x,int y) {
		System.out.println("this is parametrized constructor"+x);
		return x-y;
	}
	
       
	public static void main(String[] args) {
		
		String abc="faraz";
		String revers="";
		StringBuffer sf=new StringBuffer(abc);
		System.out.println(sf.reverse());
		
		for(int i=abc.length()-1; i>=0; i-- ) {
			revers=revers+abc.charAt(i);
			
		}
		System.out.println("revrseString::::"+revers);
		
		Costructor obj =new Costructor();
		
	   System.out.println(obj.Costructor(10));
	   System.out.println(obj.Costructor(30,10));
		System.out.println(obj);
			String city="Mumbainn";
			if(city=="azamgarh") {
				System.out.print("Azamgarh");
			}
			else if(city=="lucknow") {
				System.out.print("lkdjdd");
			}
			else if(city=="Mumbai") {
				System.out.print("aaaaaaaaaa");
			}
			else {
				System.out.print("this is not valid case"+city);
			}
			}
			}      
			    
		
	




package com.occurence;

import java.util.HashMap;
import java.util.Map;

public class Occurence {
	
	
	
	
	public static void main(String[] args) {
		String cha="majidm";
		char []conver=cha.toCharArray();
		//take hasmap for key and values pairs Character as key and Integer as values

		HashMap<Character, Integer> charactercoutnmap=new HashMap<Character,Integer>();
		
    for(char char1:conver) {
	if(charactercoutnmap.containsKey(char1)) {
		//if character is present in charactercoutnmap increment by its 1
		charactercoutnmap.put(char1, charactercoutnmap.get(char1) +1);
	}else {
		//if charater is not present then charactercoutnmap with 1 and its value
		charactercoutnmap.put(char1, 1);
	}

}
//for iterating the charactercoutnmap in foreach loop
for(Map.Entry entery:charactercoutnmap.entrySet()) {
	System.out.println(entery.getKey()+ " "+entery.getValue());
	
}
	}

}

package com.occurence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<Integer> compar=new Comparator<Integer>() {
			public int compare(Integer firstvalue, Integer secondbalu) {
				
				if(firstvalue%10>secondbalu%10) {
					return 1;
				}else {
				return -1;
				}
				// TODO Auto-generated method stub
			}
			
			
		};
		
		List<Integer> listitem=new ArrayList<>();
		listitem.add(5);
		listitem.add(4);
		listitem.add(3);
		listitem.add(2);
		listitem.add(8);
	
		 Collections.sort(listitem,compar); 
		 System.out.println(listitem);
		 //System.out.println(listitem);
		 //for(String i:listitem) { System.out.println(i);



	}

}

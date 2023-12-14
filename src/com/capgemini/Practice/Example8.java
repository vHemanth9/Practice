package com.capgemini.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	List<Integer> list=Arrays.asList(15,16,23,99,67,45,65);
	 List<Integer> mylist=list.stream().sorted().collect(Collectors.toList());
	 //System.out.println(mylist);it will print directly the list.
	 
	 for(Integer i:mylist) {
		 System.out.println(i);
	 }
		
	}

}

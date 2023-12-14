package com.capgemini.Practice;

import java.util.Arrays;
import java.util.List;

//find the total count from a given list of integers using streams functions.
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<Integer> list=Arrays.asList(12,23,12,45,67,89,0,35);
    long count=list.stream().count();
    System.out.println(count);
	}

}

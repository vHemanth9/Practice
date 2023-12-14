package com.capgemini.Practice;

import java.util.*;

//find the maximum value element present in list using the stream functions.
public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         List<Integer> list=Arrays.asList(18,24,18,56,0,99,12,34);
         int max=list.stream().max(Integer::compare).get();
         System.out.println(max);
	}
}

package com.capgemini.Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//sort the list using streams.
public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<Integer> list=Arrays.asList(15,23,99,56,12,11,10,43);
    list.stream().sorted().forEach(System.out::println); //for ascending order.
    System.out.println("look down for descending order");
    list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
    System.out.println("*******************************");
    list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}

package com.capgemini.Practice;

import java.util.Arrays;
import java.util.List;

//find out all the numbers starting with the number 1.

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<Integer> list=Arrays.asList(15,23,24,54,67,99,42,19);
      list.stream().map(s->s+" ").filter(n->n.startsWith("1")).forEach(System.out::println);
      System.out.println("***********************");
      list.stream().findFirst().ifPresent(System.out::println);
	}

}

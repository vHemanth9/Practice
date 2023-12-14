package com.capgemini.Practice;

import java.util.Arrays;
import java.util.List;

public class Example1 {
  public static void main(String[] args) {
	  List<Integer> l1=Arrays.asList(15,16,18,14,13,13,20);
	  l1.stream().filter(n->n%2==0).sorted().forEach(System.out::println);
	  
  }
}

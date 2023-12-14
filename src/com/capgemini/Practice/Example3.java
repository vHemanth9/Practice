package com.capgemini.Practice;

import java.util.Arrays;
import java.util.*;

//find out the duplicate elements using the stream functions.

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Integer> list=Arrays.asList(15,12,12,10,9,8,9,9,34,35,35);
     Set<Integer> set=new HashSet<>();
     list.stream().filter(n->!set.add(n)).forEach(System.out::println);
	}

}

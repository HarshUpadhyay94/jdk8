package com.raystech.jdk;
import java.util.Arrays;

import java.util.ArrayList;

public class ForEachMethod {
	
	public static void main(String[] args) {
		
		ArrayList l = new ArrayList<String>();
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(34);
		l.forEach(liS -> System.out.println(liS));		
		//Ex of parallelSort
		System.out.println("Below is an unsorted Array list");
		int[] arr = {2,4,3,1,6,0};
		
		for (int i : arr) {
			System.out.println(i + " ");
		}
		Arrays.parallelSort(arr);
		
		System.out.println("after sorting array list is: ");
		
		for (int i : arr) {
			System.out.println(i + "");
		}
	}

}

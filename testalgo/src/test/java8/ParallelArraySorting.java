package test.java8;

import java.util.Arrays;

public class ParallelArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     int[] arr = {5,8,1,0,6,9};  
	        // Iterating array elements  
	        for (int i : arr) {  
	            System.out.print(i+" ");  
	        }  
	        // Sorting array elements parallel  
	        Arrays.parallelSort(arr);  
	        System.out.println("\nArray elements after sorting");  
	        // Iterating array elements  
	        for (int i : arr) {  
	            System.out.print(i+" ");  
	        }  
	        int[] barr = {5,8,1,0,6,9,50,-3};  
	        Arrays.parallelSort(barr,0,4);  
	        System.out.println("\nArray elements after sorting with index");  
	        // Iterating array elements  
	        for (int i : barr) {  
	            System.out.print(i+" ");  
	        }  
	}

}

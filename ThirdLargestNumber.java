package com.program.practice;

public class ThirdLargestNumber {
	
	public static void thirdLargestNumber(int[] nums)
	{
		if (nums.length < 3) 
	    { 
	        System.out.printf(" Invalid Input "); 
	    } 
	  
	    
	    //for 2nd largest element 
	    int first = nums[0]; 
	    for (int i = 1; i < nums.length ; i++) 
	        if (nums[i] > first) 
	            first = nums[i]; 
	  
	    //for 2nd largest element 
	    int second = Integer.MIN_VALUE; 
	    for (int i = 0;  
	             i < nums.length ; i++) 
	        if (nums[i] > second && nums[i] < first) 
	            second = nums[i]; 
	  
	    // Find 3rd largest 
	    
	    int third = Integer.MIN_VALUE; 
	    for (int i = 0;  i < nums.length ; i++) 
	        if (nums[i] > third &&  nums[i] < second) 
	            third = nums[i]; 
	  
	    System.out.printf("3rd largest number is " + "%d" , third); 
	} 
	  
	public static void main(String []args) 
	{ 
	    int arr[] = {12, 13, 1, 10, 34, 16}; 
	    int nums = arr.length; 
	    thirdLargestNumber(arr); 
		
	}

}

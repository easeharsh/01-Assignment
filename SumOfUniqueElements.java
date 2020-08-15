package com.program.practice;

import java.util.Arrays;

public class SumOfUniqueElements {

	public static int sumOfUniqueElement(int[] nums)
	{
		if(nums.length==0 || nums==null)
		{
			return 0;
		}
		
		Arrays.sort(nums);
		int sum = nums[0];
		for(int i=0; i<nums.length-1; i++)
		{
			if(nums[i]!= nums[i+1])
			{
				sum += nums[i+1];
			}
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		int nums[]= {1, 1, 3, 2, 2, 3};
		int length = nums.length;
		length = sumOfUniqueElement(nums);
	    System.out.print(length); 
	}
}

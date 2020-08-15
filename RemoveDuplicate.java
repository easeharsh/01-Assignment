package com.program.practice;

public class RemoveDuplicate {

	public static int removeDuplicate(int nums[])
	{
		if(nums.length == 0 || nums == null)
			return 0;
		
		int index = 0;
		
		for(int i=0; i<nums.length-1;i++)
		{
				if(nums[i] != nums[i+1])
				{
					nums[index++] = nums[i];
					
				}
		}
		return index;
	}
	
	public static void main(String[] args) {
		int nums[]= {1, 2, 5, 5, 6, 6, 7, 2};
		int length = nums.length;
		length = removeDuplicate(nums);
		for (int i=0; i<length; i++) 
	           System.out.print(nums[i]+ " "); 
		
	}

}

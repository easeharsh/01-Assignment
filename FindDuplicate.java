package com.program.practice;

public class FindDuplicate {
	
	public static void findDuplicate(int [] nums)
	{
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]==nums[j])
				{
					System.out.print(nums[i] + " "); 
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		FindDuplicate findDuplicate = new FindDuplicate();
		int nums[] = { 1, 2, 5, 5, 6, 6, 7, 2};
		findDuplicate(nums);
		
	}
	
}



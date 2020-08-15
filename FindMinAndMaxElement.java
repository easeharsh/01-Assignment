package com.program.practice;

public class FindMinAndMaxElement {
	
	static int findMin(int [] num) 
    { 
        int res = num[0]; 
          
        for (int i = 1; i < num.length; i++) 
            res = Math.min(res, num[i]); 
        return res; 
    } 
      
    static int findMax(int [] num) 
    { 
        int res = num[0]; 
          
        for (int i = 1; i < num.length; i++) 
            res = Math.max(res, num[i]); 
        return res; 
    } 
  
    
    public static void main (String[] args)  
    { 
        int num[] = { 12, 1234, 45, 67, 1 }; 
        int nums = num.length; 
        System.out.println( "Minimum element"+ " of array: " + findMin(num)); 
        System.out.println( "Maximum element"+ " of array: " + findMax(num)); 
    } 
} 



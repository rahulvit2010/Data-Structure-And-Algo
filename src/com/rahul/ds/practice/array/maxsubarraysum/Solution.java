package com.rahul.ds.practice.array.maxsubarraysum;

public class Solution {

  public static void main(String[] args) {
    executeTestCase1();
    executeTestCase2();
    executeTestCase3();
  }

  private static void executeTestCase1() {
    System.out.println("**************************");
    System.out.println("**Executing first test case**");
    System.out.println("**************************");
    int [] nums= new int[]{-2,1,-3,4,-1,2,1,-5,4};

    int result= maxSubArray(nums);
    System.out.println("result = " + result);


  }

  private static void executeTestCase2() {
    System.out.println("**************************");
    System.out.println("**Executing second test case**");
    System.out.println("**************************");
    int [] nums= new int[]{1};

    int result= maxSubArray(nums);
    System.out.println("result = " + result);
  }

  private static void executeTestCase3() {
    System.out.println("**************************");
    System.out.println("**Executing thrid test case**");
    System.out.println("**************************");
    int [] nums= new int[]{5,4,-1,7,8};

    int result= maxSubArray(nums);
    System.out.println("result = " + result);
  }

  public static int maxSubArray(int[] nums) {

    int max_ending_here=0;
    int max_so_far=Integer.MIN_VALUE;
    //Kadane's Algorithm
    for(int i=0;i<nums.length;i++)
    {
      max_ending_here= max_ending_here + nums[i];
      if(max_so_far<max_ending_here)
      {
        max_so_far=max_ending_here;
      }

      if(max_ending_here<0)
        max_ending_here=0;
    }

    return max_so_far;

  }
}

package com.rahul.ds.practice.maxsubarraysum.maxsubarraysumsizek.II;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  public static void main(String[] args) {

    executeTestCase1();

    executeTestCase2();
  }

  private static void executeTestCase2() {
    System.out.println("Executing test case 2");
    int [] nums = new int[]{4,4,4};
    int k = 3;
    long result=maximumSubarraySum(nums,k);
    System.out.println("result = " + result);
    System.out.println("************************");
  }

  private static void executeTestCase1() {
    System.out.println("Executing test case 1");
    int [] nums = new int[]{1,5,4,2,9,9,9};
    int k = 3;
    long result=maximumSubarraySum(nums,k);
    System.out.println("result = " + result);
    System.out.println("********************");
  }

  public static long maximumSubarraySum(int[] nums, int k) {
    long max= 0;
    long sum=0;
    Map<Integer,Integer> countByNum= new HashMap<>();
    for(int i=0;i<nums.length;i++)
    {
      sum= sum+nums[i];
      if(countByNum.containsKey(nums[i]))
        countByNum.put(nums[i],countByNum.get(nums[i])+1);
      else
        countByNum.put(nums[i],1);

      if(i>=k-1)
      {
        if(countByNum.size()==k) max= Math.max(max,sum);
          sum= sum - nums[i-k+1];
          countByNum.put(nums[i-k+1], countByNum.get(nums[i-k+1])-1);
        if(countByNum.get(nums[i-k+1])==0)
          countByNum.remove(nums[i-k+1]);
      }
    }
    return max;
  }

}

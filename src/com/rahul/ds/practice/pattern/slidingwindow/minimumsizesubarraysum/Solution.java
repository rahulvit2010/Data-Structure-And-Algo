package com.rahul.ds.practice.pattern.slidingwindow.minimumsizesubarraysum;

public class Solution {

  public static void main(String args[])
  {
    executeFirstTestCase();
    executeSecondTestCase();
    executeThirdTestCase();
  }

  private static void executeThirdTestCase() {
    int [] input = new int[]{1,1,1,1,1,1,1,1};
    int target=11;
    int result = getMinimumSizeSubArraySum(target,input);
    System.out.println("Minimum Size Sub Array Sum is "+ result);
  }

  private static void executeSecondTestCase() {
    int [] input = new int[]{1,4,4};
    int target=4;
    int result = getMinimumSizeSubArraySum(target,input);
    System.out.println("Minimum Size Sub Array Sum is "+ result);
  }

  private static void executeFirstTestCase() {
    int [] input = new int[]{2,3,1,2,4,3};
    int target=7;
    int result = getMinimumSizeSubArraySum(target,input);
    System.out.println("Minimum Size Sub Array Sum is "+ result);
  }

  private static int getMinimumSizeSubArraySum(int target, int[] nums)
  {
    int window_start=0;
    int min_length=Integer.MAX_VALUE;
    int subarray_sum=0;

    //loop through the array
    for(int window_end=0;window_end<nums.length;window_end++)
    {
      subarray_sum= subarray_sum+nums[window_end];

      // find the minimum size array where sub array sum is >= target
      while(subarray_sum>=target)
      {
        min_length= Math.min(window_end-window_start+1,min_length);
        subarray_sum= subarray_sum-nums[window_start];
        window_start++;
      }
    }
    if(min_length==Integer.MAX_VALUE)
      min_length= 0;

    return min_length;
  }

}

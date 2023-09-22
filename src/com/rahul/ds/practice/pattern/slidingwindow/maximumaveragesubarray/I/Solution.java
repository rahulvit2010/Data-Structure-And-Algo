package com.rahul.ds.practice.pattern.slidingwindow.maximumaveragesubarray.I;

public class Solution {

  public static void main(String args[])
  {
    int [] nums = new int[]{1,12,-5,-6,50,3} ;
    int k=4;
    System.out.println("The max avg Sum is :"+getMaxAvgSubArr(nums,k));
  }

  static double getMaxAvgSubArr(int[] nums, int k)
  {
    int window_sum=0;
    int window_start=0;
    double max_avg_sum=0.0;

    for(int window_end=0; window_end<nums.length;window_end++)
    {
      window_sum= window_sum+ nums[window_end];

      if(window_end>=k-1)
      {
       double curr_avg_sum= (double)window_sum/k;

       if(curr_avg_sum>max_avg_sum)
         max_avg_sum=curr_avg_sum;

       window_sum= window_sum-nums[window_start];
        window_start= window_start+1;
      }

    }
    return max_avg_sum;
  }

}

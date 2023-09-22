package com.rahul.ds.practice.pattern.slidingwindow.maximumsumsubarrayofsizek;

public class Solution {

  public static void main(String args[]) {
    ExecuteTestCase1();
    ExecuteTestCase2();
  }

  private static void ExecuteTestCase2() {
    int[] input = new int[]{4, 2, 3, 5, 1, 2};
    int k = 3;

    int max_sum_sub_array= getMaxSumSubArrayOfSizeK(input, k);
    System.out.println("Maximum sub array with size "+ k +" is "+max_sum_sub_array);
  }

  private static void ExecuteTestCase1() {
    int[] input = new int[]{3, 5, 2, 1, 7};
    int k = 2;

    int max_sum_sub_array= getMaxSumSubArrayOfSizeK(input, k);
    System.out.println("Maximum sub array with size "+ k +" is "+max_sum_sub_array);
  }

  private static int getMaxSumSubArrayOfSizeK(int[] input, int k) {

    int window_start=0;
    int max_sum= Integer.MIN_VALUE;
    int subarray_sum=0;

    for(int window_end=0;window_end<input.length; window_end++ )
    {
        subarray_sum= subarray_sum+input[window_end];

        if(window_end>=k-1)
        {
          if(max_sum<subarray_sum)
            max_sum=subarray_sum;

          subarray_sum= subarray_sum-input[window_start];
          window_start++;
        }
    }

    return max_sum;

  }
}
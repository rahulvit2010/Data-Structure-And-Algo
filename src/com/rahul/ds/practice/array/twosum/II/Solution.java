package com.rahul.ds.practice.array.twosum.II;

import java.util.Arrays;

public class Solution {

  public static void main(String[] args) {
    int [] input0= new int[]{2,7,11,15};
    int target0=9;

    int [] result0 = getIndexOfNumSumToTarget(input0,target0);
    System.out.println("Executing first test case..............");
    Arrays.stream(result0).forEach(System.out::println);
    System.out.println("Executed first test case..............");

    int [] input1= new int[]{2,3,4};
    int target1=6;

    int [] result1 = getIndexOfNumSumToTarget(input1,target1);
    System.out.println("Executing second test case..............");
    Arrays.stream(result1).forEach(System.out::println);
    System.out.println("Executed second test case..............");


    int [] input2= new int[]{-1,0};
    int target2=-1;

    int [] result2 = getIndexOfNumSumToTarget(input2,target2);
    System.out.println("Executing third test case..............");
    Arrays.stream(result2).forEach(System.out::println);
    System.out.println("Executed third test case..............");
  }

  private static int[] getIndexOfNumSumToTarget(int[] input,int target) {
    int [] result = new int[2];
    int i=0;
    int j= input.length-1;

    while(i<=j)
    {
      int sum= input[i]+input[j];
      if(sum==target)
      {
        result[0]=i+1;
        result[1]=j+1;
        break;
      }
      else if(sum>target)
      {
        j--;
      }
      else
      {
        i++;
      }
    }
   return result;
  }

}
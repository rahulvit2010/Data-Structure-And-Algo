package com.rahul.ds.practice.containswithmostwater;

public class Solution {

  public static void main(String [] args)
  {
    executeTestCase1();

    executeTestCase2();
  }

  private static void executeTestCase2() {
    System.out.println("************************");
    System.out.println("Executing Second Test case.");
    int [] height = new int[]{1,1};
    //Output= 1;
    int result=containersWithMostWater(height);

    System.out.println("result = " + result);
  }

  private static void executeTestCase1() {
    int [] height = new int[]{1,8,6,2,5,4,8,3,7};
    //Output= 49;
    int result=containersWithMostWater(height);

    System.out.println("result = " + result);
  }

  private static int containersWithMostWater(int[] height) {
    int i=0;
    int j= height.length-1;
    int max_result=0;
    int area=0;
    while(i<=j)
    {
      area=Math.min(height[i],height[j])* (j-i);
     if(height[i]<=height[j])
       i++;
     else
       j--;
     if(area>max_result)
       max_result= area;
    }
   return max_result;
  }

}

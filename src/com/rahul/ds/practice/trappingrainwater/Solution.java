package com.rahul.ds.practice.trappingrainwater;

public class Solution {

  public static void main(String [] args)
  {
    executeTestCase1();

    executeTestCase2();
  }

  private static void executeTestCase2() {
    int[] height = new int[]{4,2,0,3,2,5};
    //output:9
    int result=getTrappedWater(height);

    System.out.println("result = " + result);
    System.out.println("***************************");
  }

  private static void executeTestCase1() {
    int[] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
    //Output: 6
    int result=getTrappedWater(height);

    System.out.println("result = " + result);
    System.out.println("***************************");
  }

  private static int getTrappedWater(int[] height) {
    int [] left_height= new int[height.length];
    int [] right_height= new int[height.length];
    int result=0;

    left_height[0]=height[0];
    right_height[height.length-1]=height[height.length-1];
    for(int i= height.length-2;i>=0;i--)
    {
     right_height[i]= Math.max(right_height[i+1],height[i]);
    }

    for(int i= 1;i<=height.length-1;i++)
    {
      left_height[i]= Math.max(left_height[i-1],height[i]);
    }

    //final loop
    for(int i=1;i<=height.length-2;i++)
    {
      result= result+ Math.min(left_height[i],right_height[i])-height[i];
    }
    return result;
  }

}

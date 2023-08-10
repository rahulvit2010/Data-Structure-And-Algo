package com.rahul.ds.practice.array.maxsubarraysum.maxsubarraysumsizek;

public class Solution {

  public static void main(String[] args) {

    executeTestCase1();
    executeTestCase2();
    executeTestCase3();
  }


  private static void executeTestCase1() {
    System.out.println("Executing test case 1");
    int arr[] = new int[]{100, 200, 300, 400};
    int  k = 2;
    System.out.println("max sum = " + calculateMaxSumOfSizeK(arr,k));
    System.out.println("************************************");
    //Output : 700

  }

  private static void executeTestCase2() {
    System.out.println("Executing test case 2");
    int arr[] = new int[]{1, 4, 2, 10, 23, 3, 1, 0, 20};
    int  k = 4;
    System.out.println("max sum = " + calculateMaxSumOfSizeK(arr,k));
    System.out.println("************************************");
    //Output : 39
  }

  private static void executeTestCase3() {
    System.out.println("Executing test case 3");
    int arr[] = new int[]{2, 3};
    int  k = 3;
    //Output : Invalid
    System.out.println("max sum = " + calculateMaxSumOfSizeK(arr,k));
  }

  private static int calculateMaxSumOfSizeK(int[] arr, int k) {

    int max= Integer.MIN_VALUE;
    int sum=0;

    if(arr.length<k)
    {
      System.out.println("Invalid");
      return -1;
    }

    for(int i=0;i<k;i++)
    {
     sum= sum+arr[i];
    }

    for(int j=k;j<arr.length;j++)
    {
      sum= sum-arr[j-k]+arr[j];
      if(max<sum)
      {
        max=sum;
      }
    }
   return max;
  }
}

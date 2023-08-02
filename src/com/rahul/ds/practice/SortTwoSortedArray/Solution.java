package com.rahul.ds.practice.SortTwoSortedArray;

import java.util.Arrays;

public class Solution {

  public static void main(String[] args) {
    int [] a= new int[]{8,7,5,3,1};
    int [] b= new int[]{12,10,9,8,6,4,2};
    //c={12,10,9,8,8,7,6,5,4,3, 2,1}
    int [] result=  getSortedArray(a, b);
    Arrays.stream(result).forEach(System.out::println);
  }

  private static int[] getSortedArray(int[] input1, int[] input2)
  {
    int size= (input1.length+input2.length);
    int [] result = new int[size];
    int i=0,j=0,k=0;
    while(i<input1.length && j<input2.length)
    {
      if(input1[i]>=input2[j])
      {
        result[k]= input1[i];
        k++;
        i++;
      }
      else
      {
        result[k]= input2[j];
        k++;
        j++;
      }
    }

    while(i<input1.length)
    {
      result[k]= input1[i];
      k++;
      i++;
    }
    while(j<input2.length)
    {
      result[k]= input1[j];
      k++;
      j++;
    }

    return  result;



  }

}

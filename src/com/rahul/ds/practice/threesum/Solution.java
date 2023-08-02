package com.rahul.ds.practice.threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

  public static void main(String[] args) {
   int [] input = new int[]{-1,0,1,2,-1,-4};
   //-2,0,0,2,2
   List<List<Integer>> result = getTripletSumToZero(input);
    System.out.println("Executing first Test case");
    System.out.println("result = " + result);

    System.out.println("**************************");

    int [] input1 = new int[]{-2,0,0,2,2};
    List<List<Integer>> result1 = getTripletSumToZero(input1);
    System.out.println("Executing second Test case");
    System.out.println("result = " + result1);

  }

  private static List<List<Integer>> getTripletSumToZero(int[] input) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(input);
   int j=0;int k=0;
    for(int i=0;i<input.length;i++)
    {
      j=i+1;
      k= input.length-1;

      if(i>0 && input[i]==input[i-1])
        continue;

      while(j<k)
      {
        int sum= input[i]+input[j]+input[k];
        if(sum==0)
        {
         result.add(Arrays.asList(input[i],input[j],input[k]));
         k--;j++;

         while(j<input.length && input[j]==input[j-1])
         {
           j++;
         }

        }
        else if(sum>0)
        {
          k--;
        }
        else
        {
          j++;
        }
      }

    }
    return result;

  }

}

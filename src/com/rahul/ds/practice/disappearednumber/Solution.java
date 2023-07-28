package com.rahul.ds.practice.disappearednumber;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  public static void main(String args[])
  {
      int [] input = new int[]{4,3,2,7,8,2,3,1};

    List<Integer> disappearedNums= findAllDisappearedNumbers(input);

    System.out.println("Disappeared number---->");

    System.out.println(disappearedNums);


  }

  private static List<Integer> findAllDisappearedNumbers(int[] input) {
    List<Integer> result= new ArrayList<>();

    for(int i=0;i<input.length;i++)
    {
      int actualIndex= Math.abs(input[i])-1;
      if(input[actualIndex]>0)
        input[actualIndex]= -input[actualIndex];
    }

    for(int j=0;j<input.length;j++)
    {
      if(input[j]>0)
        result.add(j+1);
    }
  return result;
  }

}

package com.rahul.ds.practice.array.containsduplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution {

  public static void main(String args[])
  {
    int [] input = new int[]{1,1,1,3,3,4,3,2,4,2};
   boolean result= containsDuplicate(input);
   System.out.println("Contains duplicate:"+ result);
  }

  public static boolean containsDuplicate(int[] nums) {

    Set<Integer> set= new HashSet<Integer>();

    for(int i=0;i< nums.length;i++)
    {
      if(!set.add(nums[i]))
        return true;
    }
    return false;
  }

}

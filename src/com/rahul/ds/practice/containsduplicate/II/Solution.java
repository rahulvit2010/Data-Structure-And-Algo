package com.rahul.ds.practice.containsduplicate.II;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  public static void main(String [] args)
  {
     int [] input = new int[]{1,2,3,1};
     int k=3;
    boolean result=containsNearbyDuplicate(input,k);
    System.out.println("Contains Duplicate:"+ result);
  }

  public static boolean containsNearbyDuplicate(int[] nums, int k) {

    Map<Integer,Integer> map = new HashMap<Integer,Integer>();

    for(int i=0;i<nums.length;i++)
    {
      if(map.containsKey(nums[i]) && Math.abs(map.get(nums[i])-i)<=k)
        return true;
      else
        map.put(nums[i],i);
    }
    return false;

  }

}

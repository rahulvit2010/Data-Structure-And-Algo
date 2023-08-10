package com.rahul.ds.practice.array.majorityelement;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  public static void main(String args[])
  {
    int [] input= new int[]{3,2,3};

    int [] input2= new int[]{2,2,1,1,1,2,2};

    int majorityElement= findMajorityElement(input);

    System.out.println("Majority Element is : "+majorityElement);

    //with approach from boyee morray algo
    int majorityElement_second_approach=findMajorityElementII(input);

    System.out.println("Majority Element using second apporach : "+majorityElement_second_approach);



  }

  private static int findMajorityElementII(int[] input) {
    int count=0;
    int majorityElement=input[0];

    for(int i=1;i<input.length;i++)
    {
      if(input[i]==majorityElement)
        count++;
      else
        count--;
      if(count==0)
      {
        majorityElement=input[i];
        count=1;
      }
    }
    return majorityElement;
  }

  //HashMap Approach
  private static int findMajorityElement(int[] input) {
    Map<Integer,Integer> frequenceByNum= new HashMap<>();
    int majority_element= 0;
    int max_freq=Integer.MIN_VALUE;
    for(int i=0;i<input.length;i++)
    {
      if(frequenceByNum.containsKey(input[i]))
      {
        int freq=frequenceByNum.get(input[i])+1;
        frequenceByNum.put(input[i],freq);
      }
      else
      {
        frequenceByNum.put(input[i],1);
      }
    }

    for(Map.Entry<Integer,Integer> entry: frequenceByNum.entrySet())
    {
       if(max_freq<entry.getValue())
       {
         max_freq=entry.getValue();
         majority_element= entry.getKey();
       }

    }

    return majority_element;
  }

}

package com.rahul.ds.practice.topkfrequentElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

  public static void main(String[] args) {
   int[]  input= new int[]{1,1,1,2,2,3};
   int k=2;
   // Output: [1,2]
    int result[]=getKfrequentElement(input,k);
    Arrays.stream(result).forEach(System.out::println);

    //Input: nums = [1], k = 1
    //Output: [1]
    System.out.println("*************Executing the Second Test case **********************");
    int[]  input1= new int[]{1};
    int k1=1;
    int result1[]=getKfrequentElement(input1,k1);
    Arrays.stream(result1).forEach(System.out::println);

  }

  public static int[] getKfrequentElement(int[] input, int k)
  {
     int[] result = new int[k];
     Map<Integer,Integer> map = new HashMap<>();
     int maxfreq=0;
     int count=0;
     for(int i=0;i<input.length;i++)
     {
       if(map.containsKey(input[i]))
         map.put(input[i],map.get(input[i])+1);
       else
         map.put(input[i],1);

       if(maxfreq<map.get(input[i]))
       {
         maxfreq=map.get(input[i]);
       }
     }

    ArrayList<Integer>[] freq_arr = new ArrayList[maxfreq+1];

     for(Map.Entry<Integer,Integer> entry: map.entrySet())
     {
        if(freq_arr[entry.getValue()-1] ==null)
        {
          freq_arr[entry.getValue()-1]= new ArrayList<>();
        }
       freq_arr[entry.getValue()-1].add(entry.getKey());
     }

     //iterate on the freq array and then populate the result array
    for(int j=freq_arr.length-1;j>=0;j--)
    {
      if(freq_arr[j]!=null)
      {
        for(int l=0;l<freq_arr[j].size();l++)
        {
         result[count]= freq_arr[j].get(l);
         count++;
         if(k==count)
           break;
        }
      }
      if(k==count)
        break;
    }
return result;
  }

}

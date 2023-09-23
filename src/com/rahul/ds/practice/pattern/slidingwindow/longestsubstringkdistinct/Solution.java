package com.rahul.ds.practice.pattern.slidingwindow.longestsubstringkdistinct;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  public static void main(String args[])
  {
    ExecuteFirstTestCase();
    ExecuteSecondTestCase();
    ExecuteThirdTestCase();
    /**
     * abbbbbbc ,k=2
     * abcddefg , k=3
     *
     */
  }

  private static void ExecuteThirdTestCase() {
    String input = "abbbbbbc";
    int k =2;
    int result= getLongestSubStringWithKDistinctChar(input,k);
    System.out.println("Third:Longest substring with K= " +k +" Distinct character is "+ result);
  }

  private static void ExecuteSecondTestCase() {
    String input = "aaaa";
    int k =2;
    int result= getLongestSubStringWithKDistinctChar(input,k);
    System.out.println("Second:Longest substring with K= " +k +" Distinct character is "+ result);
  }

  private static void ExecuteFirstTestCase() {
    String input = "aabacbebebe";
    int k =3;
    int result= getLongestSubStringWithKDistinctChar(input,k);
    System.out.println("First:Longest substring with K= " +k +" Distinct character is "+ result);
  }


  private static int getLongestSubStringWithKDistinctChar(String input, int k)
  {
    int window_start=0;
    int length_longest_subString=Integer.MIN_VALUE;
    Map<Character,Integer> freq_map= new HashMap<>();
    for(int window_end=0;window_end<input.length();window_end++)
    {
       if(freq_map.containsKey(input.charAt(window_end)))
      {
        int count = freq_map.get(input.charAt(window_end))+1;
        freq_map.put(input.charAt(window_end),count);
      }
      else
      {
        freq_map.put(input.charAt(window_end),1);
      }
      while(freq_map.size()>k)
      {
          int freq= freq_map.get(input.charAt(window_start));
          if(freq-1==0)
            freq_map.remove(input.charAt(window_start));
          else
          freq_map.put(input.charAt(window_start),freq-1);
        window_start++;
      }

      length_longest_subString= Math.max(length_longest_subString,window_end-window_start+1);
    }
    if(freq_map.size()<k)
      length_longest_subString=-1;

    return length_longest_subString;
  }


}

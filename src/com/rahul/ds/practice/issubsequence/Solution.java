package com.rahul.ds.practice.issubsequence;

public class Solution {

  public static void main(String[] args) {
    /*
Input: s = "abc", t = "ahbgdc"
Output: true

Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false

     */

   String s = "abc"; 
   String t = "ahbgdc";
   boolean result= isSubSequence(s,t);
    System.out.println("result = " + result);
    System.out.println("*****************************");


    String s1 = "axc";
    String t1 = "ahbgdc";
    boolean result1= isSubSequence(s1,t1);
    System.out.println("result = " + result1);

  }

  public static boolean isSubSequence(String input, String target)
  {
    int i=0;
    for(int j=0;j<target.length();j++)
    {
      if(target.charAt(j)==input.charAt(i)) i++;
    }
    return i==input.length();
  }
}

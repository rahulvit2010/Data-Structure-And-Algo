package com.rahul.ds.practice.maxballoons;

public class Solution {

  public static void main(String args[])
  {
    executeTestCase1();
    executeTestCase2();
    executeTestCase3();

  }

  private static void executeTestCase1() {
    System.out.println("executeTestCase1: executing the first test case");
    String input="nlaebolko";
    System.out.println("Input: "+input);
    int count=findTheMaxballoonsCount(input);
    System.out.println("we can get Maximum "+ count  + " from the input string [ " +input + "]");

  }

  private static void executeTestCase2() {
    System.out.println("executeTestCase1: executing the second test case");
    String input = "loonbalxballpoon";
    System.out.println("Input: "+input);
    int count=findTheMaxballoonsCount(input);
    System.out.println("we can get Maximum "+ count  + " from the input string [ " +input + "]");

  }

  private static void executeTestCase3() {
    System.out.println("executeTestCase1: executing the third test case");
    String input = "leetcode";
    System.out.println("Input: "+input);
    int count=findTheMaxballoonsCount(input);
    System.out.println("we can get Maximum "+ count  + " from the input string [ " +input + "]");

  }

  private static int findTheMaxballoonsCount(String input) {
    //take five variable which contains the count of the  character(b,a l,o,n)
    int a=0,b=0,l=0,o=0,n=0;
    //loop through the input string;
    for(int i=0;i<input.length();i++)
    {
       switch(input.charAt(i))
       {
         case 'b':
           b++;
           break;
         case 'a':
           a++;
           break;
         case 'l':
           l++;
           break;
         case 'o':
           o++;
           break;
         case 'n':
           n++;
           break;
       }

    }

    return(Math.min(Math.min(l/2,o/2),Math.min(Math.min(a,b),n)));

  }


}

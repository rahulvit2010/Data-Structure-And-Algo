package com.rahul.ds.practice.array.firstmissingpositive;

public class Solution {

  public static void main(String args[])
  {
    executeTestCases();
  }

  private static void executeTestCases() {
    int [] testCaseArray = new int[]{7,8,9,11,12};
    int [] testCaseArray1 = new int[]{3,4,-1,1};
    int [] testCaseArray2 = new int[]{1,2,0};

    //executing first test case
    int  result= getFirstMissingPositive(testCaseArray);
    System.out.println("Executing first test case");
    System.out.println("---------------------------");
    System.out.println("First missing positive number is:"+result);
    System.out.println("");
    System.out.println("End");
    System.out.println("---------------------------");
    System.out.println("");
    //executing second test case
    int result_test_case1 =  getFirstMissingPositive(testCaseArray1);
    System.out.println("Executing second test case");
    System.out.println("---------------------------");
    System.out.println("First missing positive number is:"+result_test_case1);
    System.out.println("");
    System.out.println("End");
    System.out.println("---------------------------");
    System.out.println("");
    //executing third test case
    int result_test_case2 =  getFirstMissingPositive(testCaseArray2);
    System.out.println("Executing first test case");
    System.out.println("---------------------------");
    System.out.println("First missing positive number is:"+result_test_case2);
    System.out.println("");
    System.out.println("End");
    System.out.println("---------------------------");
    System.out.println("");
  }

  private static int getFirstMissingPositive(int[] input) {
    //marking all the negative number as zero.
    for(int i=0;i< input.length;i++)
    {
       if(input[i]<0)
         input[i]=0;
    }

    for(int i=0;i<input.length;i++)
    {
        int index= Math.abs(input[i])-1;
        if(index>=0 && index<=input.length-1)
        {
            if(input[index]==0)
              input[index]=Math.abs(input[i]) * -1;
            else
              input[index]=Math.abs(input[index])*-1;
        }
    }

    for(int i=0;i<input.length;i++)
    {
      if(input[i]>=0)
        return i+1;
    }

    return input.length+1;


  }

}

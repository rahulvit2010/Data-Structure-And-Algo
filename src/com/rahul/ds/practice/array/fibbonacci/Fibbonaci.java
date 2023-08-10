package com.rahul.ds.practice.array.fibbonacci;

import java.util.HashMap;
import java.util.Map;

public class Fibbonaci {

    public static void main(String args[])
    {

      int input=45;
        Map<Integer, Long> memoizationTable = new HashMap<>();
        long startTime = System.currentTimeMillis();
        long num= calculateFibonnaci(input-1,memoizationTable);
        //int num= calculateFibonnaciWithOutMemory(input-1);
        long endTime = System.currentTimeMillis();

        double timeTaken = (double) (endTime - startTime) / 1000.0;

        System.out.printf("Time taken by the function: %.6f seconds\n", timeTaken);
        System.out.println(num);
       // 0 1 1 2
    }

    private static int calculateFibonnaciWithOutMemory(int input)
    {
        if(input<=0)
            return 0;
        if(input==1)
            return 1;
        return calculateFibonnaciWithOutMemory(input-1)+ calculateFibonnaciWithOutMemory(input-2)+1;
    }
    private static long calculateFibonnaci(int n, Map<Integer, Long> memo) {
        if(n<=0)
            return 0;
        if(n==1)
            return 1;
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        long sum = calculateFibonnaci(n - 1, memo) + calculateFibonnaci(n - 2, memo)+1;
        memo.put(n, sum);
        return sum;

    }
}

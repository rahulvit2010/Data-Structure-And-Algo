package com.rahul.ds.practice.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String [] args)
    {
         int input []= new int[]{4,5,6,9,3,7,18,17,16,8};
         //int target=17;
        //int target=19;
        int target=2;
        int result []= getTwoSum(input,target);
        boolean allZero=Arrays.stream(result).allMatch(value->value==0);
        if(allZero)
            System.out.println("there are no two element present, which sums up to target ");
        else
            Arrays.stream(result).forEach(System.out::println);
    }

    public static int[] getTwoSum(int[] input,int target)
    {
        int result[] = new int[2];
        //take map to keep trak of integer and its count;
        Map<Integer,Integer> entries= new HashMap<>();
        for(int i=0;i<input.length;i++)
        {
            if(entries.containsKey(target-input[i]))
            {
                result[0]=input[i];
                result[1]=target-input[i];
                return result;
            }
            else
            {
                entries.put(input[i],i);
            }
        }
        return result;
    }


}

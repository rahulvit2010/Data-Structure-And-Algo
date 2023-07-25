package com.rahul.ds.practice.productArray;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String [] args)
    {
       int [] input = new int[]{1,2,3,4};
        int [] result = productExceptSelf(input);
        List<Integer> productArray = Arrays.stream(result).boxed().collect(Collectors.toList());
        System.out.print(productArray.toString());
    }


    public static int[] productExceptSelf(int[] nums) {

        int [] result = new int[nums.length];
        int temp=1;
        for(int i=0;i<nums.length;i++)
        {
            result[i]=temp;
            temp= temp*nums[i];
        }
        temp=1;
        for(int j= nums.length-1;j>=0;j--)
        {
            result[j]=temp* result[j];
            temp=temp* nums[j];
        }
   return result;
    }
}

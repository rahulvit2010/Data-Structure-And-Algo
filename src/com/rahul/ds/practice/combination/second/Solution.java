package com.rahul.ds.practice.combination.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String [] args)
    {
        int[] candidates= new int[]{10,1,2,7,6,1,5};
        int target=8;
        List<List<Integer>> result=  combinationSum2(candidates,target);
        System.out.println(result.toString());
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> bag = new ArrayList<>();
        int sum=0;

        Arrays.sort(candidates);

        combinationSumUtil(candidates,target,sum , result, bag,0);
        return result;
    }

    public static void combinationSumUtil(int[] candidates, int target, int sum,List<List<Integer>> result,List<Integer> bag,int i)
    {
        if(sum>target)
            return;


        if(sum==target)
        {
            result.add(new ArrayList<>(bag));
            return;
        }

        if(i==candidates.length)
        {
            return;
        }

        for(int j=i;j<candidates.length;j++)
        {
            if(j>i && candidates[j]==candidates[j-1]) continue;

            if(candidates[j]> target-sum) break;

            bag.add(candidates[j]);
            combinationSumUtil(candidates,target,sum+candidates[j],result,bag,j+1);
            bag.remove(bag.size()-1);
        }

    }
}

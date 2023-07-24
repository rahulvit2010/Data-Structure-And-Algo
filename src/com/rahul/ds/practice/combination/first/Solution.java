package com.rahul.ds.practice.combination.first;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String args[])
    {
      //int []  candidates =new int[] {2,3,6,7};
        //int target = 7;
        int []  candidates =new int[] {2,3,5};
        int target = 8;
        List<List<Integer>> result = combinationSum(candidates,target);
        System.out.println(result.toString());

    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> bag = new ArrayList<>();

        CombinationSumUtil(candidates,target,0,result,bag,0);
        return result;

    }

    private static void CombinationSumUtil(int[] candidates, int target, int i, List<List<Integer>> result, List<Integer> bag, int sum) {
        if(sum==target)
        {
            result.add(new ArrayList(bag));
            return;
        }
        if(sum>target)
            return;

        if(i==candidates.length)
            return;

        bag.add(candidates[i]);
        CombinationSumUtil(candidates,target,i,result,bag,sum+candidates[i]);
        bag.remove(bag.size()-1);
        CombinationSumUtil(candidates,target,i+1,result,bag,sum);
    }
}

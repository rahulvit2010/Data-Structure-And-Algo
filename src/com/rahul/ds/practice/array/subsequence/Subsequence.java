package com.rahul.ds.practice.array.subsequence;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {
    public static void main(String args[])
    {
        List<Integer> bags= new ArrayList<>();
        int [] nums= new int[]{1,8,4,6,2,3,9};
        int target=12;
       // printAllSubsequence(nums,0,bags);
        //findSubsequencesMeetsToTarget(nums,0,bags,target,0);
        boolean result=findFirstSubsequencesMeetsToTarget(nums,0,bags,target,0);

    }

    private static void printAllSubsequence(int[] nums, int i,List<Integer> bags) {
     if(i==nums.length)
     {
        System.out.println(bags.toString());
        return;
     }
        bags.add(nums[i]);
        printAllSubsequence(nums,i+1,bags);
        bags.remove(bags.size()-1);
        printAllSubsequence(nums,i+1,bags);

    }

    private static void findSubsequencesMeetsToTarget(int[] nums, int i,List<Integer> bags,int target,int sum)
    {
        if(sum>target)
            return;

        if(i==nums.length) {
            if(sum==target) {
                System.out.println(bags.toString());
            }
            return;
        }

        bags.add(nums[i]);
        findSubsequencesMeetsToTarget(nums,i+1,bags,target,sum+nums[i]);
        bags.remove(bags.size()-1);
        findSubsequencesMeetsToTarget(nums,i+1,bags,target,sum);
    }

    private static boolean findFirstSubsequencesMeetsToTarget(int[] nums, int i,List<Integer> bags,int target,int sum)
    {
        if(sum>target)
            return false;

        if(i==nums.length) {
            if(sum==target) {
                System.out.println(bags.toString());
                return  true;
            }
            return false;
        }

        bags.add(nums[i]);
        if(findFirstSubsequencesMeetsToTarget(nums,i+1,bags,target,sum+nums[i])==true)
            return true;
        bags.remove(bags.size()-1);
        return findFirstSubsequencesMeetsToTarget(nums,i+1,bags,target,sum);
    }
}

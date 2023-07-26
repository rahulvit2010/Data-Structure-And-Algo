package com.rahul.ds.practice.groupAnagram;

import java.util.*;

public class Solution {

    public static void main(String args[])
    {
        executingTestCase1();// String [] input= new String[]{"eat","tea","tan","ate","nat","bat"};
        executingTestCase2();// String [] input= new String[]{""}
        executingTestCase3();// String [] input= new String[]{"a"}
    }

    private static void executingTestCase3() {
        System.out.println("Starting: the Test case 2");
        String [] input= new String[]{"a"};
        List<List<String>> result=groupAnagrams(input);
        System.out.println(result);
        System.out.println("Ended: Test Case 2");
    }

    private static void executingTestCase2() {
        System.out.println("Starting: the Test case 2");
        String [] input= new String[]{""};
        List<List<String>> result=groupAnagrams(input);
        System.out.println(result);
        System.out.println("Ended: Test Case 2");
    }

    private static void executingTestCase1() {
        System.out.println("Starting: the Test case 1");
        String [] input= new String[]{"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result=groupAnagrams(input);
        System.out.println(result);
        System.out.println("Ended: Test Case 1");

    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String,List<String>> map= new HashMap<String,List<String>>();
        for(int i=0;i<strs.length;i++)
        {

            String input= strs[i];
            int [] leader = new int[26];
            for(int j=0;j<input.length();j++)
            {
                int ascii_val=input.charAt(j);
                if(leader[ascii_val-97]==0)
                    leader[ascii_val-97]= leader[ascii_val-97] +1;
            }
            String leader_key = Arrays.toString(leader);

            if(map.containsKey(leader_key))
            {
                List<String> values=map.get(leader_key);
                values.add(input);
                map.put(leader_key,values);
            }
            else
            {
                List<String> value= new ArrayList<String>();
                value.add(input);
                map.put(leader_key,value );
            }
        }

        for(Map.Entry<String,List<String>> entry:map.entrySet())
        {
            result.add(entry.getValue());
        }

        return result;
    }
}

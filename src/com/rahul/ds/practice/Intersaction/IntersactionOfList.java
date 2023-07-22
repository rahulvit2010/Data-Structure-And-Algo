package com.rahul.ds.practice.Intersaction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersactionOfList {

    public static void main(String [] args)
    {
        List<Integer> a= new ArrayList<>(Arrays.asList(10,15,30));
        List<Integer> b= new ArrayList<>(Arrays.asList(3,6,9,15,30));

        List<Integer> result= findInterSaction(a,b);

        result.stream().forEach(System.out::println);
    }

    private static List<Integer> findInterSaction(List<Integer> a, List<Integer> b) {
        for(int i=0;i<a.size();i++)
        {
            if(!b.contains(a.get(i)))
            {
              a.remove(i);
            }
        }
        return a;
    }
}

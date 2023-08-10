package com.rahul.ds.practice.array.bubblesort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String args[])
    {
      int input[] = new int[]{4,3,5,8,11,19,17,50,34,60,44,45,23,70,67};
        sort(input,"asc");
        System.out.println("ascending order");
        Arrays.stream(input).forEach(System.out::println);
        sort(input,"desc");
        System.out.println("descending order");
        Arrays.stream(input).forEach(System.out::println);

    }

    public static int[] sort(int input [],String order)
    {
        for(int i=0;i<input.length-1;i++)
        {
            for(int j=0;j<input.length-i-1;j++)
            {
                if(order.equalsIgnoreCase("asc"))
                {
                    if(input[j]>input[j+1])
                    {
                       int temp= input[j];
                       input[j]=input[j+1];
                       input[j+1]=temp;

                    }
                }
                else
                {
                    if(input[j]<input[j+1])
                    {
                        int temp= input[j];
                        input[j]=input[j+1];
                        input[j+1]=temp;

                    }
                }
            }
        }
        return input;
    }
}

package com.rahul.ds.practice.mergeSort;

import java.util.Arrays;

public class mergeSort {

    public static void  main(String [] args)
    {
        int [] unsortedArray= new int[]{10,24,56,34,2,8,78,45,56,23,90,76,35};
        sort(unsortedArray,0,unsortedArray.length-1);
        Arrays.stream(unsortedArray).forEach(System.out::println);
    }

    private static void sort(int[] unsortedArray,int start, int end) {
     if(start<end)
     {
         int mid= start+(end-start)/2;
         sort(unsortedArray,start,mid);
         sort(unsortedArray,mid+1,end);
         merge(unsortedArray,start,mid, end);
     }

    }

    private static void merge(int[] unsortedArray, int start, int mid, int end) {
       int n1= mid-start+1;
       int n2= end-mid;
        int [] left= new int[n1];
        int [] right= new int[n2];

        for(int i=0;i<n1;i++)
        {
            left[i]=unsortedArray[start+i];
        }

        for(int j=0;j<n2;j++)
        {
            right[j]=unsortedArray[mid+1+j];
        }

        int i=0,j=0,k=start;

       while(i<n1 && j<n2)
       {
           if(left[i]<=right[j])
           {
               unsortedArray[k]=left[i];
               i++;k++;
           }
           else
           {
               unsortedArray[k]=right[j];
               j++; k++;
           }
       }
       while(i<n1)
       {
           unsortedArray[k]=left[i];
           k++;i++;
       }

        while(j<n2)
        {
            unsortedArray[k]=right[j];
            k++;j++;
        }
    }
}

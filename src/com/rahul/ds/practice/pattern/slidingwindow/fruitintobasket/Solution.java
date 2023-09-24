package com.rahul.ds.practice.pattern.slidingwindow.fruitintobasket;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  public static void main(String args[])
  {
    ExecuteFirstTestCase();

    ExecuteSecondTestCase();

    ExecuteThirdTestCase();

  }

  private static void ExecuteThirdTestCase() {
    int [] fruits = new int[]{1,2,3,2,2};
    int max_fruit_in_basket= getMaximumFruitFromTheBasket(fruits);
    System.out.println("Maximum nums of fruits in both the basket are "+ max_fruit_in_basket);
  }

  private static void ExecuteSecondTestCase() {
    int [] fruits = new int[]{0,1,2,2};
    int max_fruit_in_basket= getMaximumFruitFromTheBasket(fruits);
    System.out.println("Maximum nums of fruits in both the basket are "+ max_fruit_in_basket);
  }

  private static void ExecuteFirstTestCase() {
    int [] fruits = new int[]{1,2,1};
    int max_fruit_in_basket= getMaximumFruitFromTheBasket(fruits);
    System.out.println("Maximum nums of fruits in both the basket are "+ max_fruit_in_basket);
  }

  private static int getMaximumFruitFromTheBasket(int[] fruits) {
    int window_start=0;
    int max_fruit=Integer.MIN_VALUE;
    Map<Integer,Integer> freq_by_fruit_type = new HashMap<>();

    for(int window_end=0;window_end<fruits.length;window_end++)
    {
          if(freq_by_fruit_type.containsKey(fruits[window_end]))
            freq_by_fruit_type.put(fruits[window_end], freq_by_fruit_type.get(fruits[window_end])+1);
          else
            freq_by_fruit_type.put(fruits[window_end],1);

          while(freq_by_fruit_type.size()>2)
          {
             int count = freq_by_fruit_type.get(fruits[window_start])-1;
             if(count==0)
               freq_by_fruit_type.remove(fruits[window_start]);
             else
               freq_by_fruit_type.put(fruits[window_start],count);

             window_start++;
          }

      max_fruit= Math.max(max_fruit,window_end-window_start+1) ;
    }
    return max_fruit;
  }

}

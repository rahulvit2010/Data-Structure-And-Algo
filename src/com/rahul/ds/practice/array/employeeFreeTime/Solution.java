package com.rahul.ds.practice.array.employeeFreeTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

  public static void main(String[] args) {
   executeTestCase1();
   executeTestCase2();
  }

  private static void executeTestCase1() {
    List<List<Interval>> schedule= new ArrayList<>();
    Interval inv= new Interval(2,3);
    Interval inv1= new Interval(7,9);
    schedule.add(Arrays.asList(inv,inv1));
    Interval inv2= new Interval(1,4);
    Interval inv3= new Interval(6,7);
    schedule.add(Arrays.asList(inv2,inv3));

    List<Interval> ans= employeeFreeTime(schedule);
    System.out.println("**************************************");
    for(Interval answer: ans)
    {
      System.out.println("start "+answer.start +" end "+ answer.end);
    }

  }

  private static void executeTestCase2() {
    List<List<Interval>> schedule= new ArrayList<>();
    Interval inv_schedule1= new Interval(1,3);
    Interval inv1_schedule1= new Interval(6,9);
    Interval inv2_schedule1= new Interval(10,11);
    schedule.add(Arrays.asList(inv_schedule1,inv1_schedule1,inv2_schedule1));
    Interval inv3_schedule1= new Interval(3,4);
    Interval inv4_schedule1= new Interval(7,12);
    schedule.add(Arrays.asList(inv3_schedule1,inv4_schedule1));
    Interval inv5_schedule1= new Interval(1,3);
    Interval inv6_schedule1= new Interval(7,10);
    schedule.add(Arrays.asList(inv5_schedule1,inv6_schedule1));
    Interval inv7_schedule1= new Interval(1,4);
    Interval inv8_schedule1= new Interval(7,10);
    Interval inv9_schedule1= new Interval(11,12);
    schedule.add(Arrays.asList(inv7_schedule1,inv8_schedule1,inv9_schedule1));

    List<Interval> ans= employeeFreeTime(schedule);
    System.out.println("**************************************");
    for(Interval answer: ans)
    {
      System.out.println("start "+answer.start +" end "+ answer.end);
    }

  }

  public static List<Interval> employeeFreeTime(List <List <Interval>> schedule) {
    List<Interval> ans = new ArrayList<Interval>();
    List<Interval> intervals= new ArrayList<>();
    for(int i=0;i< schedule.size();i++)
    {
      intervals.addAll(schedule.get(i));
    }

    Collections.sort(intervals,(a,b)->a.getStart()-b.getStart());

    Interval bucket= intervals.get(0);
    for(int i=0;i<intervals.size();i++)
    {
      if(bucket.getEnd()<intervals.get(i).getStart())
      {
        ans.add(new Interval(bucket.getEnd(),intervals.get(i).getStart()));
        bucket=intervals.get(i);
      }
      else
      {
        bucket= bucket.getEnd()<intervals.get(i).getEnd()?intervals.get(i):bucket;
      }
    }
    return ans;
  }

}

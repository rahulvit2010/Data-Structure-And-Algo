package com.rahul.ds.practice.array.palidrome;

public class Palidrome {

    public static void main(String [] args)
    {
        String s ="malayalam";
        System.out.println("String " + s + " is Palidrome?");
        boolean result=checkifPalidrome(s,0,s.length()-1);
        System.out.println("Ans------> " + result );


    }

    private static boolean checkifPalidrome(String s, int start, int end) {
          if(start>=end)
              return true;

            if(s.charAt(start)!=s.charAt(end)) {
                return false;
            }

        return checkifPalidrome(s, start + 1, end - 1);


    }
}

package com.rahul.ds.practice.array.matchingsubsequence;


import java.util.ArrayList;
import java.util.List;

class Node
{
  String word;
  int index;

  public Node(String word, int index) {
    this.word = word;
    this.index = index;
  }

  public String getWord() {
    return word;
  }

  public int getIndex() {
    return index;
  }
}
public class Solution {

  public static void main(String[] args) {
    String input="abcde";
    String [] words= new String[]{"a","bb","acd","ace"};
    int result=numMatchingSubseq(input,words);
    System.out.println("result = " + result);
  }

  public static int numMatchingSubseq(String s, String[] words) {
    ArrayList<Node>[] dictonary= new ArrayList[26];
    int result=0;
    // now place the words on the index in dictonary
    for(int i=0;i< words.length;i++)
    {
      if(dictonary[words[i].charAt(0)-'a']==null)
      {
        dictonary[words[i].charAt(0)-'a']= new ArrayList<Node>();
      }
      dictonary[words[i].charAt(0)-'a'].add(new Node(words[i],0));
    }

    char[] sequence=s.toCharArray();
    for(int j=0;j<sequence.length;j++)
    {
      if(dictonary[sequence[j]-'a']!=null)
      {
        List<Node>  prev_bucket= dictonary[sequence[j]-'a'];
        dictonary[sequence[j]-'a']= new ArrayList<>();
        for(int k=0;k<prev_bucket.size();k++)
        {
          Node node= prev_bucket.get(k);
          int nextIndex=node.index+1;
          if(nextIndex== node.word.length())
          {
            result++;
          }
          else
          {
            if(dictonary[node.word.charAt(nextIndex)-'a']==null)
              dictonary[node.word.charAt(nextIndex)-'a']= new ArrayList<>();
            dictonary[node.word.charAt(nextIndex)-'a'].add(new Node(node.word,nextIndex));
          }
        }
      }
    }
    return result;
  }

}

package com.rahul.ds.practice.linkedlist.singly.mergeksortedlist;

import com.rahul.ds.practice.linkedlist.singly.Node;
import com.rahul.ds.practice.linkedlist.singly.impl.LinkedList;

public class Solution {

  public static void main(String[] args) {
    LinkedList list1 = new LinkedList();
    System.out.println("1.creating first linked list");
    list1.push(1);
    list1.push(2);
    list1.push(4);
    list1.printLinkedList();
    System.out.println("2.creating second linked list");
    LinkedList list2 = new LinkedList();
    list2.push(1);
    list2.push(3);
    list2.push(4);
    list2.printLinkedList();

    System.out.println("3.creating second linked list");
    LinkedList list3 = new LinkedList();
    list3.push(20);
    list3.push(5);
    list3.push(30);
    list3.printLinkedList();

    Node[] input = new Node[3];
    input[0]=list1.getHead();
    input[1]=list2.getHead();
    input[2]= list3.getHead();
    Node head=partition(input,0,input.length-1);

    LinkedList result= new LinkedList();
    result.printLinkedList(head);
  }

  public static Node partition(Node[] lists , int start, int end)
  {
    if(start==end) return lists[start];

    if(start<end)
    {
      int mid= (start+end)/2;
      Node list1=partition(lists,start,mid);
      Node list2=partition(lists,mid+1,end);
      return mergeTwoLists(list1, list2);
    }
    else
    {
      return null;
    }
  }
  public static Node mergeTwoLists(Node list1, Node list2) {
    Node result= new Node();
    Node head= result;
    while(list1!=null && list2!=null) {
      if(list1.getValue()<list2.getValue()) {
        result.setNext(list1);
        list1= list1.getNext();
        result= result.getNext();
      }
      else {
        result.setNext(list2);
        list2= list2.getNext();
        result= result.getNext();
      }
    }
    if(list1!= null) {
      result.setNext(list1);
    }

    if(list2!= null) {
      result.setNext(list2);
    }
    return head.getNext();
  }

}

package com.rahul.ds.practice.linkedlist.mergetwosortedlist;

import com.rahul.ds.practice.linkedlist.Node;
import com.rahul.ds.practice.linkedlist.impl.LinkedList;

public class Solution {

  public static void main(String[] args) {
    System.out.println("************Executing first test Case**************");
    executeFirstTestCase();
    System.out.println("************Executing second test Case**************");
    executeSecondTestCase();
    System.out.println("************Executing third test Case**************");
    executeThirdTestCase();

  }

  private static void executeThirdTestCase() {
    LinkedList list1 = new LinkedList();
    System.out.println("1.creating first linked list");
    list1.printLinkedList();
    System.out.println("2.creating second linked list");
    LinkedList list2 = new LinkedList();
    list2.push(0);
    list2.printLinkedList();
    Node result=mergeTwoLists(list1.getHead(),list2.getHead());
    System.out.println("After the merging linked list is as below..");
    LinkedList result_list= new LinkedList();
    result_list.printLinkedList(result);
    System.out.println("*************************************************");
  }

  private static void executeSecondTestCase() {
    LinkedList list1 = new LinkedList();
    System.out.println("1.creating first linked list");
    list1.printLinkedList();
    System.out.println("2.creating second linked list");
    LinkedList list2 = new LinkedList();
    list2.printLinkedList();
    Node result=mergeTwoLists(list1.getHead(),list2.getHead());
    System.out.println("After the merging linked list is as below..");
    LinkedList result_list= new LinkedList();
    result_list.printLinkedList(result);
    System.out.println("*************************************************");
  }

  private static void executeFirstTestCase() {
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
    Node result=mergeTwoLists(list1.getHead(),list2.getHead());
    System.out.println("After the merging linked list is as below..");
    LinkedList result_list= new LinkedList();
    result_list.printLinkedList(result);
    System.out.println("*************************************************");
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

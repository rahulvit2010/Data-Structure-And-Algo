package com.rahul.ds.practice.linkedlist.removenthnodefromend;

import com.rahul.ds.practice.linkedlist.Node;
import com.rahul.ds.practice.linkedlist.impl.LinkedList;

public class Solution {

  public static void main(String[] args) {

    executeFirstTestCase(2);
    executeSecondTestCase(1);
    executeThirdTestCase(1);
  }
  private static void executeThirdTestCase(int n) {
    LinkedList list = new LinkedList();
    System.out.println("***************creating the linked list without cycle*****************");
    list.push(1);
    list.push(2);
    list.printLinkedList();
    System.out.println("**************************");
    Node head=removeNthFromEnd(list.getHead(),n);
    System.out.println("After removal of "+ n+"th node from the end, linked list look like as below");
    list.printLinkedList();
  }
  private static void executeSecondTestCase(int n) {
    LinkedList list = new LinkedList();
    System.out.println("***************creating the linked list without cycle*****************");
    list.push(1);
    list.printLinkedList();
    System.out.println("**************************");
    Node head=removeNthFromEnd(list.getHead(),n);
    System.out.println("After removal of "+ n+"th node from the end, linked list look like as below");
    list.printLinkedList();
  }

  private static void executeFirstTestCase(int n) {
    LinkedList list = new LinkedList();
    System.out.println("***************creating the linked list without cycle*****************");
    list.push(1);
    list.push(2);
    list.push(3);
    list.push(4);
    list.push(5);
    list.printLinkedList();

    System.out.println("**************************");

    Node head=removeNthFromEnd(list.getHead(),n);
    System.out.println("After removal of "+ n+"th node from the end, linked list look like as below");
    list.printLinkedList();
  }

  public static Node removeNthFromEnd(Node head, int n) {

    Node first= head;
    Node second= head;
    for(int i=0;i<n;i++)
      second= second.getNext();

    if(second==null)
      return head.getNext();

    while(second.getNext()!=null)
    {
      first= first.getNext();
      second= second.getNext();
    }
    first.setNext(first.getNext().getNext());
    return head;
  }
}

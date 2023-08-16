package com.rahul.ds.practice.linkedlist.LinkedListCycle;

import com.rahul.ds.practice.linkedlist.Node;
import com.rahul.ds.practice.linkedlist.impl.LinkedList;

public class LinkedListCycle {

  public static void main(String[] args) {
    executeFirstTestCase();
    executeSecondTestCase();
    executeThirdTestCase();
    executeFourthTestCase();

  }

  private static void executeFourthTestCase() {
    LinkedList list = new LinkedList();
    createLinkedListWithCycle(list);
    System.out.println("finding the length of the cycle");
    int length = getlengthOfCycle(list);
    System.out.println("length of the cycle is "+length);
  }

  private static void executeThirdTestCase() {
    LinkedList list = new LinkedList();
    createLinkedListWithCycle(list);
    System.out.println("finding the first node of the cycle");
    Node node = getFirstNodeOfCycle(list);
    if(node==null)
      System.out.println("there is no cycle");
    else
      System.out.println("First Node of the cycle is "+node.getValue());
  }

  private static void executeSecondTestCase() {
    LinkedList list= new LinkedList();
    createLinkedListWitOutCycle(list);
    boolean result=hasCycle(list.getHead());
    System.out.println("LikedList Has Cycle:: "+result);
  }

  private static void createLinkedListWitOutCycle(LinkedList list) {
    System.out.println("***************creating the linked list without cycle*****************");
    list.push(12);
    list.push(13);
    list.push(5);
    list.push(90);
    list.push(87);
  }

  private static void executeFirstTestCase() {
    LinkedList list = new LinkedList();
    createLinkedListWithCycle(list);
    boolean result=hasCycle(list.getHead());
    System.out.println("LikedList Has Cycle:: "+result);
    System.out.println("finding the first node of the cycle");
    Node node = getFirstNodeOfCycle(list);
    if(node==null)
      System.out.println("there is no cycle");
    else
      System.out.println("First Node of the cycle is "+node.getValue());

  }

  private static Node getFirstNodeOfCycle(LinkedList list){
    Node head= list.getHead();
    Node slow= head;
    Node fast= head;

    while(fast!=null && fast.getNext()!=null)
    {
      fast= fast.getNext().getNext();
      slow= slow.getNext();
      if (slow==fast)
        break;
    }

    if(slow!=fast)
      return null;

    slow=head;
    while(slow !=fast)
    {
      slow=slow.getNext();
      fast=fast.getNext();
    }
    return slow;
  }

  private static int getlengthOfCycle(LinkedList list){
    Node head= list.getHead();
    Node slow= head;
    Node fast= head;

    while(fast!=null && fast.getNext()!=null)
    {
      fast= fast.getNext().getNext();
      slow= slow.getNext();
      if (slow==fast)
        break;
    }

    if(slow!=fast)
      return 0;

    int length=1;
    Node temp=slow;
    while(temp.getNext()!=slow)
    {
      length++;
      temp=temp.getNext();
    }
    return length;
  }

  private static void createLinkedListWithCycle(LinkedList list) {
    System.out.println("***************creating the linked list with cycle*****************");
    list.push(12);
    list.push(13);
    list.push(5);
    list.push(90);
    list.push(87);
    Node node=list.get(0);
    list.getTail().setNext(node);
  }

  public static boolean hasCycle(Node head) {
  Node slow= head;
  Node fast= head;

  while(fast!=null && fast.getNext()!=null)
  {
   fast= fast.getNext().getNext();
   slow= slow.getNext();
   if (slow==fast)
     return true;
  }
    return false;
  }

}

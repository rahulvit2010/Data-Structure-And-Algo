package com.rahul.ds.practice.linkedlist.LinkedListCycle;

import com.rahul.ds.practice.linkedlist.Node;
import com.rahul.ds.practice.linkedlist.impl.LinkedList;

public class LinkedListCycle {

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    executeFirstTestCase(list);
    executeSecondTestCase(list);

  }

  private static void executeSecondTestCase(LinkedList list) {
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

  private static void executeFirstTestCase(LinkedList list) {
    createLinkedListWithCycle(list);
    boolean result=hasCycle(list.getHead());
    System.out.println("LikedList Has Cycle:: "+result);
  }

  private static void createLinkedListWithCycle(LinkedList list) {
    System.out.println("***************creating the linked list with cycle*****************");
    list.push(12);
    list.push(13);
    list.push(5);
    list.push(90);
    list.push(87);
    Node node=list.get(2);
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

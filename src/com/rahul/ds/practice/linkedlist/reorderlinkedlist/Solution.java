package com.rahul.ds.practice.linkedlist.reorderlinkedlist;


import com.rahul.ds.practice.linkedlist.Node;
import com.rahul.ds.practice.linkedlist.impl.LinkedList;

public class Solution {

  public static void main(String[] args) {
    LinkedList list= new LinkedList();
    list.push(1);
    list.push(2);
    list.push(3);
    list.push(4);
    list.push(5);

    System.out.println("//Printing the linked List");
    list.printLinkedList();
    reorderList(list.getHead());

    System.out.println("After Reordering");
    list.printLinkedList();

  }

  public static void reorderList(Node head) {

    Node slow= head;
    Node fast= slow.getNext();

    while(fast !=null && fast.getNext()!=null)
    {
      fast= fast.getNext().getNext();
      slow= slow.getNext();
    }

//reverse the linked list from half

    Node second= slow.getNext();
    Node prev=null;
    slow.setNext(null);
    while(second !=null)
    {
      Node tmp= second.getNext();
      second.setNext(prev);
      prev= second;
      second= tmp;
    }

    second= prev;
    Node curr=head;

    while(second!=null)
    {
      Node left = curr.getNext();
      Node right= second.getNext();
      curr.setNext(second);
      second.setNext(left);
      curr= left;
      second= right;
    }
  }

  }


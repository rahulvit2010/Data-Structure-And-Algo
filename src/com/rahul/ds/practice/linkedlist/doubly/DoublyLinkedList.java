package com.rahul.ds.practice.linkedlist.doubly;

import com.rahul.ds.practice.linkedlist.singly.Node;

public class DoublyLinkedList {
  int size;
  DoublyNode head;
  DoublyNode tail;

  public DoublyLinkedList() {
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public DoublyNode getHead() {
    return head;
  }

  public void setHead(DoublyNode head) {
    this.head = head;
  }

  public DoublyNode getTail() {
    return tail;
  }

  public void setTail(DoublyNode tail) {
    this.tail = tail;
  }

  public void push(int value)
  {
    DoublyNode node=  new DoublyNode(value);
        if(this.size==0)
        {
         this.head=node;
         this.tail= node;
        }
        else
        {
          this.tail.setNext(node);
          node.setPrev(tail);
          tail= node;
        }
        this.size++;
  }

  public void printTheList()
  {
      if(this.size==0)
      {
        System.out.println("No data to print");
        return;
      }
     DoublyNode curr= head;

      while(curr!= null)
      {
        System.out.print(curr.getValue() +"-->");
        curr=curr.getNext();
      }
      System.out.print("Null");
      System.out.println();
  }

  public void printInReverseOrder()
  {
    if(this.size==0)
    {
      System.out.println("No data to print");
      return;
    }
    DoublyNode curr= tail;
    while(curr!=null)
    {
      System.out.print(curr.getValue()+"-->");
      curr= curr.getPrev();
    }
    System.out.print("Null");
    System.out.println();
  }

  public DoublyNode pop()
  {
    if(this.size==0)
      return null;

    DoublyNode node = tail;
    if(size==1)
    {
       head= null;
       tail= null;
    }
    else
    {
      this.tail= this.tail.getPrev();
      this.tail.setNext(null);
    }
   this.size--;
   return node;
  }
}

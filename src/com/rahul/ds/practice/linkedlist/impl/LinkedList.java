package com.rahul.ds.practice.linkedlist.impl;

import com.rahul.ds.practice.linkedlist.Node;

public class LinkedList {
  int size;
  Node head;
  Node tail;

  LinkedList() {
  }
  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public Node getHead() {
    return head;
  }

  public void setHead(Node head) {
    this.head = head;
  }

  public Node getTail() {
    return tail;
  }

  public void setTail(Node tail) {
    this.tail = tail;
  }

  public void push( int value)
  {
    Node node= new Node(value);
    if(size==0)
    {
      head= node;
      tail= node;
    }
    else
    {
      tail.setNext(node);
      tail= node;
    }
    size++;
  }

  public Node pop()
  {
    if(size==0)
    {
      System.out.println("Linked list is Empty");
      return null;
    }
    Node node= this.tail;
    if(size==1)
    {
     this.head=null;
     this.tail= null;
    }
    else
    {
      Node curr= head;
      while(curr.getNext().getNext()!=null)
      {
        curr= curr.getNext();
      }
      this.tail= curr;
      curr.setNext(null);
    }
    size--;
   return node;
  }

  public Node get(int index)
  {
    int count=0;
    Node curr= this.head;
    while(curr !=null && count<index)
    {
      curr= curr.getNext();
      count++;
    }
    if(curr!=null)
    {
      return curr;
    }
    else
    {
      return null;
    }
  }
  public void set(int value, int index)
  {
    Node node= this.get(index);
    if(node !=null) {
      node.setValue(value);
    }
  }

  public int search(int value)
  {
    Node curr= this.head;
    int index=0;
    while(curr !=null)
    {
      if(curr.getValue()==value)
      {
        return index;
      }
      else
      {
        index++;
        curr= curr.getNext();
      }
    }
    return -1;
  }

  public int insert(int index,int value)
  {
    if(index<0 && index>size)
    {
      return -1;
    }
    if(index==this.size)
    {
      this.push(value);
      return 1;
    }

    Node node= new Node(value);
    Node currNode = this.get(index);
    Node prevNode= this.get(index-1);
    prevNode.setNext(node);
    node.setNext(currNode);
    return 1;
  }

  public void printLinkedList()
  {
    if(size==0)
    {
      System.out.println("Linked list is Empty");
    }
    else
    {
      Node curr= head;
      while(curr!=null && curr.getNext() !=null)
      {
        System.out.print(curr.getValue() +"---->");
        curr= curr.getNext();
      }
      if(curr.getNext()==null)
      {
        System.out.print( curr.getValue()+"---->"+"NULL");
      }
    }
    System.out.println("");
  }

  public Node pop(int index)
  {
    Node curr= head;
    int count=0;
    if(index<0 && index>size)
    {
      return null;
    }
    else
    {
      while(curr !=null && count<index)
      {
        curr= curr.getNext();
        count++;
      }
      if(count==index)
      {
        Node prev_node= this.get(index-1);
        prev_node.setNext(curr.getNext());

      }
    }
    return curr;
  }

}

package com.rahul.ds.practice.linkedlist.singly;

public class Node {

  private int value;

  private Node next;

  public Node()
  {

  }
  public Node(int value){
    this.value=value;
    this.next=null;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public int getValue() {
    return value;
  }

  public Node getNext() {
    return next;
  }
}

package com.rahul.ds.practice.linkedlist.doubly;

import com.rahul.ds.practice.linkedlist.singly.Node;

public class DoublyNode {

  private int value;

  private DoublyNode next;

  private DoublyNode prev;

  public DoublyNode()
  {

  }
  public DoublyNode(int value){
    this.value=value;
    this.next=null;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public DoublyNode getNext() {
    return next;
  }

  public void setNext(DoublyNode next) {
    this.next = next;
  }

  public DoublyNode getPrev() {
    return prev;
  }

  public void setPrev(DoublyNode prev) {
    this.prev = prev;
  }
}

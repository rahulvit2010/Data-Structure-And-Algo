package com.rahul.ds.practice.linkedlist.doubly;

public class DoublyLinkedListTest {

  public static void main(String[] args) {
    DoublyLinkedList list= new DoublyLinkedList();
    System.out.println("**********Pushing the elements in Doubly Linked list**********");
    list.push(10);
    list.push(20);
    list.push(30);
    list.push(22);
    list.push(33);
    list.push(28);
    System.out.println("**********printing the elements in Doubly Linked list**********");
    list.printTheList();
    System.out.println("**********printing the list in reverse order**********");
    list.printInReverseOrder();
    System.out.println("**********Deleting the elements from the end, Now the List **********");
    list.pop();
    list.printTheList();


  }

}

package com.rahul.ds.practice.linkedlist.singly.impl;

import com.rahul.ds.practice.linkedlist.singly.Node;

public class LikedListTest {

  public static void main(String[] args) {

    LinkedList list= new LinkedList();

    System.out.println("1:************ Pushing the Elements in the Linked List ************");
    list.push(12);
    list.push(13);
    list.push(5);
    list.push(90);
    list.push(87);
    System.out.println("2:************ printing the Linked List ************");
    list.printLinkedList();

    System.out.println("3:************ Pop the element in the Linked List ************");
    list.pop();
    list.printLinkedList();

    System.out.println("************ Getting the Node at Index 2 ************");
    Node node=list.get(2);
    System.out.println(node.getValue());

    System.out.println("************ Setting the Value for Node at Index 2************");
    list.set(25,2);

    list.printLinkedList();

    list.insert(2,68);
    System.out.println("************ Adding new Node at Index 2 with value 68 ************");
    list.printLinkedList();

    list.pop(2);
    System.out.println("************ Deleting the node from the index 2 ************");
    list.printLinkedList();

    System.out.println("************ Reverse the linked list ************");
    list.reverseList();
    list.printLinkedList();



  }

}

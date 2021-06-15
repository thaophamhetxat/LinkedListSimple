package com.codegym;

public class MyLinkedListTest {

    public static void main(String[] args) {
        System.out.println(" TEST ");
        MyLinkedList ll= new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.add(3,5);
        ll.printList();

    }
}

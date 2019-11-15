package com.study.code;

import java.io.Serializable;
import java.util.Scanner;

public class LinkedList {

    Node start = null;

    public void traverse(){
        Node refPtr = start;
        System.out.println("========Linked List is:========");
        System.out.print("Start->");
        while( refPtr != null) {
            System.out.print(refPtr.data+"->");
            refPtr = refPtr.next;
        }
        System.out.println("null");

    }

    public void insertAtStart(int n){
        Node newNode = new Node(n);
        newNode.next = start;
        start = newNode;
    }

    public void insertAtEnd(int n){

        Node newNode = new Node(n);
        // if linked list is empty add node directly to starting.
        if(start == null) {
            start = newNode;
            return;
        }
        Node refPtr = start;

        // traverse to last node.
        while( refPtr.next != null ) {
            refPtr = refPtr.next;
        }

        // add after last node.
        refPtr.next = newNode;
    }

    public void removeFromStart(){
        if( start != null ){
            start = start.next;
        }
    }

    public void removeFromEnd(){

        if( start == null || start.next == null) {
            start = null;
            return;
        }

        Node refPtr = start;
        while(refPtr.next.next != null ){
            refPtr = refPtr.next;
        }
        refPtr.next = null;

    }

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        LinkedList ll = new LinkedList();

        int choice = 0;
        int number = 0;

        do {

            System.out.println("==========Linked List==========");
            System.out.println("0. Exit");
            System.out.println("1. Print the List");
            System.out.println("2. Add at start of List");
            System.out.println("3. Add at end of List");
            System.out.println("4. Remove from start of List");
            System.out.println("5. Remove from end of List");
            System.out.print("Enter Your Choice:");
            choice = in.nextInt();

            switch(choice) {
                case 1:
                    ll.traverse();
                    break;
                case 2:
                    System.out.print("Enter Number to insert:");
                    number = in.nextInt();
                    ll.insertAtStart(number);
                    ll.traverse();
                    break;
                case 3:
                    System.out.print("Enter Number to insert:");
                    number = in.nextInt();
                    ll.insertAtEnd(number);
                    ll.traverse();
                    break;
                case 4:
                    ll.removeFromStart();
                    ll.traverse();
                    break;
                case 5:
                    ll.removeFromEnd();
                    ll.traverse();
                    break;
                default : break;

            }
        }
        while (choice != 0);

    }
}

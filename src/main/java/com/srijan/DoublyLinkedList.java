package com.srijan;

import java.util.*;

public class DoublyLinkedList {

    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode{
        private int data;
        private ListNode next;
        private ListNode prev;

        public ListNode(int data){
            this.data = data;
        }
    }
    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    public int length(){
        return length;
    }
    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            head = newNode;
        }else {
            tail.next = newNode;
        }
        newNode.prev = tail;
        tail = newNode;
        length++;
    }
    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
             tail = newNode;
        }else {
            head.prev = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    // Delete First
    public ListNode deleteFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = head;
        if(head == tail){
            tail = null;
        }else {
            head.next.prev = null;
        }
        head = head.next;
        temp.next = null;
        length--;
        return temp;
    }
    public ListNode deleteLast(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = tail;
        if(head == tail){
            head = null;
        }else {
            tail.prev.next = null;
        }
        tail = tail.prev;
        temp.prev = null;
        length--;
        return temp;
    }
    public void displayForward(){
        if(head == null){
            return;
        }
        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.data + "--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void displayBackward(){
        if(tail == null){
            return;
        }
        ListNode temp = tail;
        while (temp != null){
            System.out.print(temp.data + "--> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList dl1 = new DoublyLinkedList();
        dl1.insertLast(1);
        dl1.insertLast(10);
        dl1.insertLast(15);
        dl1.insertLast(25);
        System.out.println("Deleted First Element "+ dl1.deleteFirst().data);
        System.out.println("Deleted Last Element " + dl1.deleteLast().data);

        dl1.displayForward();
        dl1.displayBackward();


        System.out.println("------------------");

        /*DoublyLinkedList dl2 = new DoublyLinkedList();
        dl2.insertFirst(1);
        dl2.insertFirst(10);

        dl2.displayForward();
        dl2.displayBackward();*/
    }
}

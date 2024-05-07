package com.srijan;

public class LoopLinkedList {
    static ListNode head;
    private static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void display(){
        ListNode current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("null");
    }
    public  boolean detectLoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while(fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(slowPtr == fastPtr){
                return true;
            }
        }
        return false;
    }
    public ListNode detectLoop1(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while (fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(slowPtr == fastPtr){
                return getStartingNode(slowPtr);
            }
        }
        return null;
    }
    //find start of a loop in a Singly Linked List
    public ListNode getStartingNode(ListNode slowPtr){
        ListNode temp = head;
        while (slowPtr != temp){
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        return temp;
    }
    public void removeLoop(){
        ListNode temp = detectLoop1();
        ListNode first = temp;
        temp = temp.next;
        while(first.data != temp.next.data){
            temp = temp.next;
        }
        temp.next = null;
    }
    public void display(ListNode head){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + "--> ");
            current = current.next;
        }
        System.out.print("null");
    }
    public void createALoopInLinkedList(){
        head = new ListNode(1);
        ListNode first = new ListNode(2);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(5);
        ListNode fifth = new ListNode(6);
        ListNode sixth = new ListNode(7);
        ListNode seventh = new ListNode(8);
        head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = third;
    }
    public static void main(String[] args) {
        LoopLinkedList l1 = new LoopLinkedList();
        l1.createALoopInLinkedList();
        System.out.println(l1.detectLoop());
        System.out.println(l1.detectLoop1().data);
        l1.removeLoop();
       l1.display(head);
    }
}

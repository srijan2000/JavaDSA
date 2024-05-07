package com.srijan;

public class SinglyLinkedList1 {

    ListNode head;
    private static class ListNode{
        int data;
        ListNode next;
        private ListNode(int data){

            this.data = data;
            this.next = null;

        }
    }
    public void display(ListNode head){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + "--> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public void removeDuplicate(){
        if(head == null){
            return;
        }
        ListNode current = head;
        while (current != null && current.next != null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            }else {
                current = current.next;
            }
        }
    }
    public static void main(String[] args){
        SinglyLinkedList1 s11 = new SinglyLinkedList1();
        s11.head = new ListNode(1);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(2);
        ListNode fourth = new ListNode(3);
        ListNode fifth = new ListNode(3);
        ListNode sixth = new ListNode(4);

        s11.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;


        s11.display(s11.head);

        s11.removeDuplicate();

        s11.display(s11.head);
    }
}

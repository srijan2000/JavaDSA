package com.srijan;

public class SinglyLinkedList1{
    ListNode head;
    private class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
            this.next = null;

        }
    }
    public void add(int data){
        ListNode newNode = new ListNode(data);
        if(head == null){
            head = new ListNode(data);
        }else{
            ListNode current = head;
            while(current.next != null){
                current = current.next;

            }
            current.next = new ListNode(data);
        }
    }
    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + "-> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public void removeDuplicate(){
        if(head == null){
            System.out.println("List is null");
        }
        ListNode current = head;
        while(current != null && current.next != null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }

    }
    public ListNode reverseNode(){
        head = reverseNode(head);
        return head;
    }
    public ListNode reverseNode(ListNode head){
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }
        return prev;
    }

    public static void main(String[] args){
        SinglyLinkedList1 s1 = new SinglyLinkedList1();
        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(40);
        s1.add(40);

        s1.display();

        s1.removeDuplicate();
        s1.display();
        s1.reverseNode();

        s1.display();


    }
}
package com.srijan;

public class SinglyLinkedList {
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
        while(current != null){
            System.out.print(current.data + "--> ");
            current = current.next;
        }
        System.out.print("null");
    }
    public void insertAtStart(int value){
        ListNode current = new ListNode(value);

        current.next = head;
        head = current;

    }
    public void insertAtEnd(int value){

        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;

        }else {
            ListNode current = head;
            while(null != current.next){
                current= current.next ;
            }
            current.next = newNode;

        }

    }
    public void insertAtAnyPos(int pos, int value){
        ListNode node = new ListNode(value);
        if(pos == 1){
            node.next = head;
            head = node;
        }else {
            ListNode previous = head;
            int count = 1;
            while(count < pos-1 ){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            node.next = current;
            previous.next = node;
        }
    }
    public ListNode deleteFirst(){
        if(head == null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }
    public ListNode deleteLast(){
        if(head == null || head.next == null){
            return null;
        }
        ListNode temp = head;
        ListNode previous = null;
        while(temp.next != null){
            previous = temp;
            temp = temp.next;
        }
        previous.next = null;
        return temp;
    }
    public void deleteAtAnyPos(int pos){
        if(pos == 1){
            head = head.next;
        }else {
            ListNode prev = head;
            int count = 1;
            while(count < pos-1){
                prev = prev.next;
                count++;
            }
            ListNode current = prev.next;
            prev.next = current.next;
        }
    }

    public boolean searchKey(int value){
        ListNode current = head;
        while(current != null){
            if(current.data == value){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public ListNode reverseNode(ListNode head){
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    // find nth node from the end of a Singly Linked List
    public ListNode getNthNodeFromEnd(int n){
         if(head == null){
             return null;
         }
         if(n <= 0){
             throw new IllegalArgumentException("Invalid value : n = " + n);
         }
         ListNode mainPtr = head;
         ListNode refPtr = head;

         int count = 0;
         while (count < n){
             if(refPtr == null){
                 throw new IllegalArgumentException(n + " is greater than the number of nodes in the list ");
             }
             refPtr = refPtr.next;
             count ++;
         }
         while (refPtr != null){
             refPtr = refPtr.next;
             mainPtr = mainPtr.next;
         }
         return mainPtr;
    }

    public static void main (String[] args) {
        SinglyLinkedList s1 = new SinglyLinkedList();

        s1.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);



        s1.head.next = second;
        second.next = third;
        third.next = fourth;


        s1.insertAtEnd(50);
        s1.insertAtEnd(60);
        s1.insertAtEnd(70);
        s1.insertAtAnyPos(4,35);
        s1.deleteFirst();
        s1.deleteLast();
        s1.deleteAtAnyPos(3);
        System.out.println(s1.searchKey(30));
        s1.display(s1.head);
        System.out.println();

        ListNode nthNodeFromEnd = s1.getNthNodeFromEnd(2);
        System.out.println("Nth node from end is " + nthNodeFromEnd.data);
        System.out.println();
        ListNode reversal = s1.reverseNode(s1.head);
        s1.display(reversal);

    }
}


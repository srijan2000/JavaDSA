package com.srijan;

public class MergeList {
    ListNode head;
    private static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
            this.next = null;
        }

    }
    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
           head = newNode ;
        }
        else {
            ListNode temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;

        }
    }

   /* public static ListNode merge(ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (a != null && b != null){
            if(a.data <= b.data){
                tail.next = a;
                a = a.next;
            }
            else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if(a == null){
            tail.next = b;
        }
        else {
            tail.next = a;
        }
        return dummy.next;

    }*/
    public static ListNode merge(ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (a != null && b != null){
            if(a.data <= b.data){
                tail.next = a;
                a = a.next;
            }
            else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if(a == null){
            tail.next = b;
        }
        else {
            tail.next = a;

        }
        return dummy.next;
    }
    public void  display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }
    public void  display(ListNode head){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }
    public ListNode reverse(ListNode head){
        ListNode next = null;
        ListNode prev = null;
        ListNode current = head;
        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;


    }
    //Add Two Numbers
    public void add (ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;
        while (a != null || b!= null){
            int x = (a!= null) ? a.data : 0;
            int y = (b != null) ? b.data : 0;
            int sum = carry + x + y;
            carry = sum/10;
            tail.next = new ListNode(sum %10);
            tail = tail.next;
            if(a != null) a = a.next;
            if(b != null) b = b.next;
        }
        if(carry > 0){
            tail.next = new ListNode(carry);
        }
        dummy = dummy.next;
        while (dummy != null){
            System.out.print(dummy.data + "--> ");
            dummy = dummy.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        /*MergeList m1 = new MergeList();
        m1.insertLast(1);
        m1.insertLast(4);
        m1.insertLast(8);

        MergeList m2 = new MergeList();
        m2.insertLast(3);
        m2.insertLast(5);
        m2.insertLast(8);
        m2.insertLast(9);
        m2.insertLast(14);
        m2.insertLast(18);

        m1.display();
        m2.display();*/

        MergeList s1 = new MergeList();
        s1.insertLast(3);
        s1.insertLast(4);
        s1.insertLast(3);

        s1.display();

        MergeList s2 = new MergeList();
        s2.insertLast(5);
        s2.insertLast(6);
        s2.insertLast(4);

        s2.display();

        MergeList result1 = new MergeList();
        result1.add(s1.head, s2.head);



/*
        MergeList result = new MergeList();
        result.head =  merge(m1.head, m2.head);
        result.display();

        ListNode reversal = result.reverse(result.head);
        result.display(reversal);*/



    }
}

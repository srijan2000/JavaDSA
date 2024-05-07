package com.srijan;

public class SinglyLinkedList2 {
    ListNode head;
    private static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + "--> ");
            current = current.next;
        }
        System.out.println("null");
    }
    //insert a node in a sorted Singly Linked List
    public ListNode insertInASortedList(){
        ListNode newNode = new ListNode(11);
        ListNode current = head;
        ListNode temp = null;
        while(current != null && current.data < newNode.data){
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        return head;
    }
    // remove a given key from Singly Linked List
    public void deleteKey(int key){
        ListNode current = head;
        ListNode temp = null;
        while (current != null && current.data != key ){
            temp = current;
            current = current.next;
        }
        if(current == null) return;

        temp.next = current.next;
    }

    // detect a loop in a Singly Linked List
    public boolean loopList(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while (fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(slowPtr == fastPtr){
                return true;
            }
        }
        return false;
    }

    // find start of a loop in a Singly Linked List？
  /*  public ListNode getStartingNode(ListNode slowPtr){
        ListNode temp = head;
        while (slowPtr != temp){
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        return temp;
    }*/

    public static void main(String[] args) {
        SinglyLinkedList2 s2 = new SinglyLinkedList2();
        s2.head = new ListNode(1);
        ListNode first = new ListNode(8);
        ListNode second = new ListNode(10);
        ListNode third = new ListNode(16);

        s2.head.next = first;
        first.next = second;
        second.next = third;

        s2.display();
        s2.insertInASortedList();
        s2.display();




        // Why Floyd's Cycle Detection algorithm works？
        // remove loop from a Singly Linked List？
        // Merge Two Sorted ListsQuestion

       s2.deleteKey(11);
       s2.display();
       System.out.println(s2.loopList());

    }
}

package com.srijan;

import java.util.NoSuchElementException;

public class Queuee {

    ListNode front ;
    ListNode rear;
    int length;
    public static class ListNode{
        int data;
        ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Queuee(){
        this.front = null;
        this.rear = null;
        length = 0;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    public void enque(int value){
        ListNode temp = new ListNode(value);
        if(isEmpty()){
            front = temp;
        }else {
            rear.next = temp;
        }
        rear = temp;
        length++;
    }

    public int deque(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        int result = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        length --;
        return result;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        ListNode current = front;
        while (current != null){
            System.out.print(current.data +  " -->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Queuee q = new Queuee();
        q.enque(20);
        q.enque(30);
        q.enque(40);
        q.display();
        System.out.println(q.deque());
        q.display();

    }
}

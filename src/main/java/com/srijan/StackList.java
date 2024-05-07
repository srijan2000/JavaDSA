package com.srijan;

import java.util.EmptyStackException;

public class StackList {
    private ListNode top;
    private int length;

    private class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
        }
    }
    public StackList(){
        top = null;
        length = 0;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    public void push(int value){
        ListNode temp = new ListNode(value);
        temp.next = top;
        top = temp;
        length++;
    }
    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next ;
        length --;
        return result;
    }

    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.data;
    }

    public static void main(String[] args) {
        StackList stack = new StackList();
        stack.push(10);
        stack.push(15);
        stack.push(20);

        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }


}

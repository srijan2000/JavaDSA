package com.srijan;
import java.util.Stack;

public class StringReverse {
    public static String reverse(String s){
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for(char c : chars){
            stack.push(c);
        }
        for(int i = 0; i< s.length() ; i++){
            chars[i] = stack.pop();
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String str = "ABCDE";
        System.out.println("Before Reverse " + str);
        System.out.println("After Reverse "+ reverse(str));
    }
}

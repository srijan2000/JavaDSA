package com.srijan;
import java.util.Stack;

public class ValidParanthesis {
    public static boolean validParanthesis(String s){
        Stack<Character> stack = new Stack<>();
        int n = s.length();
       for(int i = 0; i < n; i++){
           char c = s.charAt(i);
           if( c == '{' || c == '(' || c == '[' ){
               stack.push(c);
           }
           else {
               if(stack.isEmpty()){
                   return false;
               }else{
                   char top = stack.peek();
                   if(top == '{' && c == '}' || top == '(' && c == ')' || top == '[' && c == ']' ){
                       stack.pop();
                   }
                   else{
                       return false;
                   }
               }
           }

       }
        return stack.isEmpty();

    }
    public static void main(String[] args) {
        String s = "{[()}";
        System.out.println(validParanthesis(s));
    }
}

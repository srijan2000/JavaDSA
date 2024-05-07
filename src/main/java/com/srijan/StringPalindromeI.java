package com.srijan;

public class StringPalindromeI {
    static boolean isPalindrome(String s){
        boolean IsPalindrome = true;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
           if(Character.isLetterOrDigit(s.charAt(i)) ){
               sb.append(Character.toLowerCase(s.charAt(i)));
           }
        }
        int size = sb.length();
        for(int i = 0; i< size; i++){
            if(sb.charAt(i) != sb.charAt(size-i-1)){
                IsPalindrome = false;
            }
        }
        return IsPalindrome;

    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama " ;
        System.out.println(isPalindrome(s));

    }
}

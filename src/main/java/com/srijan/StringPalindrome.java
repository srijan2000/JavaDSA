package com.srijan;

public class StringPalindrome {
    static boolean validPalindrome(String s){
        boolean IsPalindrome = true;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length() -1; i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(Character.toLowerCase(s.charAt(i)));
            }

        }

        int size = sb.length();
        for(int i = 0 ; i< size; i++ ){
            System.out.print(sb.charAt(i));

        }
        System.out.println();
        for(int i = 0 ; i< size; i++ ){
            System.out.print(sb.charAt(size-i-1));
        }
        System.out.println();

        for(int i = 0; i < size/2; i++){
            if(sb.charAt(i) != sb.charAt( size - i -1 )){
                IsPalindrome = false;
                break;
            }
        }


        return IsPalindrome;

    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama " ;

        System.out.println(validPalindrome(s));
    }
}

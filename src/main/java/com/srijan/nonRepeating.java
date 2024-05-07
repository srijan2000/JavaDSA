package com.srijan;

import java.util.HashMap;
import java.util.HashSet;

public class nonRepeating {
    public static int nonRepatingCharacter(String word){
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            hm.put(ch, hm.getOrDefault(ch,0) +1);
        }
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(hm.get(ch) == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "codeforcode";
        System.out.println(nonRepatingCharacter(str));
    }
}

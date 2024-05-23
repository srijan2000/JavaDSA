package com.srijan.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMapDemo2 {
    public static void main(String[] args) {
        List<String> teamA = Arrays.asList("Scott", "David", "John");
        List<String> teamB = Arrays.asList("Mary","Luna", "Tom");
        List<String> teamC = Arrays.asList("Ken", "Jony", "Kitty");

 /*       List<List<String>> playersInWorldCup = new ArrayList<List<String>>();
        playersInWorldCup.add(teamA);
        playersInWorldCup.add(teamB);
        playersInWorldCup.add(teamC);*/

        List<List<String>> playersInWorldCup = Arrays.asList(teamA, teamB, teamC);
        // Before Jave 8
      /*  for(List<String> team : playersInWorldCup){
            for ( String name : team){
                System.out.println(name);
            }
        }
*/
        playersInWorldCup.stream().flatMap(x -> x.stream()).forEach(System.out::println);


    }
}

package com.srijan.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {
    public static void main(String[] args) {
        List<String> vehicles = List.of("bus","car","bicycle", "flight", "train");
        List<String> vehiclesListinUpperCase = new ArrayList<>();
        //Before Java 8 / without using streams
       /* for(String name : vehicles){
            vehiclesListinUpperCase.add(name.toUpperCase());
        }*/
        //Stream - Map
        vehiclesListinUpperCase=vehicles.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());

        System.out.println(vehiclesListinUpperCase);

    }
}

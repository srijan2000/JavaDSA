package com.srijan.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// distinct () count() limit()
public class StreamNonTerminalMethods {
    public static void main(String[] args) {
        List<String> vehiclesList = Arrays.asList("Bus", "Car", "Bicycle", "Bus", "Car" , "Car", "Bike");
       List<String> DistinctVehicles =  vehiclesList.stream().distinct().collect(Collectors.toList());
        System.out.println(DistinctVehicles);
        System.out.println(DistinctVehicles.stream().count());
        // limit()
       List<String> limitedVehiclesList =  vehiclesList.stream().limit(3).collect(Collectors.toList());
        System.out.println("Limited Vehicles : " + limitedVehiclesList);
    }
}

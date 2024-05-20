package com.srijan.java8.features;


interface Cab{
    public void bookCab(String source, String destination);
}
public class LambdaExpressionEx {
    public static void main(String[] args) {
        Cab cab = (source, destination) -> System.out.println("Booked a cab from " + source + " To this destination called : " + destination);
        cab.bookCab("Mumbai", "Hyderabad");
    }
}

package com.srijan.java8.features;

interface Cab1{
    public String bookCab(String source, String destination);
}
/*class Ola implements Cab1{
    @Override
    public String bookCab(String source, String destination) {
        System.out.println("Ola cab is booked from " + source + " To "+ destination);
        return ("Price is 8000 Rs");
    }
}*/
public class LambdaExpressionEx1 {
    public static void main(String[] args) {
        //Cab1 cab1 = new Ola();
        Cab1 cab1 = (source, destination) -> {
            System.out.println("Ola cab is booked from " + source + " To "+ destination);
            return ("Price is 8000 RS ");
        };
        //System.out.println(cab1.bookCab("Hyd", "Mumbai"));
    }
}

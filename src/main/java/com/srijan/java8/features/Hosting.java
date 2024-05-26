package com.srijan.java8.features;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Hosting {
    public int id;
    public String name;
    public long websites;

    public Hosting(int id, String name, long websites){
        this.id = id;
        this.name = name;
        this.websites = websites;
    }
    public  int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public long getWebsites(){
        return websites;
    }
    public void setWebsites(long websites){
        this.websites = websites;
    }

    public static void main(String[] args) {
        List<Hosting> list = new ArrayList<>();
        list.add(new Hosting(1, "liquidweb.com", 80000));
        list.add(new Hosting(2, "linode.com", 90000));
        list.add(new Hosting(3, "digitalocean.com", 120000));
        list.add(new Hosting(4, "aws.amazon.com", 200000));
        list.add( new Hosting(5, "mkyong.com", 1));

        Map<Integer, String> result1 = list.stream().collect(Collectors.toMap(Hosting::getId, Hosting::getName));
        System.out.println("Result 1 : " + result1);


        Map<String, Long> result2 = list.stream().collect(Collectors.toMap(Hosting::getName, Hosting:: getWebsites));
        System.out.println("Result 2 : " + result2);

        Map<Integer, String> result3 = list.stream().collect(Collectors.toMap(x -> x.getId(), x-> x.getName() ));
        System.out.println("Result 3 : " + result3);
    }

}


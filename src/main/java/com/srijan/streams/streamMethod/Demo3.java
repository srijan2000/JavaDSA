package com.srijan.streams.streamMethod;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//findAny()
//findFirst()
public class Demo3 {
    public static void main(String[] args) {
      /*  List<String> stringList = Arrays.asList("one", "two", "three", "one");
        Optional<String> ele = stringList.stream().findAny();
        System.out.println(ele.get());
*/
        //findFirst()
        List<String> stringList = Arrays.asList("one", "two", "three","one");
        Optional<String> ele = stringList.stream().findFirst();
        System.out.println(ele.get());
    }
}

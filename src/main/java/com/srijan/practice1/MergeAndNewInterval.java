package com.srijan.practice1;

import java.util.*;
class Interval{
    int start;
    int end;
    Interval(int start, int end){
        this.start = start;
        this.end = end;
    }
}
public class MergeAndNewInterval{
    public static List<II> newInterval(List<II> mergedIntervals, II newInterval){
        List<II> result = new LinkedList<>();
        for(int i = 0; i < mergedIntervals.size(); i++){
            II mInterval = mergedIntervals.get(i);
            int start = mInterval.start;
            int end = mInterval.end;
            if(end >= newInterval.start){
                end = Math.max(end, newInterval.end);
                result.add(new II(start, end));

            }else{
                result.add(new II(start, end));
                continue;
            }
        }
        return result;



    }
    public static List<II> mergeInterval(List<II> intervals){
        intervals.sort(Comparator.comparingInt(in -> in.start));
        List<II> result = new LinkedList<>();
        II first = intervals.get(0);
        int start = first.start;
        int end = first.end;
        for(int i = 1; i< intervals.size(); i++){
            II current = intervals.get(i);
            if(end >= current.start){
                end = Math.max(end, current.end);

            }else{
                result.add(new II(start, end));
                start = current.start;
                end = current.end;
            }

        }
        result.add(new II(start, end));
        return result;

    }
    public static void main(String[] args){
        List<II> inputIntervals = Arrays.asList(
                new II(1, 3),
                new II(2, 4),
                new II(6, 8),
                new II(9, 10)
        );


        List<II> result = mergeInterval(inputIntervals);

        System.out.println("Before adding new interval ");

        for(II in : result){
            System.out.println(in.start + " - " + in.end);
        }

        System.out.println();


        System.out.println("After adding new interval ");


        II newInterval = new II(10, 15);
        List<II> newResult = newInterval(result, newInterval);

        for(II in : newResult){
            System.out.println(in.start + " - " + in.end);
        }

    }
}

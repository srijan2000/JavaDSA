package com.srijan.practice1;
// Given a list of non - overlapping intervals sorted by their start time,
//insert a given interval at the valid position,
// merge all the overlapping intervals and return a list of mutually exclusive intervals.
import java.util.*;
class Interval{
    int start;
    int end;
    Interval(int start, int end){
        this.start = start;
        this.end = end;
    }
}
public class InsertInterval {
    public static List<Interval> insert(List<Interval> intervals, Interval newInterval){
        if(intervals == null || intervals.isEmpty()){
            return intervals;
        }
        List<Interval> result = new LinkedList<>();
        int i = 0;
        while(i < intervals.size() &&
                intervals.get(i).end < newInterval.start){
            result.add(intervals.get(i));
            i++;
        }
        while(i < intervals.size() && intervals.get(i).start <= newInterval.end){
            Interval current = intervals.get(i);
            newInterval.start = Math.min(current.start, newInterval.start);
            newInterval.end = Math.max(current.end, newInterval.end);
            i++;
        }
        result.add(newInterval);
        while(i < intervals.size()){
            result.add(intervals.get(i));
            i++;
        }
        return result;

    }
    public static void main(String[] args) {
        List<Interval> inputInterval = Arrays.asList(
                new Interval(1, 3),
                new Interval(5, 7),
                new Interval(8, 10),
                new Interval(11, 12)
        );
        Interval newInterval = new Interval(4, 9);
        List<Interval> mergeInsert = insert(inputInterval, newInterval);
        for(Interval interval : mergeInsert){
            System.out.println(interval.start + " - " + interval.end);
        }

    }
}

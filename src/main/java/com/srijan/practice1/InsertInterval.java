package com.srijan.practice1;
// Given a list of non - overlapping intervals sorted by their start time,
//insert a given interval at the valid position,
// merge all the overlapping intervals and return a list of mutually exclusive intervals.
import java.util.*;
class II {
    int start;
    int end;
    II(int start, int end){
        this.start = start;
        this.end = end;
    }
}
public class InsertInterval {
    public static List<II> insert(List<II> intervals, II newInterval){
        if(intervals == null || intervals.isEmpty()){
            return intervals;
        }
        List<II> result = new LinkedList<>();
        int i = 0;
        while(i < intervals.size() &&
                intervals.get(i).end < newInterval.start){
            result.add(intervals.get(i));
            i++;
        }
        while(i < intervals.size() && intervals.get(i).start <= newInterval.end){
            II current = intervals.get(i);
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
        List<II> inputInterval = Arrays.asList(
                new II(1, 3),
                new II(5, 7),
                new II(8, 10),
                new II(11, 12)
        );
        II newInterval = new II(4, 9);
        List<II> mergeInsert = insert(inputInterval, newInterval);
        for(II interval : mergeInsert){
            System.out.println(interval.start + " - " + interval.end);
        }

    }
}

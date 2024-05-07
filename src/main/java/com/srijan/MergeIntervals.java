package com.srijan;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

// Given a list of Intervals, merge all the overlapping intervals and return a list of non-overlapping intervals.


class Interval{
    int start;
    int end;
    Interval(int start, int end){
        this.start = start;
        this.end = end;
    }
}
public class MergeIntervals {
    public static List<Interval> merge(List<Interval> intervals){
        if(intervals.size() < 2){
            return intervals;
        }
        intervals.sort(Comparator.comparingInt(in -> in.start));
        List<Interval> result = new LinkedList<>();
        Interval first = intervals.get(0);
        int start = first.start;
        int end = first.end;
        for(int i = 1; i< intervals.size(); i++){
            Interval current = intervals.get(i);
            if(current.start <= end){
                end = Math.max(current.end, end);
            }else{
                result.add(new Interval(start, end));
                start = current.start;
                end = current.end;
            }
        }
        result.add(new Interval(start, end));
        return result;
    }
    public static void main(String[] args) {
        List<Interval> inputIntervals = Arrays.asList(
                new Interval(1,3),
                new Interval(2, 4),
                new Interval(6, 8),
                new Interval(9, 10)
        );
        List<Interval> mergedIntervals = merge(inputIntervals);
        System.out.println("Merged intervals");
        for(Interval interval : mergedIntervals){
            System.out.println(interval.start + " - "+ interval.end);
        }
    }
}

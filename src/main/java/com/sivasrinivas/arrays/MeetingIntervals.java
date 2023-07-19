package com.sivasrinivas.arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/*
Problem:
You want to schedule a meeting with coworker. You are given their schedule as a list of meetings
that each have a start time and end time, and you are also given a duration for his new meeting.
Return all available intervals where this new meeting could be scheduled, assuming hour blocks range from 0, 23.
 Example:
        meetings.add(new int[]{0,5});
        meetings.add(new int[]{20,21});
        meetings.add(new int[]{3,4});
        meetings.add(new int[]{4,8});
        meetings.add(new int[]{10,12});
        meetings.add(new int[]{9,10});

Output: [12,20], [21,24]
 */

public class MeetingIntervals {
    public static void main(String[] args) {
        List<int[]> meetings = new ArrayList<>();
        meetings.add(new int[]{0,5});
        meetings.add(new int[]{20,21});
        meetings.add(new int[]{3,4});
        meetings.add(new int[]{4,8});
        meetings.add(new int[]{10,12});
        meetings.add(new int[]{9,20});
        findAvailableSlots(meetings, 2).forEach(a -> System.out.printf("[%d,%d]\n", a[0], a[1]));
    }

    public static List<int[]> findAvailableSlots(List<int[]> meetings, int duration) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        List<int[]> results = new ArrayList<>();

        //base case
        if(meetings==null || meetings.size() ==0) {
            results.add(new int[]{0,24});
            return results;
        }

        for (int[] meeting : meetings) {
            pq.add(meeting);
        }
        while(!pq.isEmpty()) {
            int[] cur = pq.poll();
            int[] next = pq.peek();
            if (next == null) {
                if(cur[1]+duration <= 24) {
                    results.add(new int[] {cur[1], 24});
                }
            } else if(cur[1]+duration<=next[0]) {
                results.add(new int[]{cur[1], next[0]});
            } else if(cur[1] >= next[1]) { // cur meeting covers the next meeting completely
                    pq.poll();
                    pq.add(cur);
            }
        }
        return results;
    }
}

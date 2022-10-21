/* Medium
Given an array of meeting time intervals consisting of start and end times[[s1,e1],[s2,e2],...](si< ei), find the minimum number of conference rooms required.
Example 1:
Input:
[[0, 30],[5, 10],[15, 20]]
Output:
 2
Example 2:
Input:
 [[7,10],[2,4]]

Output:
 1
Hint 1
Think about how we would approach this problem in a very simplistic way. We will allocate rooms to meetings that occur earlier in the day v/s the ones that occur later on, right?
Hint 2
If you've figured out that we have to sort the meetings by their start time, the next thing to think about is how do we do the allocation?
There are two scenarios possible here for any meeting. Either there is no meeting room available and a new one has to be allocated, or a meeting room has freed up and this meeting can take place there.
Hint 3
An important thing to note is that we don't really care which room gets freed up while allocating a room for the current meeting. As long as a room is free, our job is done.
We already know the rooms we have allocated till now and we also know when are they due to get free because of the end times of the meetings going on in those rooms. We can simply check the room which is due to get vacated the earliest amongst all the allocated rooms.
Hint 4
Following up on the previous hint, we can make use of a min-heap to store the end times of the meetings in various rooms.
So, every time we want to check if any room is free or not, simply check the topmost element of the min heap as that would be the room that would get free the earliest out of all the other rooms currently occupied.
If the room we extracted from the top of the min heap isn't free, then no other room is. So, we can save time here and simply allocate a new room.
*/
  
/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    class Point {
        int type; // start: 1, end: 0
        int time;

        Point (int time, int type) {
            this.time = time;
            this.type = type;
        }   
    }

    public int minMeetingRooms(Interval[] intervals) {
        List<Point> points = new ArrayList<>(intervals.length * 2);
        for (Interval i: intervals) {
            points.add(new Point(i.start, 1));
            points.add(new Point(i.end, 0));
        }
        Comparator<Point> cmp = new Comparator<Point>() {
            @Override
            public int compare (Point a, Point b) {
                if (a.time == b.time) {
                    return a.type - b.type;
                } else {
                    return a.time - b.time;
                }
            }
        };
        Collections.sort(points, cmp);

        int maxOverlap = 0;
        int ongoing = 0;
        for (Point p: points) {
            if (p.type == 1)  {
                ongoing++;
            } else if (p.type == 0) {
                ongoing--;
            }
            maxOverlap = Math.max(maxOverlap, ongoing);
        }

        return maxOverlap;
    }
}

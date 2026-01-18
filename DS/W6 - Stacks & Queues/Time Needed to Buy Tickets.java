class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        int n = tickets.length;

        while (tickets[k] > 0) {
            for (int i = 0; i < n; i++) {
                if (tickets[i] > 0) {
                    tickets[i]--;
                    time++;

                    if (tickets[k] == 0) return time;
                }
            }
        }
        return time;
    }
    /**
     public int timeRequiredToBuy(int[] tickets, int k) {
     int totalTime = 0;
     int myNeed = tickets[k];

     for (int i = 0; i < tickets.length; i++) {
     if (i <= k) {
     // People in front of me or ME
     totalTime += Math.min(tickets[i], myNeed);
     } else {
     // People behind me
     totalTime += Math.min(tickets[i], myNeed - 1);
     }
     }
     return totalTime;
     } */

/**
 queue approach :

 class Solution {
 public int timeRequiredToBuy(int[] tickets, int k) {
 // Queue stores {tickets_needed, original_index}
 Queue<int[]> q = new LinkedList<>();
 int time = 0;

 // 1. Fill the queue with everyone in line
 for (int i = 0; i < tickets.length; i++) {
 q.add(new int[]{tickets[i], i});
 }

 // 2. Start selling tickets
 while (!q.isEmpty()) {
 int[] person = q.poll();
 int ticketsNeeded = person[0];
 int index = person[1];

 // Buy one ticket
 ticketsNeeded--;
 time++;

 // If this was person k and they are done, stop!
 if (index == k && ticketsNeeded == 0) {
 return time;
 }

 // If they still need more, they go to the back of the line
 if (ticketsNeeded > 0) {
 q.add(new int[]{ticketsNeeded, index});
 }
 }

 return time;
 }
 } */
}
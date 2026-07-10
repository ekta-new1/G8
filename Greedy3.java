package Greedy;
import java.util.*;

public class Greedy3 {

    public static void main(String[] args) {

        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        int n = start.length;

        // Store activities as {start, end}
        int[][] activities = new int[n][2];

        for (int i = 0; i < n; i++) {
            activities[i][0] = start[i];
            activities[i][1] = end[i];
        }

        // Sort by ending time
        Arrays.sort(activities, (a, b) -> a[1] - b[1]);
        // for (int i = 0; i < n - 1; i++) {
        //
        //            for (int j = 0; j < n - i - 1; j++) {
        //
        //                if (activities[j][1] > activities[j + 1][1]) {
        //
        //                    // Swap start times
        //                    int tempStart = activities[j][0];
        //                    activities[j][0] = activities[j + 1][0];
        //                    activities[j + 1][0] = tempStart;
        //
        //                    // Swap end times
        //                    int tempEnd = activities[j][1];
        //                    activities[j][1] = activities[j + 1][1];
        //                    activities[j + 1][1] = tempEnd;
        //                }
        //            }
        //        }

        int count = 1;
        int lastEnd = activities[0][1];

        System.out.println("Selected Activities:");
        System.out.println("(" + activities[0][0] + ", " + activities[0][1] + ")");

        for (int i = 1; i < n; i++) {

            if (activities[i][0] >= lastEnd) {

                count++;
                lastEnd = activities[i][1];

                System.out.println("(" + activities[i][0] + ", " + activities[i][1] + ")");
            }
        }

        System.out.println("\nMaximum Activities = " + count);
    }
}

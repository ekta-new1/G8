package Greedy;

public class Greedy6 {

    public static void main(String[] args) {

        int[][] boxTypes = {
                {1, 3},
                {2, 2},
                {3, 1}
        };

        int truckSize = 4;

        int n = boxTypes.length;

        // Bubble Sort based on units per box (Descending)
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (boxTypes[j][1] < boxTypes[j + 1][1]) {

                    // Swap number of boxes
                    int tempBoxes = boxTypes[j][0];
                    boxTypes[j][0] = boxTypes[j + 1][0];
                    boxTypes[j + 1][0] = tempBoxes;

                    // Swap units per box
                    int tempUnits = boxTypes[j][1];
                    boxTypes[j][1] = boxTypes[j + 1][1];
                    boxTypes[j + 1][1] = tempUnits;
                }
            }
        }

        int totalUnits = 0;

        for (int i = 0; i < n; i++) {

            if (truckSize == 0)
                break;

            int boxesToTake;

            if (boxTypes[i][0] <= truckSize) {
                boxesToTake = boxTypes[i][0];
            } else {
                boxesToTake = truckSize;
            }

            totalUnits += boxesToTake * boxTypes[i][1];

            truckSize -= boxesToTake;
        }

        System.out.println("Maximum Units = " + totalUnits);
    }
}

package Greedy;

public class Greedy4 {

    public static void main(String[] args) {

        int[] greed = {1, 2, 3};
        int[] cookies = {1, 1};

        // Sort greed array (Bubble Sort)
        for (int i = 0; i < greed.length - 1; i++) {
            for (int j = 0; j < greed.length - i - 1; j++) {
                if (greed[j] > greed[j + 1]) {
                    int temp = greed[j];
                    greed[j] = greed[j + 1];
                    greed[j + 1] = temp;
                }
            }
        }

        // Sort cookies array (Bubble Sort)
        for (int i = 0; i < cookies.length - 1; i++) {
            for (int j = 0; j < cookies.length - i - 1; j++) {
                if (cookies[j] > cookies[j + 1]) {
                    int temp = cookies[j];
                    cookies[j] = cookies[j + 1];
                    cookies[j + 1] = temp;
                }
            }
        }

        int child = 0;
        int cookie = 0;
        int count = 0;

        while (child < greed.length && cookie < cookies.length) {

            if (cookies[cookie] >= greed[child]) {
                count++;
                child++;
                cookie++;
            } else {
                cookie++;
            }
        }

        System.out.println("Maximum Satisfied Children = " + count);
    }
}

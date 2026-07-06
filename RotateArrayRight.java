package DSAquestions;
import java.util.Arrays;

//Rotate Array Right by K - You have to rotate array k number of times.

//[1,2,3,4,5,6]
//k=3
//Output - [4,5,6,1,2,3]

//[6,1,2,3,4,5]
//[5,6,1,2,3,4]
//[4,5,6,1,2,3]

//Solution -
//Reverse entire array - [6,5,4,3,2,1]
//Reverse first k elements - [4,5,6,3,2,1]
//Reverse remaining elements - [4,5,6,1,2,3]

public class RotateArrayRight {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 3;

        int n = arr.length;

        int start = 0;
        int end = n - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        } //[6,5,4,3,2,1]

        start = 0;
        end = k - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        } //[4,5,6,3,2,1]


        start = k;
        end = n - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        } //[4,5,6,1,2,3]

        System.out.println(Arrays.toString(arr));
    }
}
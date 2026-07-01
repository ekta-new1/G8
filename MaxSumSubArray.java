package DSAquestions;
//Sliding window problem -
//Given an array of N integers and an integer K, find the maximum sum of any continuous subarray of size K.
//Input
//N = 7
//K = 3
//Array = [2,1,5,1,3,2,4]

//Output : 9

public class MaxSumSubArray {
    public static void main(String[] args) {

        int arr[] = {2,1,5,1,3,2,4};
        int k = 3;
        int sum = 0;
        for(int i=0;i<k;i++)
            sum += arr[i];

        int max = sum;

        for(int i=k;i<arr.length;i++){
            sum += arr[i];
            sum -= arr[i-k];
            max = Math.max(max,sum);
        }
        System.out.println(max);
    }
}

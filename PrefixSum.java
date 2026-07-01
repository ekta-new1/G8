package DSAquestions;
//Given an integer array arr, find the Equilibrium Index.
//An index is called an Equilibrium Index if the sum of all elements to its left is equal to the sum of all elements to its right.

//If such an index exists, return its index. Otherwise, return -1.

//Note: The element at the current index is not included in either the left sum or the right sum.

//Input - [1,7,3,6,5,6]

//Output - 3

//Explanation
//1+7+3 = 5+6

public class PrefixSum {
    public static void main(String[] args) {

        int arr[] = {1,7,3,6,5,6};
        int total = 0;
        for(int x : arr)
            total += x;  //28

        int left = 0;

        for(int i=0;i<arr.length;i++){  //i=0
            total -= arr[i];   //27

            if(left == total){
                System.out.println(i);
                return;
            }
            left += arr[i];   //1
        }

        System.out.println(-1);
    }
}

package DSAquestions;

import java.util.Arrays;

//Partition Around Pivot -
//Rearrange the array so that -
//Smaller than pivot
//Equal to pivot
//Greater than pivot
//Input -
//[9 12 3 5 14 10 10]
//pivot=10
//Output -
//[9 3 5 10 10 12 14]

public class Partitioning1 {
    static void main() {
        int arr[]={9,12,3,5,14,10,10};

        int pivot=10;

        int low=0;
        int mid=0;
        int high=arr.length-1;

        while(mid<=high){

            if(arr[mid]<pivot){

                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;

                low++;
                mid++;
            }

            else if(arr[mid]==pivot){

                mid++;
            }

            else{

                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;

                high--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}

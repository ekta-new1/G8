package DSAquestions;
//Minimum Size Subarray Sum-
//Find the minimum length of a contiguous subarray whose sum is greater than or equal to the target.
//If no such subarray exists, return 0.
//arr=[2,3,1,2,4,3]
//target=7
//Output: 2
//Explanation -
//[2,3] = 5
//[3,1] = 4
//[1,2] = 3
//[2,4] = 6
//[4,3] = 7

public class MinSizeSubArrSum {
    static void main() {
        int target=7;
        int arr[]={2,3,1,2,4,3};
        int left=0;
        int sum=0;

        int ans=Integer.MAX_VALUE;

        for(int right=0;right<arr.length;right++){  //0

            sum+=arr[right];

            while(sum>=target){

                ans=Math.min(ans,right-left+1);
                sum-=arr[left];
                left++;
            }
        }

        if(ans==Integer.MAX_VALUE)
            System.out.println(0);
        else
            System.out.println(ans);
    }

}

//| Right | Added | Window              | Sum        | While Runs? | Answer |

//| 0     | 2     | [2]                 | 2          | No          | ∞      |
//| 1     | 3     | [2,3]               | 5          | No          | ∞      |
//| 2     | 1     | [2,3,1]             | 6          | No          | ∞      |
//| 3     | 2     | [2,3,1,2]           | 8          | Yes         | 4      |
//| 4     | 4     | [3,1,2,4] → [1,2,4] | 10 → 7 → 6 | Yes         | 3      |
//| 5     | 3     | [2,4,3] → [4,3]     | 9 → 7 → 3  | Yes         | 2      |

package DSAquestions;
//Count the number of contiguous subarrays having sum exactly K.

//Input
//[1,2,3,-2,5]
//K=5

//Output - 2

import java.util.HashMap;

public class PrefixSum2 {
    public static void main(String[] args) {

        int arr[] = {1,2,3,-2,5};

        int k = 5;

        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,1);

        int sum=0;
        int count=0;

        for(int x:arr){  

            sum+=x;

            if(map.containsKey(sum-k))
                count+=map.get(sum-k);

            map.put(sum,map.getOrDefault(sum,0)+1);
            //map(1,1)
            //map(3,1)
            //map(6,1)
            //map(4,1)
            //map(9,1)
        }

        System.out.println(count);
    }
}

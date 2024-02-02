package Two_Pointers;

import java.util.Scanner;

public class P3 {

    // (gfg) :- Given a sorted array and a number x, find the pair in array whose sum is closest to x ;

    int[] sumClosest(int[] arr, int x) {
        // code here
        int start = 0, end= arr.length-1, diff= Integer.MAX_VALUE,ans=0,res1=0,res2=0;
        while(start<end){
            ans = Math.abs(x-(arr[start]+ arr[end]));
//            System.out.println(ans);
            if(ans<diff){
                diff= ans;
                res1= arr[start];
                res2= arr[end];
            }
            if(arr[start]+arr[end]==x)
            {
                res1=arr[start];
                res2=arr[end];
                return new int[] {res1 , res2};
            }
            else if(arr[start]+ arr[end]>x)
                end--;
            else
                start++;
        }
        return new int[] {res1 , res2};
    }
}

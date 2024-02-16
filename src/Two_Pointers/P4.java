package Two_Pointers;

import java.util.Arrays;

public class P4 {

    public boolean findTriplets(int arr[] , int n){
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int start = i+1;
            int end = n-1;

            while(start<end){
                if(arr[i]+arr[start]+arr[end]==0){
                    return true;
                }
                else if(arr[i]+arr[start]+arr[end]<0){
                    start++;
                }
                else{
                    end--;
                }
            }
        }
        return false;
    }
}

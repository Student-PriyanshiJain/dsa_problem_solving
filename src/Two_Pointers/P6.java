package Two_Pointers;

import java.util.HashSet;

public class P6 {
    int countTriplet(int arr[], int n) {
        // code here
        HashSet<Integer> hset = new HashSet<>();

        for(int i: arr) hset.add(i);
        int count =0;
        for(int i=0; i<n ; i++)
        {
            int j=i+1;
            while(j<n)
            {
                if(hset.contains(arr[i]+arr[j])){
                    count++;
                }
                j++;
            }
        }
        return count;
    }
}

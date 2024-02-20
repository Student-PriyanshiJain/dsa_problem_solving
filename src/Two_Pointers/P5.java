package Two_Pointers;

import java.util.Arrays;

public class P5 {
    public static boolean find3Numbers(int A[], int n, int X) {

        // Your code Here
        Arrays.sort(A);
        for(int i=0; i<n ; i++)
        {
            int start = i+1;
            int end=n-1;
            while(start<end)
            {
                if(A[i]+A[start]+A[end]==X)
                    return true;

                else if(A[i]+A[start]+A[end]<X)
                    start++;

                else
                    end--;
            }
        }

        return false;
    }
}

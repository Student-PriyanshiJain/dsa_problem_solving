package Two_Pointers;

import java.util.ArrayList;
import java.util.Scanner;

public class P2 {

    // (gfg) :-  Find the closest pair from two sorted arrays
    public static ArrayList<Integer> printClosest(int arr[], int brr[], int n, int m, int x) {

        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int p = 0;
        int q = 0;
        int min = Integer.MAX_VALUE;
        int i = 0;
        int j = brr.length - 1;
        while (i < n && j >= 0) {
            int sum = arr[i] + brr[j];
            int res = Math.abs(x - sum);
            if (res < min) {
                min = res;
                p = arr[i];
                q = brr[j];
            }
            if (sum == x) {
                list.add(arr[i]);
                list.add(brr[j]);
                return list;
            } else if (sum < x) i++;
            else j--;
        }
        list.add(p);
        list.add(q);
        return list;

    }
}


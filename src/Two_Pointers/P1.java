package Two_Pointers;

public class P1 {

    // 26 ) Leetcode :-  Remove duplicates from sorted array

    public int removeDuplicates(int[] nums) {
        int count=0;
        int j=1;
        for(int i=1; i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}

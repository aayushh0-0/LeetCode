class Solution {
    public int[] concatWithReverse(int[] nums) {
    int ans[] = new int [2*nums.length];
    int j=nums.length-1;
    for(int i=0;i<nums.length*2;i++)
    {
        if(i<=nums.length-1)
        {
            ans[i]=nums[i];
        }
        else
        {
            ans[i]=nums[j];
            j--;
        }
    }   
    return ans; 
    }
}
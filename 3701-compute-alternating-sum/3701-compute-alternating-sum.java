class Solution {
    public int alternatingSum(int[] nums) {
    int sume =0;
    int sumo=0;
    for(int i=0;i<nums.length;i+=2)
        sume+=nums[i];
    for(int i=1;i<nums.length;i+=2)
        sumo+=nums[i];
    return sume-sumo;
    }
}
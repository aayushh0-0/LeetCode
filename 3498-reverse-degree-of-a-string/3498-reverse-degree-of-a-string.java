class Solution {
    public int reverseDegree(String s) {
    int ind=1;
    int sum=0;
    for(char ch:s.toCharArray())
    {
        sum+=(123-ch)*ind;
        ind++;
    } 
    return sum;   
    }
}
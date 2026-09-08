class Solution {
    public int countCommas(int n) {
    if(n<1000)
    {
        return 0;
    }    
    int initial=1000;
    int count=0;
    while(initial<n)
    {
        initial++;
        count++;
    }
    return count+1;
    }
}
class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2==0) return n;
    int mult=n*2;
    if(mult%n==0) return n*2;
    return 0;   
    }
}
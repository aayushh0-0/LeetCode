class Solution {
    public int scoreOfString(String s) {
    int sum=Math.abs(0+s.charAt(0)-s.charAt(1));
    for(int i=1;i<s.length()-1;i++)
    {
        sum+=(Math.abs(s.charAt(i)-s.charAt(i+1)));
    }
    return sum;
    }    
}
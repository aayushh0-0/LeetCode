class Solution {
    public boolean isThree(int n) {
    int divcount=0;
    for(int i=1;i<=n;i++)
    {
        if(n%i==0)
        {
            divcount++;
        }
        if(divcount>3)
        {
            break;
        }
    }  
    if(divcount!=3)
    {
        return false;
    }  
    return true;
    }
}
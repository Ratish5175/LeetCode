class Solution {
    public int bulbSwitch(int n) {
        long i;
    int count =0;
        for (i=1;i<=n;i++)
        {
            if((i*i)<=n)
            {
                count ++;
            }
        }
        return count;
    }
}
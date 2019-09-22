class Solution {
    public int maxArea(int[] height) {
        int i =0; 
        int len = height.length-1 ;
        int max = 	Integer.MIN_VALUE;
        int temp=0;
        while (i<len)
        {
           temp=Math.min(height[i],height[len]);
            if((temp*(len -i)) > max)
                max = temp* (len - i);
            if(height[i]>height[len])
                len--;
            else
                i++;
        }
        return max;
    }
}
package DP;

import java.util.ArrayList;

public class ClimbStair {

	
	private int climb(int n )
	{
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		int j=0;
		int i=1;
		int res =0;
	
		while(i<n)
		{
			res=j+i;
			j=i;
			i = res;
		}
		return res;
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ClimbStair climbStair = new ClimbStair();	
		
		System.out.print(climbStair.climb(6));
	}

}

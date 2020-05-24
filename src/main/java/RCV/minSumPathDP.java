package RCV;

import java.util.ArrayList;
import java.util.List;

public class minSumPathDP {

	public static int go(int[][] arr, int x, int y)
	{
		int ans = Integer.MIN_VALUE;
		if(x==3) return 0;
		if(y==3 || y==-1) return 0;
		if(arr[x][y]==-1)
			return 0;
		ans = Math.max(ans , arr[x][y] + go(arr, x,y+1) );
		//ans = Math.min(ans , arr[x][y] + go(arr, x+1,y+1) );
		ans = Math.max(ans , arr[x][y] + go(arr, x+1,y) );
		return ans;
	}
	
//	public static int foo(List<List<Integer>> mat , int x, int y )
//	{
//		if(mat.get(x).)
//	}
	public static void main(String[] args)
	{
		int arr[][] = {{0,	1,-1},{1,0,1},{1,1,1}};
		List<List<Integer>> mat = new ArrayList<List<Integer>>(3);
		
		mat.size();
		System.out.println(mat.size());
		for(int i=0;i<mat.get(i).size();i++)
		{
			//mat.get(i).;
		}
		int ans = Integer.MAX_VALUE;
		int pans = Integer.MAX_VALUE;
		for (int i=0;i<3;i++)
		{
			ans = go(arr,0,i);
			ans=Math.min(ans, pans);
			pans =ans;
		}
		System.out.print(ans);
	}
}

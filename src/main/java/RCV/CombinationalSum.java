package RCV;

import java.util.Stack;

public class CombinationalSum {

	Stack<Integer> str = new Stack<Integer>();
	public void foo(int []arr , int i, int x,int n)
	{
		if(i==n) {
			
			str.pop();
			return ;
		}
		
		
		if(InstSum(str) < x)
		{
			str.push(arr[i]);
			foo(arr, i, x,n);
			str.pop();
		//	foo(arr,i+1,x,n);
			
		
		}
		else if(InstSum(str) == x)
		{
			for(int a : str)
				System.out.print(a);
			System.out.println();
			
			return;
		}
		else if(InstSum(str)> x)
		{
			str.pop();
			//foo(arr,i+1,x,n);
			return ;
		}
		i++;
	}
	private int InstSum(Stack<Integer> arr) {
		int s=0;
		for(int a : arr)
			s+=a;
	//	System.out.println(s);
		return s;
	}
	public static void main(String[] args)
	{
		CombinationalSum combinationalSum = new CombinationalSum();
		int [] arr = {2,4,6,8};
		for(int i=0;i<4;i++)
			combinationalSum.foo(arr,i,8,4);
	}
}

package BackTracking;

public class MaxSum {

	static int max = Integer.MIN_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] test = {2,5,1};
		MaxSum maxSum = new MaxSum();
		
		maxSum.foo(test, 3, 0, 0 );
		System.out.print(max);
	}
	public void foo(int [] test , int k, int j, int sum )
	{
		if(j>=test.length)return ;
		else {
			for(int i=0;i<test.length;i++) {
				if(i!=j) {
			
					if(max<sum +test[i]+test[j])
						max = sum+ test[i]+test[j];
					foo(test , k-1,j+1,sum+ test[i]+test[j]);
				}
			}
		}
	
	}

}

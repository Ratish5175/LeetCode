
public class ReverseDiagonalPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		ReverseDiagonalPrinting reverseDiagonalPrinting = new ReverseDiagonalPrinting();
		
		reverseDiagonalPrinting.PrintRD(arr);
	}
	
	public void PrintRD(int [][]arr)
	{
		int n = arr[0].length;
		int i,j,k;
		j=n-1;
		i=0;
		while (j>=0)
		{
			k=j;
			for(int l=0;l<=i;l++) {
				System.out.print(arr[l][k++]+" ");
			}
			System.out.println();
			j--;
			i++;
		}
		j=n-1;
		i=1;
		while(i<=n-1)
		{
			k=0;
			for(int l=i;l<=j;l++) {
				System.out.print(arr[l][k++]+" ");
			}
			System.out.println();
			i++;	
		}
	}
	

}

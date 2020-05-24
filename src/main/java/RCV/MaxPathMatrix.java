package RCV;

public class MaxPathMatrix {

	int s =0;
	static int[][] a = new int[3][3];
	public int maxPath(int x, int y)
	{
		int r , d ;
		
		if(x<3 && y<3 && y>=0)
		{
		//	System.out.println(x+":"+y); 
			d =Math.max(maxPath(x+1, y+1)+ a[x][y], maxPath(x+1, y)+ a[x][y]);
			r = Math.max(maxPath(x+1, y-1)+ a[x][y],d);
		//	System.out.println(r);
			return r;			
		}
		if(y==-1)
			return 0;
		if(x==3)
			return 0;
		if (y==3)
			return 0;
		return 0;
		
		
	}
	public static void main(String[] args) {
		
		MaxPathMatrix matrix = new MaxPathMatrix();
		/*
		   1 2 3
           9 8 7
           4 5 6
           
		 */
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		
		a[1][0] = 9;
		a[1][1] = 8;
		a[1][2] = 7;
		
		a[2][0] = 4;
		a[2][1] = 5;
		a[2][2] = 6;
		
		System.out.println(Math.max(Math.max(matrix.maxPath(0, 0),matrix.maxPath(0, 1)),matrix.maxPath(0, 2)));
		

	}

}

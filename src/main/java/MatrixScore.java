
public class MatrixScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] A = {{0,1,1},{1,1,1},{0,1,0}};
		MatrixScore ms = new MatrixScore();
		System.out.print(ms.matrixScore(A));
	}

	 public int matrixScore(int[][] A) {
		 

			StringBuilder str = new StringBuilder("gagjd");
		//.de
			
		 
	        int r = A.length;
	        int c = A[0].length;
	        
	        int sum =0;
	        for(int i=0;i<r;i++)
	        {
	            if(A[i][0]==0)
	                toggle(A, true, i , c);
	           
	        
	        }
	        for(int i=0;i<c;i++) {
	        	 if(A[0][i]==0)
		                toggle(A, false, i, r);

	        }
	        for(int i=0;i<r;i++) {
	            String s="";
	            for(int j=0;j<c;j++)
	                s=s+A[i][j];
	           System.out.println(s);
	            sum += Integer.parseInt(s,2);
	        }
	        return sum;
	    }
	    
	    public void toggle(int [][] A, boolean checkRow, int j, int n ){
	        for(int i=0;i<n;i++){
	            
	           if(checkRow){
	             if(A[j][i]==1)
	                A[j][i]=0;
	            else
	                A[j][i]=1;    
	           }
	            else
	            {
	             if(A[i][j]==1)
	                A[i][j]=0;
	            else
	                A[i][j]=1;    
	                
	            }
	        }
	    }
}

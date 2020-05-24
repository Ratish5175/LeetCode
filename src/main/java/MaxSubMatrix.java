
public class MaxSubMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] matrix = {
				  {1,0,1},
				  {1,1,0},
				  {1,1,0}
				
//				{0,1,1,1},
//				{1,1,1,1},
//				{0,1,1,1},
				
		};
		MaxSubMatrix maxSubMatrix = new MaxSubMatrix();
		System.out.print(maxSubMatrix.countSquares(matrix));
	}

	 public int countSquares(int[][] matrix) {
	        int c=0;
	        int limit = Math.min(matrix.length, matrix[0].length);
	        for(int i=0;i< matrix.length;i++){
	            for(int j=0;j<matrix[0].length;j++){
	                for(int k=2;k<=limit;k++ )
	                {
	                    if(isSquare(matrix,k,i,j))
	                        c++;    
	                }       
	                
	                if(matrix[i][j]==1)
	                    c++;
	            }
	        }
	        
	        
	        return c;
	    }
	    
	    public boolean isSquare(int[][] mat , int n, int si, int sj){
	        int r = mat.length;
	        int c = mat[0].length;
	        if(r<n || c<n || n+si>r || n+sj>c) return false;
	        else {
	            
	                for(int i=si;i<n+si;i++)
	                {
	                    for(int j =sj;j< n+sj ;j++)
	                     {
	                        if(mat[i][j]==0)
	                            return false;
	                     }
	                }
	                System.out.println("Square::"+si+"  "+sj + "  size  " +n );
	                return true;
	        }
	            
	            
	    }
}

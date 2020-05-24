package BinarySearch;

public class TableauSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		int [] [] grid = {{6,5,4,4,3,-2,-2,-2}
				
		};
		TableauSearch tableauSearch = new TableauSearch();
		tableauSearch.countNegatives(grid);
	}

	    public int countNegatives(int[][] grid) {
	        int c=0;
	        for(int i=0;i<grid.length;i++)
	        {
	            
	            int left =0; 
	            int right = grid[0].length -1 ;
	            boolean flag = false;
	            int mid=0;
	            System.out.println();
	            while(left<right){
	                 mid = left + (right -left )/2;
	                
	             //   System.out.print(mid+" ");
	                if(grid[i][mid]>0 && grid[i][mid+1]<0 ){
	                    flag = true;
	                    //System.out.println(grid[i][mid+1]);
	                    break;
	                }
	                    
	                else if(grid[i][mid]>0) 
	                    left =mid+1;
	                else
	                    right =mid-1;
	                    
	                    
	            }
	            if(flag)
	            {
	                    
	                c += (grid[0].length-(mid+1));
	                 System.out.println(c+" "+mid+1+" "+grid[0].length);
	                System.out.println(grid[i][mid+1]);
	                   System.out.println(c);
	            }
	            else if(grid[i][0]<0)
	            {
	                c += grid[0].length;
	            }
	            else if(grid[i][0]<0)
	            {
	                c += grid[0].length-1;
	            }
//	             for(int j=0;j<grid[0].length ;j++){
//	                 if(grid[i][j]<0)
//	                     c++;
//	             }
	        }
	        return c;
	    }
}

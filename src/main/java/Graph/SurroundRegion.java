package Graph;

public class SurroundRegion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] board ={ {'X', 'X' ,'X' ,'X'},
						  {'X', 'O' ,'O' ,'X'},
						  {'X', 'X' ,'O' ,'X'},
						  {'X', 'O' ,'X' ,'X'},};
		SurroundRegion
		surroundRegion = new SurroundRegion();
		surroundRegion.solve(board);
	}
	
	
	 public void solve(char[][] board) {
         util(board);
    }
    
   	public char[][] util(char[][] arr) {
		
		int r = arr.length;
		int c = arr[0].length;
	
		int count =0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(arr[i][j]=='O') {
					count++;
					foo(i,j,r,c,arr);
				}				
			}
		}
        
       	for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
                if(arr[i][j]=='Y')
                	arr[i][j]='O';
                //System.out.print(arr[i][j]);        
            }
        //System.out.println();
        }
		return arr;
	}

	
	
	
	private int foo(int i, int j, int r, int c, char[][] arr) {
		int left=0;
        int right =0;
        int down = 0;
        int up =0;
		if(i<r && j<c && i>=0 && j>=0) {
			if(arr[i][j]=='O') {
				arr[i][j]='Y';
				up=foo(i-1,j,r,c,arr);//up
				down=foo(i+1,j,r,c,arr);//down
				left=foo(i,j-1,r,c,arr);//left
				right =foo(i,j+1,r,c,arr);//right	
                if(up+left+down +right ==4)
                    arr[i][j]='X';
                return 1;
			}
			else if(arr[i][j]=='Y')
				return 0;
            else if(arr[i][j]=='X' )
                return 1;
		}
        else 
            return 0;
        
        return 0;
	}

}

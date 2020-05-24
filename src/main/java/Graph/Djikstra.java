package Graph;

public class Djikstra {

	public static void main(String[] args) {
		int[][] g= {{2,1,1},{2,3,1},{3,4,1}};
				
		int n = 4;
		int s = 2;
		Djikstra djikstra = new Djikstra();
		djikstra.GetShortestPath(g,n,s);
				
	}
	//[[2,1,1],[2,3,1],[3,4,1]]
			
	public void GetShortestPath(int[][] g , int n , int s) {
	
		int sum =0;
		int [][] adjMat = new int[n+1][n+1];
		int [] visited = new int [n+1];
		
		for(int i=0;i<g.length;i++) {
//			for(int j=0;j<n;j++) {
//				if(i==j)
//					adjMat[i][j]=0;
//				else if(j<i)
//					adjMat[i][j]=-1;
//			}
			adjMat[g[i][0]-1][g[i][1]-1] =g[i][2]; 
		}
		int t =0;
		
		int min  = Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			min  = Integer.MAX_VALUE;
			for(int j=i+1;j<n;j++) {
				if((adjMat[i][j] < min) && visited[i]!=1) {
					min = adjMat[i][j];
				//	t = j-1;
				}
				
			}
			visited[i]= 1;
			//i = t;
			if(min!=Integer.MAX_VALUE)
				sum+=min;
		
		}
		System.out.print(sum);
	}
}

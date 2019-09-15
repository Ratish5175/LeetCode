class Solution {
    public boolean validTicTacToe(String[] board) {
       	  		   int i,j,x=0,o=0;
	        ArrayList<String>  xind = new ArrayList<String>();
	        ArrayList<String>  oind = new ArrayList<String>();
			   
	        for(i=0;i<3;i++)
		   {
			   char [] arr = board[i].toCharArray();
			   for(j=0;j<3;j++)
			   {
				if(arr[j]== 'X')
					{
						x++;
						xind.add(i+"_"+j);
					}
			   
			   else if(arr[j] =='O') {
				   o++;
				   oind.add(i+"_"+j);
			   }
			   }
		   }
	        if(xind.contains("0_0") &&
	        		xind.contains("0_1")&&
	        		xind.contains("0_2")
	        		||
	        		xind.contains("1_0") &&
	        		xind.contains("1_1")&&
	        		xind.contains("1_2")
	        		||
	        		xind.contains("2_0") &&
	        		xind.contains("2_1")&&
	        		xind.contains("2_2")
	        		||
	        		xind.contains("0_0") &&
	        		xind.contains("1_1")&&
	        		xind.contains("2_2")
	        		||
	        		xind.contains("2_0") &&
	        		xind.contains("1_1")&&
	        		xind.contains("0_2")
	        		||
	        		xind.contains("0_0") &&
	        		xind.contains("1_0")&&
	        		xind.contains("2_0")
	        		||
	        		xind.contains("0_1") &&
	        		xind.contains("1_1")&&
	        		xind.contains("2_1")
	        		||
	        		xind.contains("0_2") &&
	        		xind.contains("1_2")&&
	        		xind.contains("2_2")
	        		)
	        {
	        	if(x==o)
	        	{
	        		return false;}
	        }
	        if(oind.contains("0_0") &&
	        		oind.contains("0_1")&&
	        		oind.contains("0_2")
	        		||
	        		oind.contains("1_0") &&
	        		oind.contains("1_1")&&
	        		oind.contains("1_2")
	        		||
	        		oind.contains("2_0") &&
	        		oind.contains("2_1")&&
	        		oind.contains("2_2")
	        		||
	        		oind.contains("0_0") &&
	        		oind.contains("1_1")&&
	        		oind.contains("2_2")
	        		||
	        		oind.contains("2_0") &&
	        		oind.contains("1_1")&&
	        		oind.contains("0_2")
	        		||
	        		oind.contains("0_0") &&
	        		oind.contains("1_0")&&
	        		oind.contains("2_0")
	        		||
	        		oind.contains("0_1") &&
	        		oind.contains("1_1")&&
	        		oind.contains("2_1")
	        		||
	        		oind.contains("0_2") &&
	        		oind.contains("1_2")&&
	        		oind.contains("2_2")
	        		)
	        {
	        	if(o-x<0)
	        	{
	        		return false;}
	        }
		   if(x==o || x-o==1)
			   return true;
		   else if (o>x)
			   return false;
		   return false;
    }
}
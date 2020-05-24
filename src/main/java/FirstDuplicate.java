import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class FirstDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {2, 1, 3, 5, 3, 2};
		String [] crypt = {"SEND", "MORE", "MONEY"} ;

		char [][]		solution = {{'O', '0'},
				{'M', '1'},
				{'Y', '2'},
	{'E', '5'},
{'N', '6'},
{'D', '7'},
{'R', '8'},
{'S', '9'}};
		System.out.print(isCryptSolution(crypt, solution));
		
		int nums[] = {4,3,2,7,8,2,3,1};
		FirstDuplicate fd = new FirstDuplicate();
		for(int i : fd.findDisappearedNumbers(nums))
			System.out.println(i);	
				
		List<Integer> arr = new ArrayList<Integer>();
		arr.size();
		
		int[] ar=new int [5];
		
	}
	
	
	 public  List<Integer> findDisappearedNumbers(int[] nums) {
		        for(int i =0;i<nums.length ;i++)
		        {
		            if(Math.abs(nums[i])-1>=0  && nums[Math.abs(nums[i])-1]>0)
		            {
		                nums[Math.abs(nums[i])-1] = nums[Math.abs(nums[i])-1 ] * -1 ;
		            }
		        }
		        List <Integer> res = new ArrayList<Integer>();
		        for(int i =0;i<nums.length ;i++)
		        {
		            if(nums[i]>0)
		                res.add(i+1);
		        }
		        return res;
		    }
	static boolean isCryptSolution(String[] crypt, char[][] solution) {

		// prepare the hash map 
		HashMap <Character, Character> sol = new HashMap<>();
		    for(int i=0;i<solution.length;i++){
		        sol.put(solution[i][0],solution[i][1]);
		    }
		    String []var1= new String[3];
		    
		    for(int i=0;i<crypt.length;i++){
		    	var1[i]="";
		        for(int j=0;j<crypt[i].length();j++){
		            var1[i] = var1[i] +""+sol.get(crypt[i].charAt(j));
		        }
		    }
		    int a = Integer.parseInt(var1[0]);
		    int b = Integer.parseInt(var1[1]);
		    int c = Integer.parseInt(var1[2]);
		    if((a+b == c)  && !var1[0].startsWith("0") && !var1[1].startsWith("0"))  
		    {
		        return true;
		    }
		    else
		     return false;
		}

}
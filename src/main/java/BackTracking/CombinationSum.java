package BackTracking;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class CombinationSum {

	HashSet<List<Integer>> res = new HashSet<List<Integer>>();
	
//	Stack <Integer> out = new Stack<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10,1,2,7,6,1,5};
		int target = 8;
		CombinationSum combinationSum = new CombinationSum();
		for(List<Integer> test :combinationSum.combinationSum(arr, target))
		{
			for(Integer i :test ) {
				System.out.print(i);
			}
			System.out.println();
		}
	
	}

	

	private void combinationSum(int [] candidates, Stack<Integer> out,
								int start, int target){
		int n = candidates.length;
		for(int i=start; i<n; ++i){
			if(candidates[i] <= target){
				
//				newVec.addAll(vec);
//				newVec.add(candidates[i]);
//				
				out.add(candidates[i]);
				// Try a new combination, one could repeat itself again, so start from "i", instead of "i+1" 
				combinationSum(candidates, out, i+1, target-candidates[i]);
				out.pop();
			}else if( target==0){

				// Found a combination
				//LinkedList<Integer> newVec = new LinkedList<Integer>();
				Stack<Integer> r = new Stack<Integer>();
				r.addAll(out);
				res.add(r);
				return;
//				newVec.add(candidates[i]);
//				res.add(newVec);
			}else{
				// candidates[i] > target, no need to continue
				return;
				
			}
		}
	}

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);
		List<List<Integer>> vec = new LinkedList<List<Integer>>();
		Stack<Integer> out = new Stack<Integer>();
		this.combinationSum(candidates, out, 0, target);
		for(List<Integer> test :res)
		{
			vec.add(test);
		}
		return vec;
	}
}

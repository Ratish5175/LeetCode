import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class ContSubSum {

	public static int countSubSequence(List<Integer> inputSeq, int targetSum) {
	
		int count =0, sum =0;
		for (int i=0;i<inputSeq.size();i++) {
			 sum +=inputSeq.get(i);
			 if(sum==targetSum) {
				 sum =0;
				 count++;
			}
		}
		
		return count;
	}
	public static void main(String[] args) {
		ContSubSum contSubSum = new ContSubSum();
		List<Integer> inputSeq = new ArrayList<Integer>();
		inputSeq.add(6);
		inputSeq.add(2);
		inputSeq.add(4);
		inputSeq.add(1);
		inputSeq.add(5);
		System.out.print(countSubSequence(inputSeq, 6));
	}
}

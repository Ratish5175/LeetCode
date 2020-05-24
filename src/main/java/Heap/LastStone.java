package Heap;

public class LastStone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {0,2,7,4,1,8,1};
		LastStone lastStone = new LastStone();
		 lastStone.Heapify(arr, 0);
	}
	
	private int [] Heapify(int [] arr ,int i)
	{
		int largest =0, temp =0;
		if(i< arr.length && arr[2*i +1] > largest )
		{
			largest = arr[2*i+1];
		}
		else if(i< arr.length && arr[2*i +2] > largest )
		{
			largest = arr[2*i+2];	
		}
			
		if(largest!= arr[i])
		{
			temp = arr[i];
			arr[i]= largest;
			largest = temp;
			Heapify(arr, i);
		}
		return arr;
	}
	private int[] CreateHeap(int [] arr )
	{
		int max =0;
		int left =0, right=0 , root=0;
		for(int i=1;i<arr.length/2;i++)
		{
			root = arr[i];
			left = arr[2*i+1];
			right = arr[2*i + 2];
		
			if(left>root && left > max)
			{
				max = left;
			}
			else if(right>root && right > max)
			{
				max = right;
			}
			
			if(max!=root) {
				
				
			}
		}
		return arr;
	}

}

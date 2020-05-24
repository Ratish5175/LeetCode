package BinarySearch;

public class SearchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="32 45 76 89 129";
		System.out.print(search(s,32));
	}

	private static String search(String s, int i) {
		// TODO Auto-generated method stub
		String str ="";
		int left =0;
		int right = s.length()-1;
		while(left<right) {
			str="";
			int mid = left + (right - left)/2;
			if(s.charAt(mid)==' ') {
				mid=mid+1;
			}
			for(int j = mid-1 ;j>=0 && s.charAt(j)!=' ' ;j--) {
				str=s.charAt(j)+str;
			}
			for(int j = mid ;j<s.length() && s.charAt(j)!=' '  ;j++) {
				str=str+s.charAt(j);
			}
			
			
			
			if(Integer.parseInt(str)==i) {
				return str;
			}
			else if(Integer.parseInt(str) <i) {
				left= mid+1;
			}
			else
			{
				right = mid -1;
			}
			
		}
		return "-1";
	}
}

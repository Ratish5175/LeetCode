import java.util.HashSet;

public class HappyNumber {

	public static void main(String[] args) {

		HappyNumber happyNumber = new HappyNumber();
		for(int i=0;i<1000;i++) {
			boolean res = happyNumber.isHappy(i);
			if(res)
				System.out.println(i+"="+res);
		}			
	}

	
	public boolean isHappy(int n) {
		String str = String.valueOf(n);	
		int len = str.length();
		HashSet<Integer> lookup = new HashSet<Integer>();
		int num = 0;
		while(true) {		
			num =0;
			for(int i=0;i<len;i++) {
				int a = Integer.parseInt(String.valueOf(str.charAt(i)));			
				num = num +(a*a);
			}
			if(lookup.contains(num))
				return false;
			lookup.add(num);
			str = String.valueOf(num);
			if(str.equals("1"))				
				return true;
			//System.out.println(str);
			len = str.length();
		}
	}
}

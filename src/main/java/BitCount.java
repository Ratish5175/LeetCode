import java.math.BigInteger;

public class BitCount {


	public static String fact(int n){
		BigInteger f = new BigInteger("1");
		for(int i=2;i<=n;i++)
			f=f.multiply(BigInteger.valueOf(i));
		return f.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="512 4";
		String[] s = str.split("\\s+");
		
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		
		while(b>0) {
			b--;
			if(a%10==0)
				a= a/10;
			else
				a--;
		}
		System.out.println(fact(5));
	}

}

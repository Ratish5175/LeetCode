import java.util.Arrays;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abc";
		Permutation permutation = new Permutation();
		System.out.print(permutation.checkInclusion("ab", "eibaooo"));
	//	for(int i=0;i<s.length();i++)
			permutation.perm(s.toCharArray(), 0, s.length());
		
	}

	public void perm (char[] s , int a , int n)
	{
		
		if(a>=n-1)
		{
			System.out.println(s);
			return ;
		}
		else if(a<n-1) 
		{
			perm(s,a+1,n);
			System.out.println(s);
			char temp = s[a];
			s[a] = s[a+1];
			s[a+1]=temp;
			//System.out.println(s);
			perm(s,a+1,n);
			
			
		}
	}
	public boolean checkInclusion(String s1, String s2) {
        char[] t1 = s1.toCharArray();
        char[] t2 = s2.toCharArray();
		Arrays.sort(t1);
        Arrays.sort(t2);
        String a=""; 
        String b ="";
        for(int i=0;i<t1.length;i++)
        	a=a+t1[i];
        for(int i=0;i<t2.length;i++)
        	b=b+t2[i];
        
        if(t1.length>t2.length && a.contains(b)) {
        		return true;
        }
        else if (t2.length>= t1.length && b.contains(a))
        		return true;
        else
        	return false;
    }
}

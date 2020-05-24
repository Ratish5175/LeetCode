
public class FormAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a= {' ','o','p',' '};
		for(int i=0;i<26 ;i++) {
			a[0]= (char) (i+'a');
			for(int j=0;j<26;j++) {
				a[3] = (char) (j+'a');
				System.out.println(new String(a));
			}
		//	System.out.println(new String(a));
		}
	}


}

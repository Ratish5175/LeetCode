import java.util.Arrays;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char [] chars= {'a','a','b','b','c','c','c'};
		String s="1";
		String.valueOf(Integer.valueOf(s)-1);
		StringCompression stringCompression = 
				new StringCompression();
		for(int i=0;i<stringCompression.compress(chars);i++)
			System.out.print(chars[i]);
	}
	 public int compress(char[] chars) {
		 Arrays.sort(chars);
		 int count =0;
		 int j=0;
		 for(int i=0;i<chars.length-1;i++)
		 {
			 if(chars[i]==chars[i+1])
				 count++;
			 else
			 {
				if(count >=1) {
					chars[j++]= chars[i];
					for(char c :String.valueOf(count+1).toCharArray())
						{
							chars[j]= c;
							j++;
						}
				}
				 
				 count =0;
			 }
		 }
		 if(count >=1) {
			 chars[j++]= chars[chars.length-1];
				for(char c :String.valueOf(count+1).toCharArray())
					{
						chars[j]= c;
						j++;
					}
			}
		 if(chars.length< j+1)
			 return chars.length;
		 return j+1;
	 }

}

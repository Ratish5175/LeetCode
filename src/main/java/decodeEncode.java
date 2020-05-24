
public class decodeEncode {

	
	 static String secureChannel(int operation, String message, String key) {

		 char [] str = message.toCharArray();
		 char [] ktr = key.toCharArray();
		 String res ="";
		 int count =0,i=0;
		 if(message.isEmpty())return "-1";
		 if(operation==1) {
			 for( i =0;i<str.length;i++)
			 {
				 if(count==ktr.length)break;
				 for(int j=0;j<Character.getNumericValue(ktr[count]);j++)
				 {
					 res = res + str[i];
				 }
				 count++;
			 }
			 while(i<str.length)
			 {
				 res = res + str[i++];
			 }
		 }
		 else if(operation==2) {
			 for( i =0;i<str.length;i++)
			 {
				 int j=0;
				 if(count<ktr.length)
				 {
					 j=i+Character.getNumericValue(ktr[count++])-1;
					 res = res + str[j];
					 i=j;
				 }
				 else 
					 res = res + str[i];
			 }
		 }
		 return res;
	    }
	
	public static void main(String [] args) {
		System.out.print(secureChannel(2, "oppeeen", "123"));
	}
}

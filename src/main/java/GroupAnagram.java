import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] str = {"eat","tea","tan","ate","nat","bat"};
		
		
		GroupAnagram groupAnagram = new GroupAnagram();
		groupAnagram.groupAnagrams(str);
	}
	
	 public List<List<String>> groupAnagrams(String[] str) {
	     
	        HashMap<String,List<String>> lookup = new HashMap<String,List<String>>();
	        int n = str.length;
	        for(int i=0;i<n;i++){
	            char[] t = str[i].toCharArray();
	            
	            Arrays.sort(t);
	            List<String> temp ;
	            if(lookup.get(new String(t))!=null)
	                temp = lookup.get(new String(t));
	            else
	                temp = new ArrayList<String>();
	            temp.add(str[i]);
	            lookup.put(new String(t), temp);
	        }
	        List<List<String>> res = new ArrayList<List<String>>();
	        for(String item : lookup.keySet()) {
	        	res.add(lookup.get(item));
	        }
	        
	        
	        return res;
	    }

}

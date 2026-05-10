package Strings;
import java.util.Scanner;
public class Anagrams {

	public void tellAnagrams(String str,String arr) {
		boolean flag=true;
		
		StringBuilder sb=new StringBuilder(str);
		
		if(str.length()==arr.length()) {
			
			for(int i=0;i<arr.length();i++) {
				
				for(int j=0;j<sb.length();j++) {
					
					if(arr.charAt(i)!=sb.charAt(j)) {
						flag=false;
					}else {
					sb.setCharAt(j, '0');
						flag=true;
						break;
					}
					
				}
				if(!flag) {
					break;
				}
				
			}
			
			
		}else {
			flag=false;
		}
		
		if(flag) {
			System.out.println("String is a Anagrams");
		}else {
			System.out.println("String is not a Anagrams");
		}
		
	}
	
}
class TestStr{
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String arr="heart";
		

		System.out.print("Enter a string to see "+arr+" the word is anagrams or not: ");
		String str=sc.next();
		
		Anagrams a=new Anagrams();
		
		a.tellAnagrams(str,arr);
		
	}
	
}
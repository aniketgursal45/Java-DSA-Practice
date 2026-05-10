package Strings;

public class StringCompression {

	public void strCompression(String str) {
		
		StringBuilder sb=new StringBuilder("");
		
		char ch=str.charAt(0);
		sb.append(ch);
		int c=1;
		
		for(int i=1;i<str.length();i++) {
			
			
			if(ch==str.charAt(i)) {
				c++;
			}else if(ch!=str.charAt(i)) {
				ch=str.charAt(i);
				
				if(c>1) {
					sb.append(c);
					c=1;
				}
				sb.append(ch);
			}
			
		}
		sb.append(c);
		
		System.out.println(sb);
		
	}
	
	
}

class TestStrC{
	
	public static void main(String[] args) {
		
		String str= "aaabbcccdd";
	
		StringCompression s=new StringCompression();
		
		s.strCompression(str);
		
	}
	
}
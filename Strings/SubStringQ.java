package Strings;

public class SubStringQ {

	public void printSubString(String n) {
		
		System.out.println(n.substring(0, 3));
		
	}
	
	
	public void createMSubstring(String n,int sI,int eI) {
		
		String c="";
		
		for(int i=sI;i<eI;i++) {
			
			c=c+n.charAt(i);
		}
		
		System.out.println("SubString is: "+c);
	}
	
}

class TestSubString{
	
	public static void main(String[] args) {
		
		String name="HelloWorld";
		
		SubStringQ s1=new SubStringQ();
		
		s1.printSubString(name);
		
		s1.createMSubstring(name, 3, 6);
		
	}
	
}

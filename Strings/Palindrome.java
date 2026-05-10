package Strings;
import java.util.Scanner;

public class Palindrome {
	
	public boolean checkPal(String n) {
		
		for(int i=0;i<n.length()/2;i++) {
			int j=n.length();
			if(n.charAt(i)!=n.charAt(j-1-i)) {
				return false;
			}
			
		}
		
		return true;
		
	}

}

class TestP{
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("Enter a String to see it is Palindrome or Not:- ");
		String name=sc.next();
		
		Palindrome p1=new Palindrome();
		
		boolean res=p1.checkPal(name);
		
		if(res) {
			System.out.println("String is a Palindrome");
		}else {
			System.out.println("String is not a Palindrome");
		}
		
	}
	
}

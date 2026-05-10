package Strings;
import java.util.Scanner;

public class lowercasevowelsCount {

	public void printCount(String str) {
	
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='a' ||str.charAt(i)=='e' || str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u') {
				count++;
			}
			
		}
		
		System.out.println("Count of lowerCase vowel is: "+count);
		
	}
	
}
class TestLowerVC{
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a string to see count of lower case vowel you enter: ");
		String str=sc.nextLine();
		
		lowercasevowelsCount v=new lowercasevowelsCount();
		
		v.printCount(str);
	}
	
}

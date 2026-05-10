package Strings;

public class LargestString {
	
	public void findLargString(String[] fruits) {
		
		String lar=fruits[0];
		
		for(int i=0;i<fruits.length;i++) {
			
			if(lar.compareTo(fruits[i])<0) {
				lar=fruits[i];
			}
			
		}
		
		System.out.println("Largest String is: "+lar);
		
	}

}
class TestLarg{
	
	public static void main(String[] args) {
		
		String[] fruits= {"apple","mango","banana"};
		
		LargestString l1=new LargestString();
		
		l1.findLargString(fruits);
		
	}
	
}

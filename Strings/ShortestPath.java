package Strings;

public class ShortestPath {

	public void findSPath(String dir) {
		
		int x=0,y=0;
		
		for(int i=0;i<dir.length();i++) {
			
			
			
			char d=dir.charAt(i);
			
			if(d=='W') {
				x--;
			}else if(d=='E') {
				x++;
			}else if(d=='N') {
				y++;
			}else if(d=='S'){
				y--;
			}
			
		}
		int x2=x*x;
		int y2=y*y;
		
		double res=Math.sqrt(x2+y2);
		
		System.out.println("Shortest Path is:- "+res);
		
		
		
	}
	
}
class TestS{
	
	public static void main(String[] args) {
		
		String dir= "WNEENESENNN";
		
		
		ShortestPath s1=new ShortestPath();
		s1.findSPath(dir);
	}
	
}
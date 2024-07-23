package twodarray;

public class Spiralpractice {
	public static void main(String[] args) {
		int[][] a=spiral(5);
		for(int[] row:a) {
			for(int n:row) {
				System.out.print(n+"\t");
			}
			System.out.println();
		}
	}
	public static int[][] spiral(int size){
		int[][] a=new int[size][size];
		int c=-1;
		int r=0;
		char dir='r';
		for(int i=1;i<=size*size;i++) {
			switch(dir) {
			case 'r':
				c++;
				a[r][c]=i;
				if(c==size-1 ||a[r][c+1]!=0) 
					dir='d';
				break;
			case 'd':
				r++;
				a[r][c]=i;
				if(r==size-1 || a[r+1][c]!=0)
					dir='l';
				break;
			case'l':
				c--;
				a[r][c]=i;
				if(c==0 || a[r][c-1]!=0)
					dir='u';
				break;
			case'u':
				r--;
				a[r][c]=i;
				if(a[r-1][c]!=0)
					dir='r';
				
				
				
			}
			
		}
		return a;
		
	}

}

package twodarray;

public class Pascal {
	public static void main(String[] args) {
		int[][] a=pascle(5);
		int spaces=10;
		for(int[] row:a) {
			for(int i=1;i<spaces;i++) {
				System.out.print(" ");
				
			}
			for(int n:row) {
				System.out.print(n+" ");
			}
			System.out.println();
			spaces--;
		}
		
	}
	public static int[][] pascle(int size) {
		int[][] a=new int[size][];
		for(int i=0;i<size;i++) {
			a[i]=new int[i+1];
			for(int j=0;j<=i;j++) {
				if(i==j || j==0) {
					a[i][j]=1;
				}
				else {
					a[i][j]=a[i-1][j-1]+a[i-1][j];
				}
			}
		}
		return a;
	}

}

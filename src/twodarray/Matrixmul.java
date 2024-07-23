package twodarray;

public class Matrixmul {
	public static void main(String[] args) {
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] b= {{3,2,1},{6,5,4},{9,8,7}};
		int[][] c=new int[a.length][a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				for(int k=0;k<a.length;k++) {
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		for(int[] row:c) {
			for(int n:row) {
				System.out.print(n+"\t");
			}
			System.out.println();
			
		}
	}

}

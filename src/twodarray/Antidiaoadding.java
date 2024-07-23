package twodarray;

public class Antidiaoadding {
	public static void main(String[] args) {
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] b= {{3,2,1},{6,5,4},{9,8,7}};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i][i];
			if(a.length%2!=0 &&i==a.length/2) {
				continue;
			}
			sum+=a[i][a.length-1-i];
		}
		System.out.println(sum);
	}

}

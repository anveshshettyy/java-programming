package PatterCreation.Exercise;

public class Pattern62 {
    public static void main(String args[]) {
		int n=15,i=0,j=0;
		for(i=0;i<20;i++) {
			for(j=0;j<n;j++) {
				if((j<=n-1&&i<=n/4)||(j<=n/4&&i<=n/2)||(i==n/2||j<=n-1&&i>=n/2&&i<=3*n/4)||(j>=3*n/4&&i>=n/2)||(i>=n)) {
					System.out.print("0 ");
				}
				else System.out.print("  ");
			}
			System.out.println();
		}
	}
}

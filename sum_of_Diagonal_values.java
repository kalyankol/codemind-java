import java.util.*;
class Multiarray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[][],row,col,i,j;
		row=sc.nextInt();
		col=sc.nextInt();
		a=new int[row][col];
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int s=0;
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				if(i==j) {
					s+=a[i][j];
				}
				if(i+j==row-1 && i!=j) {
					s+=a[i][j];
				}
			}
		}
		System.out.print(s);
	}
}

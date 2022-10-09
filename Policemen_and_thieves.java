import java.util.*;
class Multiarray{
	public static int catcher(char[] a,int k) {
		int c=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]=='P' && a[j]=='T' && Math.abs(j-i)<=k) {
					c+=1;
					a[i]='s';
					a[j]='s';
				}
			}
		}
		return c;
	}
	public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=0;k<t;k++){
            int n=sc.nextInt();
            int d=sc.nextInt();
            char[][] a=new char[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    a[i][j]=sc.next().charAt(0);
                }
            }
            int c=0;
            for(int i=0;i<n;i++) {
            	c+=catcher(a[i],d);
            }
            System.out.println(c);
        }
    }
}
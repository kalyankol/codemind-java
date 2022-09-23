import java.util.*;
class Arraycount {
	public static int count(int n,int [] a,int k) {
		int c=0;
		for(int i=0;i<n;i++) {
			if(a[i]==k) {
				c+=1;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		//Arrays.sort(a);
		int c=-1;
		for(int i=0;i<n;i++) {
			if(count(n,a,a[i])==k) {
				System.out.printf("%d ",a[i]);
				a[i]-=a[i];
				c=0;
			}
		}
		if(c!=0){
		    System.out.print(c);
		}
	}
}

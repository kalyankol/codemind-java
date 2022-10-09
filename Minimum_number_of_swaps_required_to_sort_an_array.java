import java.util.*;
class Multiarray{
	public static int min(int a[],int k) {
		int j=k;
		for(int i=k;i<a.length;i++) {
			if(a[i]<a[j]) {
				j=i;
			}
		}
		return j;
	}
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int temp=0,c=0,j;
        for(int i=0;i<n;i++){
        	j=min(a,i);
            if(a[j]!=a[i]) {
            	temp=a[j];
            	a[j]=a[i];
            	a[i]=temp;
            	c+=1;
            }
        }
        System.out.println(c);
        /*for(int i=0;i<n;i++) {
        	System.out.print(a[i]+" ");
        }*/
    }
}
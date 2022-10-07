import java.util.*;
class Multiarray{
	public static long max(long a[],long k){
        long max=a[(int)k+1];
        for(long i=k+1;i<a.length;i++){
            if(a[(int)i]>max){
                max=a[(int)i];
            }
        }
        return max;
    }
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long[] a=new long[(int)n];
        for(long i=0;i<n;i++){
            a[(int)i]=sc.nextLong();
        }
        for(long i=0;i<n;i++){
        	if(i==n-1){
                System.out.print("-1"+" ");
            }
            else{
                System.out.print(max(a,i)+" ");
            }
        }
    }
}
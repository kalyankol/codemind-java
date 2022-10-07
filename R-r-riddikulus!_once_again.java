import java.util.*;
class Multiarray{
	public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long k=sc.nextLong();
        long[] a=new long[(int)n];
        for(long i=0;i<n;i++){
            a[(int)i]=sc.nextLong();
        }
        for(long i=k;i<n;i++){
            System.out.print(a[(int)i]+" ");
        }
        for(int i=0;i<k;i++){
            System.out.print(a[i]+" ");
        }
    }
}
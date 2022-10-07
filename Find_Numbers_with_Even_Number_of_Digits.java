import java.util.*;
class even{
    public static long dig(long n){
        long c=0;
        long r;
        while(n!=0){
            r=n%10;
            c+=1;
            n=n/10;
        }
        return c;
    }
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] a=new long[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(dig(a[i])%2==0){
                c+=1;
            }
        }
        System.out.print(c);
    }
}
import java.util.*;
class primes{
    public static boolean prime(int n){
        boolean c=true;
        if(n<=1){
            c=false;
        }
        else{
            for(int i=2;i<=(int)Math.sqrt(n);i++){
                if(n%i==0){
                    c=false;
                    break;
                }
            }
        }
        return c;
    }
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int c=0;
        boolean prime;
        for(int i=n;i<=m;i++){
            prime=prime(i);
            if(prime){
                c+=1;
            }
        }
        System.out.print(c);
    }
}
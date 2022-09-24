import java.util.*;
class primes{
    public static boolean prime(int n){
        boolean p=true;
        if(n<=1){
            p=false;
        }
        else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    p=false;
                    break;
                }
            }
        }
        return p;
    }
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        //boolean p;
        for(int i=a+1;i<b;i++){
            if(prime(i)){
                System.out.println(i);
            }
        }
    }
}
import java.util.*;
class primepal{
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
    public static boolean pal(int n){
        int r,rem=0,a=n;
        while(n!=0){
            r=n%10;
            rem=(rem*10)+r;
            n=n/10;
        }
        if(rem==a){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean p,p1;
        while(true){
            n+=1;
            p=prime(n);
            p1=pal(n);
            if(p && p1){
                System.out.print(n);
                break;
            }
        }
    }
}
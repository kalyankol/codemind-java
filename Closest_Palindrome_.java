import java.util.*;
class palins{
    public static boolean pal(int n){
        int r,rem=0;
        int a=n;
        while(a!=0){
            r=a%10;
            rem=(rem*10)+r;
            a=a/10;
        }
        if(rem==n){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=n,c=n;
        int b,f;
        while(true){
            n-=1;
            if(pal(n)){
                b=n;
                break;
            }
        }
        while(true){
            c+=1;
            if(pal(c)){
                f=c;
                break;
            }
        }
        if(Math.abs(a-f)<Math.abs(a-b)){
            System.out.println(f);
        }
        else if(Math.abs(a-f)==Math.abs(a-b)){
            System.out.print(b+" ");
            System.out.print(f);
        }
        else{
            System.out.println(b);
        }
    }
}
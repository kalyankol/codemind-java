import java.util.*;
class fib{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c=2;
        int d;
        System.out.print(a+" ");
        System.out.print(b+" ");
        while(true){
            d=a+b;
            c+=1;
            if(c>n){
                break;
            }
            System.out.print(d+" ");
            a=b;
            b=d;
        }
    }
}
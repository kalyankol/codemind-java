import java.util.*;
class selfdividenum{
    public static boolean self(int n){
        boolean p=true;
        int r,a=n;
        while(n!=0){
            r=n%10;
            if(r==0 || a%r!=0){
                p=false;
            }
            n=n/10;
        }
        return p;
    }
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
            if(self(i) && i!=0){
                System.out.print(i+" ");
            }
        }
    }
}
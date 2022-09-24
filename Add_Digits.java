import java.util.*;
class adddigits{
    public static int add(int n){
        int s=0,r;
        while(n!=0){
            r=n%10;
            s+=r;
            n=n/10;
        }
        return s;
    }
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        while(true){
            c=add(n);
            if(c<10){
                System.out.print(c);
                break;
            }
            n=c;
        }
    }
}
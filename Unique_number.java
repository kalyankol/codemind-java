import java.util.Scanner;
import java.lang.*;
class HelloWorld {
    static int count(int n,int [] a,int t){
        int c=0;
        for(int i=0;i<n;i++){
            if(t==a[i]){
                c+=1;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=String.valueOf(n);
        int[] a=new int[str.length()];
        int r,i=0;
        while(n>0){
            r=n%10;
            a[i]=r;
            i+=1;
            n=n/10;
        }
        String sol="Unique Number";
        int c;
        for(int j=0;j<str.length();j++){
            c=count(str.length(),a,a[j]);
            if(c>1){
                sol="Not Unique Number";
                break;
            }
        }
        System.out.print(sol);
    }
}
import java.util.*;
class ssum{
    public static boolean sq(int n){
        boolean p=false;
        for(int i=1;i<=n;i++){
            if(i*i==n){
                p=true;
                break;
            }
        }
        return p;
    }
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int s=0;
        for(int i=0;i<n;i++){
            if(sq(a[i])){
                s+=a[i];
            }
        }
        System.out.print(s);
    }
}
import java.util.*;
class palin{
    public static boolean pal(int n){
        boolean p=false;
        int a=n,r,rem=0;
        while(n!=0){
            r=n%10;
            rem=(rem*10)+r;
            n=n/10;
        }
        if(a==rem){
            p=true;
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
        int c=0;
        for(int i=0;i<n;i++){
            if(pal(a[i])){
                c+=1;
            }
        }
        System.out.print(c);
    }
}
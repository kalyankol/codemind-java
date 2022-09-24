import java.util.*;
class maxdigit{
    public static int dig(int n){
        int r,s=0;
        while(n!=0){
            r=n%10;
            s+=1;
            n=n/10;
        }
        return s;
    }
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
           a[i]=sc.nextInt();
        }
        int max=a[0];
        for(int i=0;i<n;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        int d=dig(max);
        int c=0;
        for(int i=0;i<n;i++){
            if(dig(a[i])==d){
                c+=1;
            } 
        }
        System.out.print(c);
    }
}
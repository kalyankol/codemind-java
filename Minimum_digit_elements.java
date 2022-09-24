import java.util.*;
class mindigit{
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
        int min=a[0];
        for(int i=0;i<n;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        int c=0;
        int d=dig(min);
        int b;
        for(int i=0;i<n;i++){
            b=dig(a[i]);
            if(b==d){
                c+=1;
            }
        }
        System.out.print(c);
    }
}
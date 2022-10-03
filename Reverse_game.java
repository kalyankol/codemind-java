import java.util.*;
class reverse{
    public static int rev(int n){
        int r,rem=0;
        while(n!=0){
            r=n%10;
            rem=(rem*10)+r;
            n=n/10;
        }
        return rem;
    }
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(rev(a[i])+" ");
        }
    }
}
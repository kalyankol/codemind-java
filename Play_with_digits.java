import java.util.*;
class play{
    public static int sum(int n){
        int s=0;
        int r;
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
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=sum(a[i]);
        }
        System.out.print(sum);
    }
}
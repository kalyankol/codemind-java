import java.util.*;
class position{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int s=-1,l=-1;
        for(int i=0;i<n;i++){
            if(a[i]==k){
                s=i;
                break;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(a[i]==k){
                l=i;
                break;
            }
        }
        System.out.printf("%d %d",s,l);
    }
}
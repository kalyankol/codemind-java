import java.util.*;
class STock{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(i+1<n){
                if(a[i]<a[i+1]){
                    c+=(a[i+1]-a[i]);
                }
            }
        }
        System.out.println(c);
    }
}
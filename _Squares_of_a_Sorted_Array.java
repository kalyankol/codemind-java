import java.util.*;
class sort{
    public static void main(String agrs[]){
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            b[i]=a[i]*a[i];
        }
        Arrays.sort(b);
        for(int i=0;i<n;i++){
            System.out.printf("%d ",b[i]);
        }
    }
}
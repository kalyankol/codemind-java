import java.util.*;
class arr{
    public static void main(String sgra[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n/2;i++){
            System.out.print(a[i]+" "+a[i+n/2]+" ");
        }
    }
}
import java.util.*;
class sum{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int s=0;
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            s+=a[i];
        }
        System.out.print(s);
    }
}
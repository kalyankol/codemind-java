import java.util.*;
class arr{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int c=-1;
        for(int i=0;i<n;i++){
            if(a[i]==k){
                c=i;
                break;
            }
        }
        System.out.print(c);
    }
}
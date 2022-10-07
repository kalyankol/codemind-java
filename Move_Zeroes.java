import java.util.*;
class Zero{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        //Arrays.sort(a);
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                System.out.print(a[i]+" ");
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]==0){
                System.out.print(a[i]+" ");
            }
        }
    }
}
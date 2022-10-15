import java.util.*;
class abs{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int e=0,o=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                e+=a[i];
            }
            else{
                o+=a[i];
            }
        }
        System.out.print(Math.abs(e-o));
    }
}
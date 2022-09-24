import java.util.*;
class escape{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(a[i]%2!=0){
                c+=1;
            }
        }
        if(c<=2){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}
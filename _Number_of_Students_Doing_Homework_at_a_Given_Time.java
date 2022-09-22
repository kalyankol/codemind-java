import java.util.*;
class homework{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int j=0;j<n;j++){
            a[j]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] b=new int[m];
        for(int j=0;j<m;j++){
            b[j]=sc.nextInt();
        }
        int t=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++){
            if(a[i]<=t && b[i]>=t){
                c+=1;
            }
        }
        System.out.print(c);
    }
}
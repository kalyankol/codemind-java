import java.util.*;
class race{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int c=1;
            for(int i=0;i<n;i++){
                if(i-1>=0){
                    if(a[i-1]>a[i]){
                        c+=1;
                    }
                }
            }
            System.out.println(c);
        }
    }
}
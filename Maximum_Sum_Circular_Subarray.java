import java.util.*;
class Sub{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int m=a[0];
        for(int i=0;i<n;i++){
            if(m<a[i]){
                m=a[i];
            }
        }
        int m1;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                m1=0;
                for(int k=i;k<j;k++){
                   m1+=a[k];
                    if(m1>m){
                        m=m1;
                    } 
                }
            }
        }
        if(a[0]+a[n-1]>m){
            m=a[0]+a[n-1];
        }
        System.out.println(m);
    }
}
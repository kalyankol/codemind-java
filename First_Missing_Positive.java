import java.util.*;
class miss{
    public static int ch(int n,int [] a,int k){
        int c=0;
        for(int i=0;i<n;i++){
            if(a[i]==k){
                c=1;
                break;
            }
        }
        return c;
    }
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            b[i]=i+1;
        }
        for(int i=0;i<n;i++){
            if(ch(n,a,b[i])==0){
                System.out.print(b[i]);
                break;
            }
        }
    }
}
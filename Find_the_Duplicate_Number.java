import java.util.*;
class dupe{
    public static int count(int a[],int k){
        int c=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==k){
                c+=1;
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
        for(int i=0;i<n;i++){
            if(count(a,a[i])>1){
                System.out.print(a[i]);
                break;
            }
        }
    }
}
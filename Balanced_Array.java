import java.util.*;
class balance{
    public static boolean ch(int a[],int k){
        int s=0,s1=0;
        for(int i=k+1;i<a.length;i++){
            s+=a[i];
        }
        for(int i=0;i<k;i++){
            s1+=a[i];
        }
        if(s==s1){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            String s="NO";
            for(int i=0;i<n;i++){
                if(ch(a,i)){
                    s="YES";
                }
            }
            System.out.println(s);
        }
    }
}
import java.util.*;
class Multiarray{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        String s="yes";
        for(int i=0;i<n;i++){
            if(i%2!=0 && i!=n-1){
                if(i-1>=0 && i+1<n){
                    if((a[i-1]<a[i] && a[i+1]<a[i]) || (a[i-1]>a[i] && a[i+1]>a[i])){
                        continue;
                    }
                    else{
                        s="no";
                    }
                }
            }
        }
        System.out.print(s);
        
    }
}
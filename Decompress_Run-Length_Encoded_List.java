import java.util.*;
class decompress{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(i+1<=n-1){
                if(i%2==0){
                    for(int j=0;j<a[i];j++){
                        System.out.printf("%d ",a[i+1]);
                    }
                }
            }
        }
    }
}
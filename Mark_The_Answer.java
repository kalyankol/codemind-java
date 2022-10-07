import java.util.*;
class mark{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c=0;
        int s=0;
        for(int i=0;i<n;i++){
            if(a[i]<=k){
                c+=1;
            }
            if(a[i]>k){
               s+=1;
               if(s==1){
                   continue;
               }
               else{
                   break;
               }
            }
        }
        System.out.print(c);
    }
}
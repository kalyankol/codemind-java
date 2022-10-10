import java.util.*;
class count22{
    public static int count(int a[],int k){
        int c=0;
        for(int i=0;i<a.length;i++){
            if(k!=-1 && a[i]==k){
                c+=1;
            }
        }
        return c;
    }
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int[] b=new int[m];
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(count(a,a[i])>1){
                a[i]=-1;
            }    
        }
        for(int i=0;i<m;i++){
            if(count(b,b[i])>1){
                b[i]=-1;
            }    
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(count(a,a[i])==1 && count(b,a[i])==0){
                c+=1;
            }
        }
        for(int i=0;i<m;i++){
            if(count(b,b[i])==1 && count(a,b[i])==0){
                c+=1;
            }
        }
        System.out.print(c);
    }
}
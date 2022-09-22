import java.util.Scanner;
class umn{
    public static int count(int n,int [] a,int k){
        int c=0;
        for(int i=0;i<n;i++){
            if(a[i]==k){
                c+=1;
            }
        }
        return c;
    }
    public static int max(int n,int [] a){
        int max=a[0];
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        if(max==0){
            max=-1;
        }
        return max;
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
            if(count(n,a,a[i])==1){
                b[i]=a[i];
            }
            else{
                b[i]=0;
            }
        }
        System.out.printf("%d ",max(n,b));
    }
}
import java.util.Scanner;
class arr{
    public static int count(int n,int k,int [] a){
        int c=0;
        for(int i=0;i<n;i++){
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
        int c=0;
        for(int i=0;i<n;i++){
            if(count(n,a[i],a)==1){
                System.out.printf("%d ",a[i]);
                c+=1;
            }
        }
        if(c==0){
            System.out.print("-1");
        }
    }
}
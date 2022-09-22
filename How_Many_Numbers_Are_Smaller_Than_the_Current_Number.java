import java.util.Scanner;
class min{
    public static int mini(int n,int [] a,int k){
        int c=0;
        for(int i=0;i<n;i++){
            if(a[i]<k){
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
            c=mini(n,a,a[i]);
            System.out.printf("%d ",c);
        }
    }
}
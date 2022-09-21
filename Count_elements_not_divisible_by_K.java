import java.util.Scanner;
class ck{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(a[i]%k!=0){
                c+=1;
            }
        }
        System.out.print(c);
    }
}
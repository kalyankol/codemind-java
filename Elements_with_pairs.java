import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int t=n-1;
        if(n%2==0){
            for(int i=0;i<=n;i++){
                System.out.printf("%d ",a[i]);
            }
        }
        else{
            for(int i=0;i<=n;i++){
            if(i==n){
                System.out.print("0");
            }
            else{
                System.out.printf("%d ",a[i]);
                }
            }
        }
    }
}

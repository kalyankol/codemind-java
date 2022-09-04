import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int f=sc.nextInt();
        int l=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++){
            if(a[i]>=f && a[i]<=l){
                continue;
            }
            else{
                c+=1;
                System.out.printf("%d ",a[i]);
            }
        }
        if(c==0){
            System.out.print("-1");
        }
    }
}
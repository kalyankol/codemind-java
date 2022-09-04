import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++){
            if(a[i]==t){
                c+=1;
            }
        }
        System.out.print(c);
    }
}
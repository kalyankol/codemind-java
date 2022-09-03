import java.util.Scanner;
class HelloWorld {
    static boolean prime(int n){
        boolean isprime=true;
        if(n<=1){
            isprime=false;
        }
        else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    isprime=false;
                    break;
                }
            }
        }
        return isprime;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        boolean prime;
        int sum=0;
        int c=0;
        for(int i=0;i<n;i++){
            prime=prime(a[i]);
            if(prime){
                c+=1;
                sum+=a[i];
            }
        }
        System.out.printf("%.2f",(double)sum/c);
    }
}
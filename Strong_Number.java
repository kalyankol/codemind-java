import java.util.Scanner;
class HelloWorld {
    static int fact(int n){
        int fact=1;
        for(int i=n;i>=1;i--){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int r,a=n;
        while(n>0){
            r=n%10;
            sum+=fact(r);
            n=n/10;
        }
        if(a==sum){
            System.out.print("The number "+a+" is a strong number");
        }
        else{
            System.out.print("The number "+a+" is not a strong number");
        }
    }
}
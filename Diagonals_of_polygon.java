import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int n=a*(a-3)/2;
       System.out.print(n);
    }
}
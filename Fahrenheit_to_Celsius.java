import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int f=sc.nextInt();
       int c=((f-32)*5);
       System.out.printf("%.2f",(double)c/9);
    }
}
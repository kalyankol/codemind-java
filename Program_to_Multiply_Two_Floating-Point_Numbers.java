import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        double c=a*b;
        System.out.printf("%.2f",c);
    }
}
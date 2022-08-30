import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int r=scanner.nextInt();
        double a=3.14*r*r;
        System.out.printf("%.2f",a);
    }
}
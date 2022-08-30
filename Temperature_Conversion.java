import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int c=scanner.nextInt();
        double f=32+c*1.8;
        System.out.printf("%.2f",f);
    }
}
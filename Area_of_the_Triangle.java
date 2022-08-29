import java.util.Scanner;
import java.lang.Math;
class areatriangle{
    public static void main(String agrs[]){
        Scanner scanner=new Scanner(System.in);
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        double c=scanner.nextDouble();
        double s=(a+b+c)/2;
        double A=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",A);
    }
}
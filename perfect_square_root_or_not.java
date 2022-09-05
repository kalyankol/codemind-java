import java.util.Scanner;
import java.lang.Math;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s="False";
        double sq=Math.sqrt(n);
        int sr=(int)sq*(int)sq;
        if(sr==n){
            s="True";
        }
        System.out.print(s);
    }
}
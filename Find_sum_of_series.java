import java.util.Scanner;
import java.lang.Math;
class hello{
    public static void main(String[] agrs){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        double sum=0;
        for(int i=1;i<=n;i++){
            sum+=Math.pow(i,-1);
        }
        System.out.printf("%.2f",sum);
    }
}
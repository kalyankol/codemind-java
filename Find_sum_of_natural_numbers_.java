import java.util.Scanner;
class helloworld{
    public static void main(String[] agrs){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        System.out.print(sum);
    }
}
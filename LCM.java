import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int hcf=0;
        for(int i=b;i>=1;i--){
            if(a%i==0 && b%i==0){
                hcf=i;
                break;
            }
        }
        int p=a*b;
        System.out.printf("%d",(p/hcf));
    }
}
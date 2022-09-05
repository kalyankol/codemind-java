import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s="prime";
        for(int i=2;i<n;i++){
            if(n%i==0){
                s="not a prime";
                break;
            }
        }
        System.out.print(s);
    }
}
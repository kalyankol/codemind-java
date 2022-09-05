import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int r=sc.nextInt();
       for(int i=1;i<=r;i++){
           if(i%2!=0){
               System.out.printf("%d x %d = %d
",n,i,n*i);
           }
       }
    }
}
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int r;
       int rem=0;
       while(n>0){
           r=n%10;
           rem=(rem*10)+r;
           n=n/10;
       }
       System.out.print(rem);
    }
}
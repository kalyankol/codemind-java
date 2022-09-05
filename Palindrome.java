import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int rem=0;
      int r;
      int n=a;
      while(n>0){
          r=n%10;
          rem=(rem*10)+r;
          n=n/10;
      }
      if(a==rem){
          System.out.print("True");
      }
      else{
          System.out.print("False");
      }
    }
}
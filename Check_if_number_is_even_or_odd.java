import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       int number=scanner.nextInt();
       if (number%2==0){
           System.out.print("Even");
       }
       else{
           System.out.print("Odd");
       }
    }
}
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        if (a<0){
            System.out.println("Negative Number");
        }
        else{
            System.out.println("Positive Number");
        }
    }
}